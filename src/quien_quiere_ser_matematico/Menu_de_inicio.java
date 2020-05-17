package quien_quiere_ser_matematico;

import Frames_Sexto.*;
import java.util.Random;

public class Menu_de_inicio extends javax.swing.JFrame {

    public Menu_de_inicio() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("6 y 7");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Ramdom obj_Aleatorio =new Ramdom();
        
        obj_Aleatorio.N_Aleatorio=obj_Aleatorio.Aleatorio_Variable.nextInt(4);
        
          if (obj_Aleatorio.N_Aleatorio==0){
              obj_Aleatorio.N_Aleatorio=1;
              System.out.println("Salio 0");
          }
        //sentencia if para la pregunta 1 
        
      if (obj_Aleatorio.N_Aleatorio==1 ){
        
            obj_Aleatorio.N_Aleatorio=2;
        }
        
        if (obj_Aleatorio.N_Aleatorio==1 ){
            
            
            
            
            Pregunta_1 Frame_Pregunta_1 = new Pregunta_1();
            
            Frame_Pregunta_1.setVisible(true);
            Frame_Pregunta_1.setLocationRelativeTo(null);
          
        } 
          
        
        //Sentencia if para la pregunta 2 
        
        
       if (obj_Aleatorio.N_Aleatorio==2 ){
        
            obj_Aleatorio.N_Aleatorio=3;
        }
        
        
        
        if (obj_Aleatorio.N_Aleatorio==2  ){
            
          
            
            Pregunta_2 Frame_Pregunta_2 = new Pregunta_2();
            
            Frame_Pregunta_2.setVisible(true);
            Frame_Pregunta_2.setLocationRelativeTo(null);
          
        
        
        }   
        
        //sentencia if para pregunta 3 
        
         if (obj_Aleatorio.N_Aleatorio==3 ){
        
            obj_Aleatorio.N_Aleatorio=4;
        }
        
          if (obj_Aleatorio.N_Aleatorio==3 ){
            
          
            
            Pregunta_3 Frame_Pregunta_3 = new Pregunta_3();
            
            Frame_Pregunta_3.setVisible(true);
            Frame_Pregunta_3.setLocationRelativeTo(null);
          
        
        
        }    
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_de_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
