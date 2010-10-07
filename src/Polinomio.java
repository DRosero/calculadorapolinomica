import java.util.LinkedList;




public class Polinomio {
	private LinkedList<Termino> polinomio;
	
	public Polinomio(){
		polinomio = new LinkedList<Termino>();
	}
	
	public void setPolinomio( LinkedList<Termino> polinomio){
		this.polinomio=polinomio;
	}
	
	public LinkedList<Termino> getPolinomio(){
		return polinomio;
	}
	
	public void makePolinomioFromFile(String str){
	    Termino t = new Termino();		
		String aux = "";
		int flag=0;
		for(int i=0 ;i<str.length(); i++){
		    char p = str.charAt(i);
			System.out.println("char"+p);
			if(p =='+'){
			   flag=0;
			}
			
			if(p =='-'){
			   flag=1;
			}
			System.out.println("-------->>>>esNumero"+esNumero(p));
			if(esNumero(p)){
			   System.out.println("acu"+p);
			   aux= aux + p;
			}
			
			if(p=='X'){
			   if(flag==1){
			      t.setValor((-1)*Integer.parseInt(aux));  
			   }
			   else{
			      System.out.println("<<<<<<<<<<<<<<<"+aux);
			      t.setValor(Integer.parseInt(aux));
				  System.out.println("<<<<<<<<<<<<<<<Valor"+t.getValor());
			   }
			   aux="";
			}
			
			if((p=='+' || p=='-' || p=='.') && i!=0 ){
			   t.setExp(Integer.parseInt(aux));			   
			   addTermPolinomico(t.getValor(),t.getExp());
			   aux="";
			}		 
		}    	
	}
	
	
	public void addTermPolinomico(int valor,int exp){
		Termino t = new Termino();
		t.setValor(valor);
		t.setExp(exp);
		polinomio.add(t);
	}

	public void verPolinomio(){
		for(int i=0; i<polinomio.size();i++){	
			System.out.print(polinomio.get(i).getValor()+ "^" + polinomio.get(i).getExp()+" | ");
		}
	}
	
	public String toString(){
		String aux="";
		for(int i=0; i<polinomio.size();i++){	
			aux= aux + polinomio.get(i).getValor()+ "X^" + polinomio.get(i).getExp()+" + ";
		}
		return aux;
	}
	
	public Polinomio ordenarDec(Polinomio p){
		Polinomio p2= new Polinomio();
		Polinomio aux=p;
		int i=0;
		while(aux.getPolinomio().size()!=0){
			if(aux.getPolinomio().size()==1){
				p2.getPolinomio().add(aux.getPolinomio().get(i));
				aux.getPolinomio().remove(i);	
			}
			else{
				if(aux.getPolinomio().get(i).getExp()>aux.getPolinomio().get(i+1).getExp()){
					p2.getPolinomio().add(aux.getPolinomio().get(i+1));
					aux.getPolinomio().remove(i+1);
				}
				else{
					p2.getPolinomio().add(p.getPolinomio().get(i));
					aux.getPolinomio().remove(i);
				}
			}	
		}
		p.setPolinomio(p2.getPolinomio());
		return p2;
	}
   	
	public int grado(Polinomio p){
		Polinomio aux=p;
		Polinomio p2=aux.ordenarDec(aux);
		return p2.getPolinomio().get(p2.getPolinomio().size()-1).getExp();
	}
	
	private boolean esNumero(char c){
	    System.out.println("Esnumero"+c);
	    return c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9';
	}
	
}
