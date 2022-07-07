package View;

import javax.swing.JButton;

public class Inicio extends javax.swing.JPanel {

    public Inicio() {
        initComponents();
    }

    public JButton getBtnPlay() {
        return btnPlay;
    }

    public JButton getBtnConfig() {
        return btnConfig;
    }

    public JButton getBtnScore() {
        return btnScore;
    }

    public JButton getBtnStudy() {
        return btnStudy;
    }

    public JButton getBtnUserManual() {
        return btnUserManual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlay = new javax.swing.JButton();
        btnUserManual = new javax.swing.JButton();
        btnStudy = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        jlbLogo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boton-de-play.png"))); // NOI18N
        btnPlay.setToolTipText("Comenzar a Jugar!");
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        btnUserManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/expediente (1).png"))); // NOI18N
        btnUserManual.setToolTipText("Manual de Usuario!");
        btnUserManual.setBorderPainted(false);
        btnUserManual.setContentAreaFilled(false);
        btnUserManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnUserManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 60, 60));

        btnStudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/libro.png"))); // NOI18N
        btnStudy.setToolTipText("Estudiar!");
        btnStudy.setBorderPainted(false);
        btnStudy.setContentAreaFilled(false);
        btnStudy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnStudy, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 70, 60));

        btnScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/evaluar (1).png"))); // NOI18N
        btnScore.setToolTipText("Puntajes!");
        btnScore.setBorderPainted(false);
        btnScore.setContentAreaFilled(false);
        btnScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/configuraciones.png"))); // NOI18N
        btnConfig.setToolTipText("Configuracion de preguntas y temas!");
        btnConfig.setBorderPainted(false);
        btnConfig.setContentAreaFilled(false);
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 70, 70));

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logocirculofin_Chiquito.png"))); // NOI18N
        add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 140));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnStudy;
    private javax.swing.JButton btnUserManual;
    private javax.swing.JLabel jlbLogo;
    // End of variables declaration//GEN-END:variables
}
