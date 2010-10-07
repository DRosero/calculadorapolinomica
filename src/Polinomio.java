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
	
	
	
	public Polinomio ordenarDec(Polinomio p){		
		p.setPolinomio(Ordenar.ordena(p.getPolinomio()));
		return p;
	}
   	
	
	public int grado(Polinomio p){		
		return p.getPolinomio().get(0).getExp();
	}
	
	public Polinomio completar(Polinomio p){
	 p=p.ordenarDec(p);
	 for(int i=0;i<p.getPolinomio().size()-1;i++){
		 int aux=p.getPolinomio().get(i).getExp()-p.getPolinomio().get(i+1).getExp();
		 if(aux>1){
			 for(int j=0; j<aux-1;j++){
				 Termino t= new Termino();
				 t.setValor(0);
				 t.setExp(0);
				 p.getPolinomio().add(i+1,t);
			 }
		 }
	 }
	 return p;	
	}
	
	public boolean estaOrdenada(Polinomio p){
		boolean aux=true;	
			for(int i=0;i<p.getPolinomio().size()-1;i++){
				if(p.getPolinomio().get(i).getExp()!=0){
					System.out.println("------------>>>>>>Entro");
					aux=aux && (p.getPolinomio().get(i).getExp()>p.getPolinomio().get(i+1).getExp());
				}
			}	    
		return aux;
	}
	
	public String toString(){
		String aux="";
		for(int i=0; i<polinomio.size();i++){	
			aux= aux + polinomio.get(i).getValor()+ "X^" + polinomio.get(i).getExp()+" + ";
		}
		return aux;
	}
	
	private boolean esNumero(char c){
	    System.out.println("Esnumero"+c);
	    return c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9';
	}
	
}
