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

        Boton_6Y7 = new javax.swing.JButton();
        Boton_8Y9 = new javax.swing.JButton();
        Boton_10 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1410, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_6Y7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mano- 6 y 7.png"))); // NOI18N
        Boton_6Y7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_6Y7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_6Y7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 197, 170));

        Boton_8Y9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mano- 8 Y 9.png"))); // NOI18N
        Boton_8Y9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_8Y9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_8Y9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 197, 170));

        Boton_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mano- 10 y 11.png"))); // NOI18N
        Boton_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_10ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 197, 170));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EXIT.jpg"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, 72, 74));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Editado.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_6Y7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_6Y7ActionPerformed
        
        Ramdom obj_Aleatorio =new Ramdom();
        
        obj_Aleatorio.N_Aleatorio=obj_Aleatorio.Aleatorio_Variable.nextInt(4);
        
          if (obj_Aleatorio.N_Aleatorio==0){
              obj_Aleatorio.N_Aleatorio=1;
              System.out.println("Salio 0");
          }
        //sentencia if para la pregunta 1 
   
        
        if (obj_Aleatorio.N_Aleatorio==1 ){
             
            Pregunta_1 Frame_Pregunta_1 = new Pregunta_1();
            
            Frame_Pregunta_1.setVisible(true);
            Frame_Pregunta_1.setLocationRelativeTo(null);
          
        } 
          
        
        //Sentencia if para la pregunta 2 
       
        
        
        
        if (obj_Aleatorio.N_Aleatorio==2  ){
            
          
            
            Pregunta_2 Frame_Pregunta_2 = new Pregunta_2();
            
            Frame_Pregunta_2.setVisible(true);
            Frame_Pregunta_2.setLocationRelativeTo(null);
          
        
        
        }   
        
        
          if (obj_Aleatorio.N_Aleatorio==3 ){
            
          
            
            Pregunta_3 Frame_Pregunta_3 = new Pregunta_3();
            
            Frame_Pregunta_3.setVisible(true);
            Frame_Pregunta_3.setLocationRelativeTo(null);
          
        
        
        }    
          dispose();
    }//GEN-LAST:event_Boton_6Y7ActionPerformed

    
    
    
    private void Boton_8Y9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_8Y9ActionPerformed
        
        
        
    }//GEN-LAST:event_Boton_8Y9ActionPerformed

    private void Boton_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_10ActionPerformed
        
        
        
    }//GEN-LAST:event_Boton_10ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       
        System.exit(WIDTH);
       
    }//GEN-LAST:event_SalirActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_de_inicio().setVisible(true);
            }
        });
    }

  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_10;
    private javax.swing.JButton Boton_6Y7;
    private javax.swing.JButton Boton_8Y9;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
