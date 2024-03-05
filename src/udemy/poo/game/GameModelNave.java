/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package udemy.poo.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import udemy.poo.elementos.ImagenFondo;
import udemy.poo.elementos.ImagenFondoGameN;
import udemy.poo.elementos.ImagenFondoGaming;
import udemy.poo.elementos.burbujas;
import udemy.poo.pantalla.Pantalla;

/**
 *
 * @author Ingenian Software
 */
public class GameModelNave extends javax.swing.JDialog {
    private int fps = 30;
    private Timer tiempo;
    /**
     * Creates new form GameModelNave
     */
    public GameModelNave(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refresh();
            }
        };
        this.tiempo = new Timer(10, accion);
        this.tiempo.start();
        setTitle("Game nave");
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.jPanel1.requestFocusInWindow();
        
        ImagenFondoGameN fondoImagen = ImagenFondoGameN.imagenFondo();
        fondoImagen.configuracion(this.jPanel1, "AvanceComplete.gif", "SecondPrincess.gif");
        
        ImagenFondoGaming fondoGame = ImagenFondoGaming.imagenFondo();
        fondoGame.configuracion(this.jPanel2, "AvanceComplete.gif");
        
        burbujas Burbujas = burbujas.getburbujas();
        Burbujas.configurar(this.jPanel2, "orbe.png");
        
        ((Pantalla) this.jPanel1).getComponente().add(fondoImagen);
        ((Pantalla) this.jPanel2).getComponente().add(fondoGame);
        ((Pantalla) this.jPanel2).getComponente().add(Burbujas);
    }
    
    private void refresh(){
        long inicio;
        long transcurrido;
        long espera;
        try {
            inicio = System.nanoTime();
            this.jPanel1.repaint();
            transcurrido = System.nanoTime();
            espera = 1000/fps-(transcurrido-inicio)/1000000;
            Thread.sleep(espera);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new udemy.poo.pantalla.Pantalla(this.tiempo);
        jPanel2 = new udemy.poo.pantalla.Pantalla(this.tiempo);
        jMenuBar1 = new javax.swing.JMenuBar();
        backHomeButon = new javax.swing.JMenu();
        infoButon = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        backHomeButon.setText("Home");
        backHomeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeButonMouseClicked(evt);
            }
        });
        jMenuBar1.add(backHomeButon);

        infoButon.setText("Informacion");
        infoButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoButonMouseClicked(evt);
            }
        });
        jMenuBar1.add(infoButon);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backHomeButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHomeButonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backHomeButonMouseClicked

    private void infoButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_infoButonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameModelNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameModelNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameModelNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameModelNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameModelNave dialog = new GameModelNave(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backHomeButon;
    private javax.swing.JMenu infoButon;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}