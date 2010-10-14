package rufini;
/**
 *
 * @author Bono Federico                
 * @author Cabral Hernan
 * @author Cuello Lucas
 * @author Magliano Barbara
 * @author Mercado Lucas
 *
 **/
import java.util.LinkedList;


public class Calculadora {
        
        public Calculadora(){
                        
        }
        /*
         * Metodo para restar polinomios
         * param. dos polinomios utilizados para restar
         * return.Polinomio que tiene la diferencia de los polinomios pasados como parametros
         */

        
        public Polinomio resta(Polinomio p1, Polinomio p2) {
                Polinomio neg = new Polinomio();
                neg.addTermPolinomico(-1,0);
                return suma(p1, producto(p2,neg));
    }
    
        /*
         * Metodo suma para polinomios
         * param. Los dos polinomios a ser sumados
         * return. Polinomio que tiene la suma de los polinomios pasados como parametros
         */
        @SuppressWarnings("unchecked")
        public Polinomio suma(Polinomio p1,Polinomio p2){               
                p1.ordenarDec(p1);
                p2.ordenarDec(p2);              
                p1.completar(p1);
                System.out.println("\n"+"Muestra Ordenado 1er Polinomio");
                p1.verPolinomio();
                System.out.println("\n"+"Muestra Ordenado 2do Polinomio");
                p2.completar(p2);
                p2.verPolinomio();
                Polinomio res = new Polinomio();
                
                if(p1.grado(p1)< p2.grado(p2)){
                        
                        res.setPolinomio((LinkedList<Termino>) (p2.getPolinomio()).clone());                    
                        return sumaAux(p1,res);
                        
                }
                else{ 
                        
                        res.setPolinomio((LinkedList<Termino>) (p1.getPolinomio()).clone());                    
                        return sumaAux(p2,res);
                }
        }
         /*
         * Metodo utilizado para realizar la operacion de la suma de polinomios de distinto grado.
         * param. Los dos polinomios que van a ser sumados, el primer parámetro es de menor grado que el del segundo.
         * return. Un polinomio que contiene la suma de los polinomios pasados como parametros
         */
        private static Polinomio sumaAux(Polinomio menor, Polinomio mayor){
                int i=0;
                int dif = mayor.grado(mayor)-menor.grado(menor);                
                LinkedList<Termino> terminoMay = mayor.getPolinomio();
                LinkedList<Termino> terminoMen = menor.getPolinomio();  
                while(i <menor.grado(menor)){
                        if(i+dif<terminoMay.size()){                    
                        int valMay = (terminoMay.get(i+dif)).getValor();                        
                        int valMen = (terminoMen.get(i)).getValor();
                        (terminoMay.get(i+dif)).setValor(valMay+valMen);                        
                        }
                        else{                           
                                terminoMay.add(terminoMen.get(i));      
                        }                       
                        i++;
                }               
                if(terminoMen.get(terminoMen.size()-1).getExp()==0){
                   terminoMay.add(terminoMen.get(terminoMen.size()-1));
                }
                return mayor;   
        }
          /*
         * Metodo multiplicacion de polinomios
         * param. Los dos polinomios que van a ser multiplicados
         * return. Un polinomio que contiene la multiplicación de los parametros pasados como parametros
         */

        public Polinomio producto(Polinomio p, Polinomio q) {            
                             
                                 int valor;
                                 int exp;
                                 
                                 Polinomio result = new Polinomio();
                                 Polinomio auxi = new Polinomio();
                                        
                             if (p.estaOrdenada(p) == false){
                                 p.ordenarDec(p);
                             }  
                             
                             if (q.estaOrdenada(q) == false ){
                                 q.ordenarDec(q);
                             }  
                               
                             for (int i=0;i<p.getPolinomio().size();i++){
                                 for (int j=0;j<q.getPolinomio().size();j++){
                                         valor =(p.getPolinomio().get(i).getValor())*(q.getPolinomio().get(j).getValor());
                                         exp =(p.getPolinomio().get(i).getExp())+(q.getPolinomio().get(j).getExp());
                                         auxi.addTermPolinomico(valor, exp); 
                                   
                                 }
                                 
                                 result =   auxi;
                               }
                             result.ordenarDec(result);
                             return result;
                           
    }   
    /*
         * Metodo  para dividir dos polinomios
         * param. Los dos polinomios a ser divididos
         * return. Un polinomio que contiene la división de los terminos pasados como parametros
         */
                                
        
    public Polinomio Division(Polinomio p,Polinomio q){
        Polinomio r = new Polinomio();
        p.ordenarDec(p);
        q.ordenarDec(q);
        while (p.grado(p) >=  q.grado(q)){
            int a = (p.getPolinomio().get(0)).getValor()/q.getPolinomio().get(0).getValor();
            int resExp = (p.getPolinomio().get(0)).getExp() - (q.getPolinomio().get(0)).getExp();
            Polinomio auxP = new Polinomio();
            auxP.addTermPolinomico(a, resExp);
            if(a != 0){
                r.addTermPolinomico(a, resExp);
            }
            Polinomio multP = producto(q,auxP);
            multP.completar(multP);
            p = resta(p,multP);
            if (p.getPolinomio().get(0).getValor() != 0){
                break;
            }else{
                p.getPolinomio().remove(0);
            }

        }
       return r;
}
        
         /*
         * Metodo división de polinomos con Rufini.La regla de Rufini nos permite dividir un polinomio entre un binomial 
         * de la forma (x - r) (siendo r un número entero). 
         * return. Un polinomio que contiene la división de los pasados como parametros
         * param. Los dos polinomios a ser divididos
         */
        public Polinomio rufini(Polinomio p, Polinomio q){
        
                Polinomio r = new Polinomio();
        p = p.ordenarDec(p);
        p=p.completar(p);
        q = q.ordenarDec(q);
        int a = (q.getPolinomio().get(q.getPolinomio().size()-1)).getValor()*-1;
        int aux = p.getPolinomio().get(0).getValor();
        r.addTermPolinomico(aux,p.getPolinomio().get(0).getExp()-1 );
        aux = aux*a;
        for(int i=1;i<p.getPolinomio().size()-1;i++){
            aux = p.getPolinomio().get(i).getValor()+aux;
            r.addTermPolinomico(aux, p.getPolinomio().get(i).getExp()-1);
            aux = aux *a;
        }


        return r;
        // TODO code application logic here
    }
        /*
         * La regla de Rufini nos permite dividir un polinomio entre un binomial 
         * de la forma (x - r) (siendo r un número entero). Esta función nos devuelve 
         * un booleano si dados dos polinomios es posible poder aplicar la regla de
         */
        public boolean EsPosibleRuffini(Polinomio p,Polinomio q){
        q = q.ordenarDec(q);
        if((q.getPolinomio().size() == 2) && (q.getPolinomio().get(0).getExp()==1)){
            return true;
        }else{
            return false;
        }
    }
}
