package Frames_Sexto;

import java.util.*;
import quien_quiere_ser_matematico.Menu_de_inicio;
import Frames_Sexto.*;
import javax.swing.JOptionPane;
import quien_quiere_ser_matematico.Ramdom;


public class Pregunta_1 extends javax.swing.JFrame {

     
     public static boolean Paso_Pregunta_1 = false;
   
     
     
    public Pregunta_1() {
        initComponents();
       
        if (Menu_de_inicio.Uso_boton_1==true){
           
            Boton_1Persona.setEnabled(false);
        }
         if (Menu_de_inicio.Uso_boton_2==true){
           
             Boton_1Persona.setEnabled(false);
        }
          if (Menu_de_inicio.Uso_boton_3==true){
            
              Boton_1Persona.setEnabled(false);
        }
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Respuestas = new javax.swing.ButtonGroup();
        Boton_Responder = new javax.swing.JButton();
        Boton_Varios = new javax.swing.JButton();
        Boton_50 = new javax.swing.JButton();
        Boton_1Persona = new javax.swing.JButton();
        Respuesta_A = new javax.swing.JRadioButton();
        Respuesta_B = new javax.swing.JRadioButton();
        Respuesta_C = new javax.swing.JRadioButton();
        Respuesta_D = new javax.swing.JRadioButton();
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

        Boton_Varios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton varias personas.jpg"))); // NOI18N
        Boton_Varios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VariosActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Varios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, 80));

        Boton_50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton 50_50.jpg"))); // NOI18N
        Boton_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_50ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_50, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 80));

        Boton_1Persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton 1 persona.jpg"))); // NOI18N
        Boton_1Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1PersonaActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_1Persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 80));

        Respuesta_A.setBackground(new java.awt.Color(0, 0, 255));
        Respuestas.add(Respuesta_A);
        Respuesta_A.setForeground(new java.awt.Color(255, 102, 0));
        Respuesta_A.setText("A.");
        getContentPane().add(Respuesta_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 530, -1));

        Respuesta_B.setBackground(new java.awt.Color(0, 0, 255));
        Respuestas.add(Respuesta_B);
        Respuesta_B.setForeground(new java.awt.Color(255, 102, 51));
        Respuesta_B.setText("B.");
        Respuesta_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta_BActionPerformed(evt);
            }
        });
        getContentPane().add(Respuesta_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 530, -1));

        Respuesta_C.setBackground(new java.awt.Color(0, 0, 255));
        Respuestas.add(Respuesta_C);
        Respuesta_C.setForeground(new java.awt.Color(255, 102, 51));
        Respuesta_C.setText("C.");
        Respuesta_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta_CActionPerformed(evt);
            }
        });
        getContentPane().add(Respuesta_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 530, -1));

        Respuesta_D.setBackground(new java.awt.Color(0, 0, 255));
        Respuestas.add(Respuesta_D);
        Respuesta_D.setForeground(new java.awt.Color(255, 102, 0));
        Respuesta_D.setText("D.");
        Respuesta_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta_DActionPerformed(evt);
            }
        });
        getContentPane().add(Respuesta_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 710, 530, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PANTALLA- EDITADA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_ResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ResponderActionPerformed

        if (Respuesta_A.isSelected()){
        
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
    
        }else {
        
            JOptionPane.showMessageDialog(null, "Perdiste");
            System.exit(WIDTH);
        }
         
    }//GEN-LAST:event_Boton_ResponderActionPerformed

    private void Boton_VariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VariosActionPerformed
       
        Menu_de_inicio.Uso_boton_1= true;
        
        Boton_Varios.setEnabled(false);
        JOptionPane.showMessageDialog(null, "5 personas del publico dicen lo que crren como respuesta");
        
        
        
    }//GEN-LAST:event_Boton_VariosActionPerformed

    private void Boton_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_50ActionPerformed

        Menu_de_inicio.Uso_boton_3= true;
        
        Boton_50.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Se elminaron dos respuestas erroneas");
        
        Respuesta_B.setEnabled(false);
        Respuesta_C.setEnabled(false);
        
    }//GEN-LAST:event_Boton_50ActionPerformed

    private void Boton_1PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1PersonaActionPerformed
       
        Menu_de_inicio.Uso_boton_1= true;
        Boton_1Persona.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Puedes llamar a un amigo");
        
    }//GEN-LAST:event_Boton_1PersonaActionPerformed

    private void Respuesta_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Respuesta_BActionPerformed

    private void Respuesta_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Respuesta_DActionPerformed

    private void Respuesta_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Respuesta_CActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta_1().setVisible(true);
            }
        });  
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_1Persona;
    private javax.swing.JButton Boton_50;
    private javax.swing.JButton Boton_Responder;
    private javax.swing.JButton Boton_Varios;
    private javax.swing.JRadioButton Respuesta_A;
    private javax.swing.JRadioButton Respuesta_B;
    private javax.swing.JRadioButton Respuesta_C;
    private javax.swing.JRadioButton Respuesta_D;
    private javax.swing.ButtonGroup Respuestas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
