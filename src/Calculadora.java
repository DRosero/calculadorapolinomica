
public class Calculadora {
	
	public Calculadora(){
			
	}
	
	
	public static Polinomio suma(Polinomio p1,Polinomio p2){
		p1=p1.ordenarDec(p1);
		p2=p2.ordenarDec(p2);
		p1=p1.completar(p1);
		p1.verPolinomio();
		p2=p2.completar(p2);
		p2.verPolinomio();
		Polinomio resultado=new Polinomio();
		if(p1.grado(p1)==p2.grado(p2)){
			for(int i=0;i<p1.getPolinomio().size();i++){
				resultado.addTermPolinomico(p1.getPolinomio().get(i).getValor()+p2.getPolinomio().get(i).getValor(),p1.getPolinomio().get(i).getExp());
			}
		}
		return resultado;
	}
    
	public static Polinomio resta(Polinomio p1,Polinomio p2){
		p1=p1.ordenarDec(p1);
		p2=p2.ordenarDec(p2);
		p1=p1.completar(p1);
		p1.verPolinomio();
		System.out.println("\n");
		p2=p2.completar(p2);
		p2.verPolinomio();
		System.out.println("\n");
		Polinomio resultado=new Polinomio();
		if(p1.grado(p1)==p2.grado(p2)){
			for(int i=0;i<p1.getPolinomio().size();i++){
				resultado.addTermPolinomico(p1.getPolinomio().get(i).getValor()-p2.getPolinomio().get(i).getValor(),p1.getPolinomio().get(i).getExp());
			}
		}
		return resultado;
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
