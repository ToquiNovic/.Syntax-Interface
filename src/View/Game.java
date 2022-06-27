
package View;

public class Game extends javax.swing.JPanel {

 
    public Game() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnatras_admin_editPreguntas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnatras_admin_editPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnatras_admin_editPreguntas.setBorderPainted(false);
        btnatras_admin_editPreguntas.setContentAreaFilled(false);
        add(btnatras_admin_editPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Arg[]");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 74, 400, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-game.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 440, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-siguiente.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel_Pregunta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 830, 80));

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
    private javax.swing.JButton btnatras_admin_editPreguntas;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
