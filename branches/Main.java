/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rufini;

import java.util.*;

/**
 *
 * @author nan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Polinomio p = new Polinomio();
        Polinomio q = new Polinomio();

       // p.addTermPolinomico(2, 4);
        p.addTermPolinomico(5, 3);
        p.addTermPolinomico(7, 2);
        p.addTermPolinomico(0, 1);
        p.addTermPolinomico(3,0);

        q.addTermPolinomico(3, 2);
        q.addTermPolinomico(2, 1);
        q.addTermPolinomico(-1, 0);
        
        /*System.out.println("Pregunta Es posible");
        p.verPolinomio();
        System.out.println(EsPosibleRuffini(p,q));
        System.out.println("-----------------------------------------");*/
        System.out.println("Divicion");

        Divicion(p,q).verPolinomio();System.out.println("Resultado");
     
    }    

    public static Polinomio resta(Polinomio p1, Polinomio p2) {
		Polinomio neg = new Polinomio();
		neg.addTermPolinomico(-1,0);
		return suma(p1, producto(p2,neg));
    }

    public static Polinomio suma(Polinomio p1,Polinomio p2){
		p1.ordenarDec(p1);
		p2.ordenarDec(p2);
		p1.completar(p1);
		p2.completar(p2);
		Polinomio res = new Polinomio();

		if(p1.grado(p1)< p2.grado(p2)){
			res.setPolinomio((LinkedList<Termino>) (p2.getPolinomio()).clone());
			return plus(p1,res);
		}
		else{

			res.setPolinomio((LinkedList<Termino>) (p1.getPolinomio()).clone());
			return plus(p2,res);
		}
	}

    private static Polinomio plus(Polinomio menor, Polinomio mayor){
		int i=0;
		int dif = mayor.grado(mayor)-menor.grado(menor);
		LinkedList<Termino> terminoMay = mayor.getPolinomio();
		LinkedList<Termino> terminoMen = menor.getPolinomio();
                menor.verPolinomio();System.out.println("menorrrrrrr "+menor.getPolinomio().size());
		while(i <menor.grado(menor)){
                        System.out.println("i valor de ciclo "+i);
			int valMay = (terminoMay.get(i+dif)).getValor();
			int valMen = (terminoMen.get(i)).getValor();
			(terminoMay.get(i+dif)).setValor(valMay+valMen);
			i++;
		}
		return mayor;
	}



    public static Polinomio producto(Polinomio p, Polinomio q) {

				 int valor;
				 int exp;

				 Polinomio result = new Polinomio();
				 Polinomio auxi = new Polinomio();

			     if (p.estaOrdenada(p) == false){ p.ordenarDec(p);}
			     if (q.estaOrdenada(q) == false ){ q.ordenarDec(q);}

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

    public static Polinomio Rufini(Polinomio p, Polinomio q){
        Polinomio r = new Polinomio();
        p = p.ordenarDec(p);
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

    public static boolean EsPosibleRuffini(Polinomio p,Polinomio q){
        q = q.ordenarDec(q);
        if((q.getPolinomio().size() == 2) && (q.getPolinomio().get(0).getExp()==1)){
            return true;
        }else{
            return false;
        }
    }

    public static Polinomio Divicion(Polinomio p,Polinomio q){
        Polinomio r = new Polinomio();
        p.verPolinomio();
        System.out.println("P");
        q.verPolinomio();
        System.out.println("Q");
        /*q.completar(q);
        q.ordenarDec(q);*/
        while (p.getPolinomio().size() >=  q.getPolinomio().size()){
            int longQ = q.getPolinomio().size();
            int longP = p.getPolinomio().size();
            System.out.println("logitud de q "+longQ);
            System.out.println("logitud de q "+longP);
            Polinomio aux = new Polinomio();
            /*System.out.println((p.getPolinomio().get(0)).getValor());
            System.out.println((q.getPolinomio().get(0)).getValor());*/
            int i=0;
            int resVal = 0;
            boolean Band = true;

            while (Band){
                i=i+1;
                if ((p.getPolinomio().get(0)).getValor() == i * (q.getPolinomio().get(0)).getValor()){
                    Band = false;
                    resVal = 1;
                }
                if((p.getPolinomio().get(0)).getValor() == (i * (q.getPolinomio().get(0)).getValor())-1){
                 
                    Band = false;                }
                    resVal = i-1;
            }
            int resExp = (p.getPolinomio().get(0)).getExp() - (q.getPolinomio().get(0)).getExp();


            Polinomio auxP = new Polinomio();
            auxP.addTermPolinomico(resVal, resExp);
            auxP.verPolinomio();
            r.addTermPolinomico(resVal, resExp);
            System.out.println("Plinomio resultante ");
            auxP.verPolinomio();System.out.println("auxP ");
            Polinomio multP = producto(q,auxP);
            multP.verPolinomio();System.out.println("MultP ");
            multP.completar(multP);
            multP.verPolinomio();
            p = resta(p,multP);
            
            p.verPolinomio();System.out.println("Resultado de resta ");
            
            for(int j=0;j<p.getPolinomio().size()-1;j++){
                if((p.getPolinomio().get(j).getExp() == 0 && p.getPolinomio().get(j).getValor() == 0) || (p.getPolinomio().get(j).getValor()==0)){
                    p.getPolinomio().remove(j);
                }

            }


        }
        return r;
    }



}
