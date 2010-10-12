
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
		System.out.println("\n"+"Polinomio 1");
		polinomio1.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio1.txt");						
		polinomio1.verPolinomio();
		
		//armo el segundo Polinomio
		System.out.println("\n"+"Polinomio 2");
		polinomio2.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio2.txt");				
		polinomio2.verPolinomio();
		
		//armo el Tercera Polinomio
		System.out.println("\n"+"Polinomio 3");
		polinomio3.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/polinomio3.txt");		
		polinomio3.verPolinomio();
		
		//armo el Binomio
		/*binomio.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/binomio.txt");		
		binomio.verPolinomio();*/
		
		//Calculadora
		Calculadora c=new Calculadora();
		
		//realizamos una suma
		System.out.println("\n"+"Suma");
		Polinomio resultado1 = c.suma(polinomio1, polinomio2);		
		System.out.println("\n");
		resultado1.verPolinomio();
		
		//realizamos una resta
		System.out.println("\n"+"Resta");
		Polinomio resultado2 = c.resta(polinomio1, polinomio2);		
		System.out.println("\n");
		resultado2.verPolinomio();

		//realizamos una Multiplicacion
		System.out.println("\n"+"Multiplicacion");
		Polinomio resultado3 = c.producto(polinomio2, polinomio3);		
		System.out.println("\n");
		resultado3.verPolinomio();
	}

}
