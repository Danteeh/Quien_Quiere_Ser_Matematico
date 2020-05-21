package Frames_Sexto;

import java.util.*;
import quien_quiere_ser_matematico.Menu_de_inicio;
import Frames_Sexto.*;
import quien_quiere_ser_matematico.Ramdom;


public class Pregunta_1 extends javax.swing.JFrame {

  
     public static boolean Paso_Pregunta_1 = false;
   
    public Pregunta_1() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_Responder = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Boton_1Persona = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Responder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botos- Respuesta.jpg"))); // NOI18N
        Boton_Responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ResponderActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Responder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 240, 125, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton varias personas.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton 50_50.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 80));

        Boton_1Persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton 1 persona.jpg"))); // NOI18N
        Boton_1Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1PersonaActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_1Persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PANTALLA- EDITADA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_ResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ResponderActionPerformed

          Ramdom obj_Aleatorio =new Ramdom();
        
        obj_Aleatorio.N_Aleatorio=obj_Aleatorio.Aleatorio_Variable.nextInt(4);
        
          if (obj_Aleatorio.N_Aleatorio==0 && Paso_Pregunta_1==false ){
              Paso_Pregunta_1=true;
              obj_Aleatorio.N_Aleatorio=2;
               
          }
          
          if (obj_Aleatorio.N_Aleatorio==1 && Paso_Pregunta_1== false){
            Paso_Pregunta_1=true;
            obj_Aleatorio.N_Aleatorio=2;
            
        }
        
     
       if (obj_Aleatorio.N_Aleatorio==2 && Pregunta_2.Paso_Pregunta_2 == true ){
           Paso_Pregunta_1=true;
            obj_Aleatorio.N_Aleatorio=3;
        }
       
        if (obj_Aleatorio.N_Aleatorio== 3 && Pregunta_3.Paso_Pregunta_3 == true  ){
           Paso_Pregunta_1=true;
            obj_Aleatorio.N_Aleatorio=4;
        }
        if (obj_Aleatorio.N_Aleatorio == 2 && Pregunta_2.Paso_Pregunta_2==false){
            
            
            Paso_Pregunta_1=true;
        Pregunta_2 Frame_Pregunta_2 = new Pregunta_2();
            
            Frame_Pregunta_2.setVisible(true);
            Frame_Pregunta_2.setLocationRelativeTo(null);
          
        
        }
        
   
        
        
         if (obj_Aleatorio.N_Aleatorio == 3 && Pregunta_3.Paso_Pregunta_3==false){
            Paso_Pregunta_1=true;
        Pregunta_3 Frame_Pregunta_3 = new Pregunta_3();
             
            Frame_Pregunta_3.setVisible(true);
            Frame_Pregunta_3.setLocationRelativeTo(null);
          
       
        }
           
         
        
        
       dispose();
    

         
    }//GEN-LAST:event_Boton_ResponderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Boton_1PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1PersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_1PersonaActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta_1().setVisible(true);
            }
        });  
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_1Persona;
    private javax.swing.JButton Boton_Responder;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
