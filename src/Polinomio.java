import java.io.BufferedReader;
import java.io.FileReader;
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
		try
		   {

		   BufferedReader reader= new BufferedReader(new FileReader(str));
		   String linea= reader.readLine();
		   while(linea!=null) {
		      
		        String [] res = linea.split("\\s+");
		        int valor = Integer.parseInt(res[0]);
		      
		        System.out.println(valor);
		        int exponente = Integer.parseInt(res[1]);


		        addTermPolinomico(valor, exponente);

		        linea= reader.readLine();
		   }
		  }
		   catch (Exception e)
		    {
		        e.printStackTrace();
		    }	        
	}
	
	
	public void addTermPolinomico(int valor,int exp){
		Termino t = new Termino();
		t.setValor(valor);
		t.setExp(exp);
		polinomio.add(t);
	}

	public void verPolinomio(){
		for(int i=0; i<polinomio.size()-1;i++){	
			System.out.print("("+polinomio.get(i).getValor()+ "X^" + polinomio.get(i).getExp()+") +");
		}
		System.out.println(polinomio.get(polinomio.size()-1).getValor()+ "X^" + polinomio.get(polinomio.size()-1).getExp());
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
					aux=aux && (p.getPolinomio().get(i).getExp()>p.getPolinomio().get(i+1).getExp());
				}
			}	    
		return aux;
	}
		
}
