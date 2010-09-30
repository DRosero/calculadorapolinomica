import java.util.LinkedList;


public class Polinomio {
	private LinkedList<Termino> polinomio;
	
	public Polinomio(){
		polinomio = new LinkedList<Termino>();
	}
	
	public void addTermPolinomico(int valor,int exp){
		Termino t = new Termino();
		t.setValor(valor);
		t.setExp(exp);
		polinomio.add(t);
	}

	public void verPolinomio(){
		for(int i=0; i<polinomio.size();i++){
			System.out.println(polinomio.get(i).getValor()+ "^" + polinomio.get(i).getExp());
		}
	}
}
