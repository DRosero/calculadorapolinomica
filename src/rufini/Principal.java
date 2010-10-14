package rufini;
public class Principal {

        /**
         * @param args
         */
        public static void main(String[] args) {
                // Creacion de polinomios
                
                Polinomio polinomio1=new Polinomio();
                Polinomio polinomio2= new Polinomio();
                Polinomio binomio= new Polinomio();
                
                // armo el primer polinomio
                System.out.println("\n"+"Polinomio 1: ");
                //polinomio1.makePolinomioFromFile("/home/nan/NetBeansProjects/Rufini/src/rufini/polinomio1.txt");
                polinomio1.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/Polinomios/Polinomio1.txt");
                polinomio1.verPolinomio();
                
                //armo el segundo Polinomio
                System.out.println("\n"+"Polinomio 2: ");
                //polinomio2.makePolinomioFromFile("/home/nan/NetBeansProjects/Rufini/src/rufini/polinomio2.txt");
                polinomio2.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/Polinomios/Polinomio2.txt");
                polinomio2.verPolinomio();
                
                //armo el Tercera Polinomio
                System.out.println("\n"+"Binomio: ");
                //polinomio3.makePolinomioFromFile("/home/nan/NetBeansProjects/Rufini/src/rufini/polinomio3.txt");
                binomio.makePolinomioFromFile("C:/polinomio/CalculadoraPolinomica/src/Polinomios/Binomio.txt");
                binomio.verPolinomio();
                

                //Calculadora Version windows
                //Polinomio 1 ,Polinomio 2 y Binomio el orden muestra como se van a realizar las operaciones
                // por ejemplo polinomio1 + polinomio2 
                //va mostrar por pantalla 1ero al Polinomio1 y luego el polinomio 2
                Calculadora c=new Calculadora();
                
                //realizamos una suma
                System.out.println("\n"+"<------Suma------>");
                System.out.println("\n"+"Polinomio 1: ");
                polinomio1.verPolinomio();
                System.out.println("\n"+"Polinomio 2: ");
                polinomio2.verPolinomio();
                Polinomio resultado1 = c.suma(polinomio1, polinomio2);          
                System.out.println("\n"+"Resultado De La Suma:");
                resultado1.verPolinomio();
                
                //realizamos una resta
                System.out.println("\n"+"<------Resta------>");
                System.out.println("\n"+"Polinomio 1: ");
                polinomio1.verPolinomio();
                System.out.println("\n"+"Polinomio 2: ");
                polinomio2.verPolinomio();
                Polinomio resultado2 = c.resta(polinomio1, polinomio2);         
                System.out.println("\n"+"Resultado De La Resta: ");
                resultado2.verPolinomio();

                //realizamos una Multiplicacion
                System.out.println("\n"+"<------Multiplicacion------>");
                System.out.println("\n"+"Polinomio 2: ");
                polinomio2.verPolinomio(); 
                System.out.println("\n"+"Binomio: ");
                binomio.verPolinomio();
                Polinomio resultado5 = c.producto(polinomio2, binomio);              
                System.out.println("\n"+"Resultado De La Multiplicacion: ");
                resultado5.verPolinomio();

                //realizamos una Division
                System.out.println("\n"+"<------Division------>");
                System.out.println("\n"+"Polinomio 2: ");
                polinomio2.verPolinomio();
                System.out.println("\n"+"Polinomio 1: ");
                polinomio1.verPolinomio();
                Polinomio resultado4 = c.Division(polinomio2, polinomio1);
                System.out.println("\n"+"Resultado Resultado de la Division: ");
                resultado4.verPolinomio();
                                

                //realizamos una Ruffini
                System.out.println("\n"+"<------Ruffini------>");
                System.out.println("\n"+"Polinomio 1: ");
                polinomio1.verPolinomio();
                System.out.println("\n"+"Binomio: ");
                binomio.verPolinomio();
                Polinomio resultado7 = c.rufini(polinomio1, binomio);
                System.out.println("\n"+"Resultado Resultado de la Division de Ruffini: ");
                resultado7.verPolinomio();
        }

}