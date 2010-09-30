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
		return p2;
	}
	
	public int grado(Polinomio p){
		Polinomio aux=p;
		Polinomio p2=aux.ordenarDec(aux);
		return p2.getPolinomio().get(p2.getPolinomio().size()-1).getExp();
	}
	
}
