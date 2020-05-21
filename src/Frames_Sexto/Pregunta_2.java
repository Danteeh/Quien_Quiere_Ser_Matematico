
package Frames_Sexto;

import quien_quiere_ser_matematico.Menu_de_inicio;
import quien_quiere_ser_matematico.Ramdom;

public class Pregunta_2 extends javax.swing.JFrame {

       
        public static boolean  Paso_Pregunta_2 =false;
        
                    
    public Pregunta_2() {
         
      
        initComponents();
      
         if (Menu_de_inicio.Uso_boton_1==true){
           
            Boton_1Persona.setEnabled(false);
        }
         if (Menu_de_inicio.Uso_boton_2==true){
           
             Boton_Varios.setEnabled(false);
        }
          if (Menu_de_inicio.Uso_boton_3==true){
            
              Boton_50.setEnabled(false);
        }
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_Responder = new javax.swing.JButton();
        Boton_Varios = new javax.swing.JButton();
        Boton_50 = new javax.swing.JButton();
        Boton_1Persona = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Responder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botos- Respuesta.jpg"))); // NOI18N
        Boton_Responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ResponderActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Responder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 230, 125, 70));

        Boton_Varios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton varias personas.jpg"))); // NOI18N
        getContentPane().add(Boton_Varios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, 80));

        Boton_50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton 50_50.jpg"))); // NOI18N
        getContentPane().add(Boton_50, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 80));

        Boton_1Persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton 1 persona.jpg"))); // NOI18N
        Boton_1Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1PersonaActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_1Persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PANTALLA- EDITADA.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_ResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ResponderActionPerformed
        
      
           Ramdom obj_Aleatorio =new Ramdom();
        
        obj_Aleatorio.N_Aleatorio=obj_Aleatorio.Aleatorio_Variable.nextInt(4);
        
          if (obj_Aleatorio.N_Aleatorio==0 && Pregunta_1.Paso_Pregunta_1==true){
              obj_Aleatorio.N_Aleatorio=1;
               
          }
          
          if (obj_Aleatorio.N_Aleatorio==1 && Pregunta_1.Paso_Pregunta_1== true ){
        
            obj_Aleatorio.N_Aleatorio=2;
            
        }
        
     
       if (obj_Aleatorio.N_Aleatorio==2 ){
           
            obj_Aleatorio.N_Aleatorio=3;
        }
       
        if (obj_Aleatorio.N_Aleatorio== 3 && Pregunta_3.Paso_Pregunta_3 == true  ){
        
            obj_Aleatorio.N_Aleatorio=4;
        }
        
        
        //Sentencia if para la pregunta 2 
        
    
        if (obj_Aleatorio.N_Aleatorio ==0 && Pregunta_1.Paso_Pregunta_1 ==false){
            
            
     
            Pregunta_1 Frame_Pregunta_1 = new Pregunta_1();
            
            Frame_Pregunta_1.setVisible(true);
            Frame_Pregunta_1.setLocationRelativeTo(null);
        
          
        
        
        }   
        
        //sentencia if para pregunta 3 
        
        
          if (obj_Aleatorio.N_Aleatorio==1 && Pregunta_1.Paso_Pregunta_1== false  ){
            
             
           
            Pregunta_1 Frame_Pregunta_1 = new Pregunta_1();
            
            Frame_Pregunta_1.setVisible(true);
            Frame_Pregunta_1.setLocationRelativeTo(null);
        
        
        }
          
          
         
        

       
          Paso_Pregunta_2=true;
        
       dispose(); 
        

    }//GEN-LAST:event_Boton_ResponderActionPerformed

    private void Boton_1PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1PersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_1PersonaActionPerformed


    public static void main(String args[]) {
     
                 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta_2().setVisible(true);
                
        
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_1Persona;
    private javax.swing.JButton Boton_50;
    private javax.swing.JButton Boton_Responder;
    private javax.swing.JButton Boton_Varios;
    private javax.swing.JLabel Fondo;
    // End of variables declaration//GEN-END:variables
}
