/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CalculadoraPolinomica.java
 *
 * Created on 06/10/2010, 20:30:10
 */

//package calculadora;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author fliaMercado
 */
@SuppressWarnings("serial")
public class CalculadoraPolinomica extends javax.swing.JFrame {

    /** Creates new form CalculadoraPolinomica */
    public CalculadoraPolinomica() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPolnomio = new javax.swing.JTextField();
        sumaBoton = new javax.swing.JButton();
        restaBoton = new javax.swing.JButton();
        multBoton = new javax.swing.JButton();
        cocButton = new javax.swing.JButton();
        CocRufBoton = new javax.swing.JButton();
        borrarBoton = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculadoraPolinomica");
        setBackground(new java.awt.Color(30, 113, 173));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        textPolnomio.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        textPolnomio.setText("ej:    \"2X^1+1\"");
        textPolnomio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textPolnomio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPolnomioActionPerformed(evt);
            }
        });

        sumaBoton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sumaBoton.setText("+");

        restaBoton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        restaBoton.setText("-");

        multBoton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multBoton.setText("*");

        cocButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cocButton.setText("Cociente");

        CocRufBoton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CocRufBoton.setText("CocRuf");

        borrarBoton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        borrarBoton.setText("C");

        igual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        igual.setText("=");

        apagar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        apagar.setText("Apagar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(restaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CocRufBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textPolnomio))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textPolnomio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CocRufBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(multBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
	public JButton getSuma(){
    	return sumaBoton;	
    }
    
	public JButton getResta(){
    	return restaBoton;	
    }
	
	public JButton getC(){
    	return borrarBoton;	
    }
	
	public JButton getMult(){
    	return multBoton;	
    }
	
	public JButton getCociente(){
    	return cocButton;	
    }
	
	public JButton getCocienteRuff(){
    	return CocRufBoton;	
    }
	
	public JButton getIgual(){
    	return igual;	
    }
	
	public JButton getApagar(){
    	return apagar;	
    }
	
	public JTextField getPolinomio(){
       return textPolnomio;
    }
	
    private void textPolnomioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPolnomioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPolnomioActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPolinomica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CocRufBoton;
    private javax.swing.JButton apagar;
    private javax.swing.JButton borrarBoton;
    private javax.swing.JButton cocButton;
    private javax.swing.JButton igual;
    private javax.swing.JButton multBoton;
    private javax.swing.JButton restaBoton;
    private javax.swing.JButton sumaBoton;
    private javax.swing.JTextField textPolnomio;
    // End of variables declaration//GEN-END:variables
	
		public void setActionListeners(ActionListener lis) {		
		sumaBoton.addActionListener(lis);
		restaBoton.addActionListener(lis);
		multBoton.addActionListener(lis);
		igual.addActionListener(lis);
		cocButton.addActionListener(lis);
		borrarBoton.addActionListener(lis);
		apagar.addActionListener(lis);
		CocRufBoton.addActionListener(lis);
	}

}
