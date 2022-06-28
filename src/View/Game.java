package View;

import javax.swing.JButton;

public class Game extends javax.swing.JPanel {

    public Game() {
        initComponents();
    }

    public void setArgs(String args[]) {
        textArgs.setText("args[0]: " + args[0]);
        textArgs1.setText("args[1]: " + args[1]);
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        textArgs1 = new javax.swing.JLabel();
        textArgs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        textArgs1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        textArgs1.setForeground(new java.awt.Color(255, 255, 255));
        textArgs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textArgs1.setText("args[1]: ");
        add(textArgs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 220, 50));

        textArgs.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        textArgs.setForeground(new java.awt.Color(255, 255, 255));
        textArgs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textArgs.setText("args[0]: ");
        add(textArgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-game.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 440, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-siguiente.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel_Pregunta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 790, 80));

        jPanel1.setBackground(new java.awt.Color(22, 2, 30));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 0, 56), 1, true));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 780, 240));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 890, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textArgs;
    private javax.swing.JLabel textArgs1;
    // End of variables declaration//GEN-END:variables
}
