package View;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JPanel {

    public Game() {
        initComponents();
    }

    public void setArgs(String args[]) {
        textArgs.setText("args[0]: " + args[0]);
        textArgs1.setText("args[1]: " + args[1]);
    }

    public void clearView() {
        textArgs.setText("args[0]: ");
        textArgs1.setText("args[1]: ");
        inputAnswer.setText("");
        displayImg.setIcon(null);
    }

    public void clearInputAnswer() {
        inputAnswer.setText("");
    }

    public JButton getBtnNext() {
        return btnNext;
    }

    public String getAnswer() {
        return inputAnswer.getText();
    }

    public boolean isOk() {
        if (inputAnswer.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa una respuesta!");
            return false;
        }
        return true;
    }

    public void setImage(File file) {
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            displayImg.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
            displayImg.setIcon(imageIcon);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo visualizar la imagen!");
        }
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
        btnNext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputAnswer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayImg = new javax.swing.JLabel();
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

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-siguiente.png"))); // NOI18N
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel_Pregunta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 790, 80));

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel3.setText("Respuesta: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        inputAnswer.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        inputAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnswerActionPerformed(evt);
            }
        });
        add(inputAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 280, 30));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(displayImg);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 152, 780, 250));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 890, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void inputAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAnswerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel displayImg;
    private javax.swing.JTextField inputAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textArgs;
    private javax.swing.JLabel textArgs1;
    // End of variables declaration//GEN-END:variables
}
