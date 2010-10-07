import java.util.LinkedList;


public class Ordenar {
	
	public Ordenar(){
		
	}
	
	public static Termino menor(LinkedList<Termino> l){
		Termino aux= l.get(0);
		for(int i=0; i<l.size();i++){
			if(aux.getExp()>l.get(i).getExp()){
				aux= l.get(i);
			}
		}
		return aux;
	}
	
	public static LinkedList<Termino>   eliminar(Termino t,LinkedList<Termino> l ){
		for(int i=0;i<l.size();i++){
			if(l.get(i).getValor()==t.getValor() && l.get(i).getExp()==t.getExp()){
				l.remove(i);
			}
		}
		return l;
	}
	
	public static LinkedList<Termino> ordena(LinkedList<Termino> lista){
		LinkedList<Termino> l= new LinkedList<Termino>();
		int cont=lista.size();
		for(int i=0;i<cont;i++){
		  Termino t= menor(lista);
		  l.addFirst(t);
		  lista=eliminar(t,lista);
		}
		return l;
	}

}
