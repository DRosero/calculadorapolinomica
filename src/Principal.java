
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creacion de polinomios
		
		Polinomio polinomio1=new Polinomio();
		Polinomio polinomio2= new Polinomio();
		Polinomio polinomio3= new Polinomio();
		Polinomio binomio= new Polinomio();
		
		// armo el primer polinomio
		polinomio1.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio1.txt");			
		polinomio1.ordenarDec(polinomio1);
		polinomio1.verPolinomio();
		
		//armo el segundo Polinomio
		polinomio2.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio2.txt");		
		polinomio2.ordenarDec(polinomio2);
		polinomio2.verPolinomio();
		
		//armo el Tercera Polinomio
		/*polinomio3.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio3.txt");		
		polinomio3.verPolinomio();
		
		//armo el Binomio
		binomio.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/binomio.txt");		
		binomio.verPolinomio();
		
		//Calculadora
		*/Calculadora c=new Calculadora();
		
		//realizamos una suma
		Polinomio resultado1 = c.suma(polinomio1, polinomio2);		
		System.out.println("\n");
		resultado1.verPolinomio();
		
		//realizamos una resta
		Polinomio resultado2 = c.resta(polinomio1, polinomio2);		
		System.out.println("\n");
		resultado2.verPolinomio();

		//realizamos una Multiplicacion
		Polinomio resultado3 = c.producto(polinomio1, polinomio2);		
		System.out.println("\n");
		resultado3.verPolinomio();
	}

}
