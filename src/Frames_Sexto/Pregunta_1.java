package Frames_Sexto;

import java.util.*;
import quien_quiere_ser_matematico.Menu_de_inicio;
import Frames_Sexto.*;
import quien_quiere_ser_matematico.Ramdom;


public class Pregunta_1 extends javax.swing.JFrame {

     public static int datos_1;
   
    public Pregunta_1() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("1");

        jButton1.setText("Responder");
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
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         Ramdom obj_Aleatorio =new Ramdom();
        
        obj_Aleatorio.N_Aleatorio=obj_Aleatorio.Aleatorio_Variable.nextInt(4);
        
          if (obj_Aleatorio.N_Aleatorio==0){
              obj_Aleatorio.N_Aleatorio=2;
               datos_1=2;
          }
          
          if (obj_Aleatorio.N_Aleatorio==1 ){
        
            obj_Aleatorio.N_Aleatorio=2;
             datos_1=2;
        }
        
        
          
       if (obj_Aleatorio.N_Aleatorio==2 && obj_Aleatorio.Pregunta_2==true){
           
            obj_Aleatorio.N_Aleatorio=3;
        }
        
        //Sentencia if para la pregunta 2 
        
    
        if (obj_Aleatorio.N_Aleatorio==2 && obj_Aleatorio.Pregunta_2==false ){
            
            obj_Aleatorio.Pregunta_1=true;
            
            datos_1=2;
            
            Pregunta_2 Frame_Pregunta_2 = new Pregunta_2();
            
            Frame_Pregunta_2.setVisible(true);
            Frame_Pregunta_2.setLocationRelativeTo(null);
        
          
        
        
        }   
        
        //sentencia if para pregunta 3 
        
         if (obj_Aleatorio.N_Aleatorio==3 && obj_Aleatorio.Pregunta_3==true){
        
            obj_Aleatorio.N_Aleatorio=4;
        }
        
          if (obj_Aleatorio.N_Aleatorio==3 && obj_Aleatorio.Pregunta_3==false ){
            
              datos_1=3;
            obj_Aleatorio.Pregunta_3=true;
            
            Pregunta_3 Frame_Pregunta_3 = new Pregunta_3();
            
            Frame_Pregunta_3.setVisible(true);
            Frame_Pregunta_3.setLocationRelativeTo(null);
        
        
        }
        
           
        
        
       dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta_1().setVisible(true);
            }
        });  
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}