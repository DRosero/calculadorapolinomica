
public class PruebaDecOrden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calculadora=new Calculadora();
		
		//Polinomio -1-
		Polinomio polinomio1=new Polinomio();
		polinomio1.addTermPolinomico(4, 3);
		polinomio1.addTermPolinomico(9, 2);
		polinomio1.addTermPolinomico(4, 1);
		
		//Polinomio -2-
		Polinomio polinomio2=new Polinomio();
		polinomio2.addTermPolinomico(5,3 );
		polinomio2.addTermPolinomico(2,2 );
		polinomio2.addTermPolinomico(7,1 );
		
		//Polinomio -3-
		Polinomio polinomio3=new Polinomio();
		polinomio3.addTermPolinomico(-2,4 );
		polinomio3.addTermPolinomico(6,2 );
		polinomio3.addTermPolinomico(5,1 );
		
		//Polinomio -4-
		Polinomio polinomio4=new Polinomio();
		polinomio4.addTermPolinomico(2,6 );
		polinomio4.addTermPolinomico(2,3 );
		polinomio4.addTermPolinomico(-1,1 );
		
		//Binomio -1-
		Polinomio binomio1=new Polinomio();
		binomio1.addTermPolinomico(7,1 );
		binomio1.addTermPolinomico(2,0 );
		
		//Binomio -2-
		Polinomio binomio2=new Polinomio();
		binomio2.addTermPolinomico(8,1 );
		binomio2.addTermPolinomico(1,0 );
		
		
		//Binomio -3-
		Polinomio binomio3=new Polinomio();
		binomio3.addTermPolinomico(1,1 );
		binomio3.addTermPolinomico(-5,0 );
		
		//Polinomio resultado = calculadora.suma(polinomio1, polinomio2);
		//Polinomio resultado = calculadora.producto(polinomio1, polinomio2);
		//Polinomio resultado = calculadora.resta(polinomio1, polinomio2);
		//resultado.verPolinomio();
	}

}
