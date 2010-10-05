
public class Main {
	
	public static void main(String args[]){
		Polinomio p=new Polinomio();
		p.addTermPolinomico(2, 3);
		p.addTermPolinomico(2, 2);	
		p.addTermPolinomico(2, 5);
		System.out.println("   Antes");
		//System.out.println("Grado"+p.grado(p));
		p.verPolinomio();		
		Polinomio p2=p.ordenarDec(p);	
		p.verPolinomio();
		System.out.println("\n   Ahora ");
		p2.verPolinomio();
	}

}
