
public class Calculadora {
	
	public Calculadora(){
			
	}
	
	
	public static Polinomio suma(Polinomio p1,Polinomio p2){
		Termino t3=new Termino();
		Polinomio p3=new Polinomio();
		Termino t1=p1.getPolinomio().get(0);
		Termino t2=p2.getPolinomio().get(0);
		t3.setValor(t1.getValor()+t2.getValor());
		t3.setExp(t1.getExp());
		p3.addTermPolinomico(t3.getValor(),t3.getExp());
		return p3;
	}
    
	public static Polinomio resta(Polinomio p1,Polinomio p2){
		Termino t3=new Termino();
		Polinomio p3=new Polinomio();
		Termino t1=p1.getPolinomio().get(0);
		Termino t2=p2.getPolinomio().get(0);
		t3.setValor(t1.getValor()-t2.getValor());
		t3.setExp(t1.getExp());
		p3.addTermPolinomico(t3.getValor(),t3.getExp());
		return p3;
	}
	
	public static Polinomio producto(Polinomio p1,Polinomio p2){
		return p1;
	}
	
	public static Polinomio cociente(Polinomio p1,Polinomio p2){
		return p1;
	}
	
	public static Polinomio cocienteRuffini(Polinomio p1,Polinomio p2){
		return p1;
	}
	
	public static boolean esPosibleRuffini(Polinomio p1,Polinomio p2){
		return true;
	}
}
