/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author Daniel Toquica
 */
public class Incio extends javax.swing.JPanel {

    /**
     * Creates new form Incio
     */
    public Incio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlay = new javax.swing.JButton();
        btnManual_Usuario = new javax.swing.JButton();
        btnEstudio = new javax.swing.JButton();
        btnT_Puntuacion = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jlbLogo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boton-de-play.png"))); // NOI18N
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        btnManual_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/expediente (1).png"))); // NOI18N
        btnManual_Usuario.setBorderPainted(false);
        btnManual_Usuario.setContentAreaFilled(false);
        add(btnManual_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 60, 60));

        btnEstudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/libro (1).png"))); // NOI18N
        btnEstudio.setBorderPainted(false);
        btnEstudio.setContentAreaFilled(false);
        add(btnEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 70, 70));

        btnT_Puntuacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/evaluar (1).png"))); // NOI18N
        btnT_Puntuacion.setBorderPainted(false);
        btnT_Puntuacion.setContentAreaFilled(false);
        add(btnT_Puntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/configuraciones.png"))); // NOI18N
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);
        add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 70, 70));

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logocirculofin.png"))); // NOI18N
        add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 230));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 850, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEstudio;
    private javax.swing.JButton btnManual_Usuario;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnT_Puntuacion;
    private javax.swing.JLabel jlbLogo;
    // End of variables declaration//GEN-END:variables
}
