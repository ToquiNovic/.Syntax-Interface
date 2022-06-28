package View;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import model.Juego;

public class JOptionPanePassword extends javax.swing.JPanel {

    public JOptionPanePassword() {
        initComponents();
    }

    public JButton getBtnSend() {
        return btnSend;
    }

    public JPasswordField getInputPassword() {
        return inputPassword;
    }
    
    public boolean isOk() {
        return inputPassword.getPassword().equals(Juego.PASSWORD);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        btnatras_contrasena = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logocirculofin_Chiquito.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 150, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/contaseña1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 330, 40));
        add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, -1));

        btnatras_contrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnatras_contrasena.setBorderPainted(false);
        btnatras_contrasena.setContentAreaFilled(false);
        add(btnatras_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/validar.png"))); // NOI18N
        btnSend.setBorderPainted(false);
        btnSend.setContentAreaFilled(false);
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 140, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 390, 290));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnatras_contrasena;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
