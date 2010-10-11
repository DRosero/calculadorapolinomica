
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creacion de polinomios
		
		Polinomio polinomio1=new Polinomio();
		Polinomio polinomio2= new Polinomio();
		Polinomio polinomio3= new Polinomio();
		Polinomio polinomio4= new Polinomio();
		
		// armo el primer polinomio
		polinomio1.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio1.txt");
		polinomio1.ordenarDec(polinomio1);		
		polinomio1.verPolinomio();
		
		//armo el segundo Polinomio
		polinomio2.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio2.txt");
		polinomio2.ordenarDec(polinomio2);
		polinomio2.verPolinomio();
		
		//Calculadora
		Calculadora c=new Calculadora();
		
		//realizamos una suma
		Polinomio resultado = c.suma(polinomio1, polinomio2);
		
		System.out.println("\n");
		resultado.verPolinomio();
		
	}

}
