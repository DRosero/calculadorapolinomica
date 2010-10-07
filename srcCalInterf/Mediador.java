import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mediador implements ActionListener {
    private CalculadoraPolinomica ejemplo;
	private int flag=0;
    private String polinomio1="";
    private String polinomio2="";
    private Polinomio p1=new Polinomio();
    private Polinomio p2=new Polinomio();
    
	public Mediador(){
	   ejemplo= new CalculadoraPolinomica();
       ejemplo.setActionListeners(this);
       show();
	}

	@SuppressWarnings("deprecation")
	private void show() {
        ejemplo.show();
    }    
	
	public void actionPerformed(ActionEvent e) {		
        		
		Object source = e.getSource();
        
		if(source==ejemplo.getC()){
		   p1=new Polinomio();
		   p2=new Polinomio();
		   ejemplo.getPolinomio().setText("");
		}	
		
        if(source==ejemplo.getSuma()){
           polinomio1 = ejemplo.getPolinomio().getText();
           p1=new Polinomio();
    	   p1.makePolinomioFromFile(polinomio1+".");
		   p1.verPolinomio();
		   ejemplo.getPolinomio().setText("");
		   flag=1;
		}		        
		
		if(source==ejemplo.getResta()){
			polinomio1 = ejemplo.getPolinomio().getText();
	        p1=new Polinomio();
	    	p1.makePolinomioFromFile(polinomio1+".");
			p1.verPolinomio();
			ejemplo.getPolinomio().setText("");
		    flag=2;
		}	
		
		if(source==ejemplo.getIgual()){		   
		   polinomio2 = ejemplo.getPolinomio().getText();
		   
		   
		   if(flag==1){
			   p2=new Polinomio();
			   p2.makePolinomioFromFile(polinomio2+".");
			   //String resultado=(Integer.parseInt(polinomio1)+Integer.parseInt(polinomio2))+"";			   
			   //ejemplo.getPolinomio().setText(resultado);
			   Polinomio resultado = Calculadora.suma(p1, p2);
			   ejemplo.getPolinomio().setText(resultado.toString());
		   }
		   if(flag==2){
			   p2=new Polinomio();
			   p2.makePolinomioFromFile(polinomio2+".");
		       //String resultado=(Integer.parseInt(polinomio1)-Integer.parseInt(polinomio2))+"";			   
			   //ejemplo.getPolinomio().setText(resultado);
			   Polinomio resultado = Calculadora.resta(p1, p2);
			   ejemplo.getPolinomio().setText(resultado.toString());
		   }
		}		
		
        if(source==ejemplo.getApagar()){
		   System.exit(0);
		}		
	
	
	}









}