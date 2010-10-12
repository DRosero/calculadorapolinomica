import java.util.LinkedList;


public class Calculadora {
	
	public Calculadora(){
			
	}
	
	
	public Polinomio resta(Polinomio p1, Polinomio p2) {
		Polinomio neg = new Polinomio();
		neg.addTermPolinomico(-1,0);
		return suma(p1, producto(p2,neg));
    }
    
	@SuppressWarnings("unchecked")
	public Polinomio suma(Polinomio p1,Polinomio p2){		
		p1.ordenarDec(p1);
		p2.ordenarDec(p2);		
		p1.completar(p1);
		System.out.println("\n");
		p1.verPolinomio();
		System.out.println("\n");
		p2.completar(p2);
		p2.verPolinomio();
		Polinomio res = new Polinomio();
		
		if(p1.grado(p1)< p2.grado(p2)){
			res.setPolinomio((LinkedList<Termino>) (p2.getPolinomio()).clone());			
			return plus(p1,res);
		}
		else{ 
			
			res.setPolinomio((LinkedList<Termino>) (p1.getPolinomio()).clone());			
			return plus(p2,res);
		}
	}
	
	private static Polinomio plus(Polinomio menor, Polinomio mayor){
		int i=0;
		int dif = mayor.grado(mayor)-menor.grado(menor);		
		LinkedList<Termino> terminoMay = mayor.getPolinomio();
		LinkedList<Termino> terminoMen = menor.getPolinomio(); 	
		while(i <menor.grado(menor) /*&& i+dif<terminoMay.size()*/){
			if(i+dif<terminoMay.size()){
			System.out.println("Entro---->>>>>>>>>>>>><"+i+"dif "+dif);
			int valMay = (terminoMay.get(i+dif)).getValor();			
			int valMen = (terminoMen.get(i)).getValor();
			(terminoMay.get(i+dif)).setValor(valMay+valMen);
			System.out.println("Longitud---->>>>>>>>>>>>><"+terminoMay.size());
			}
			else{				
				terminoMay.add(terminoMen.get(i));	
			}
			i++;
		}
		return mayor;	
	}
	
	public Polinomio producto(Polinomio p, Polinomio q) {		 
			     
				 int valor;
				 int exp;
				 
				 Polinomio result = new Polinomio();
				 Polinomio auxi = new Polinomio();
				 	
			     if (p.estaOrdenada(p) == false){
			    	 p.ordenarDec(p);
			     }	
			     
			     if (q.estaOrdenada(q) == false ){
			    	 q.ordenarDec(q);
			     }  
			       
			     for (int i=0;i<p.getPolinomio().size();i++){
			    	 for (int j=0;j<q.getPolinomio().size();j++){
			    		 valor =(p.getPolinomio().get(i).getValor())*(q.getPolinomio().get(j).getValor());
			    		 exp =(p.getPolinomio().get(i).getExp())+(q.getPolinomio().get(j).getExp());
			    		 auxi.addTermPolinomico(valor, exp); 
			           
			    	 }
			    	 
			    	 result =   auxi;
			       }
			     result.ordenarDec(result);
			     return result;
			   
    }			  		
	
	public static Polinomio cociente(Polinomio p1,Polinomio p2){
		return p1;
	}
	
	public Polinomio Rufini(Polinomio p, Polinomio q){
        Polinomio r = new Polinomio();
        p = p.ordenarDec(p);
        p=p.completar(p);
        q = q.ordenarDec(q);
        int a = (q.getPolinomio().get(q.getPolinomio().size()-1)).getValor()*-1;
        int aux = p.getPolinomio().get(0).getValor();
        r.addTermPolinomico(aux,p.getPolinomio().get(0).getExp()-1 );
        aux = aux*a;
        for(int i=1;i<p.getPolinomio().size()-1;i++){
            aux = p.getPolinomio().get(i).getValor()+aux;
            r.addTermPolinomico(aux, p.getPolinomio().get(i).getExp()-1);
            aux = aux *a;
        }


        return r;
        // TODO code application logic here
    }
	
	public boolean EsPosibleRuffini(Polinomio p,Polinomio q){
        q = q.ordenarDec(q);
        if((q.getPolinomio().size() == 2) && (q.getPolinomio().get(0).getExp()==1)){
            return true;
        }else{
            return false;
        }
    }
}
