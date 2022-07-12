
package View;

import javax.swing.JButton;

public class PreviousGame extends javax.swing.JPanel {

 
    public PreviousGame() {
        initComponents();
    }
    
    public String getNamePlayer() {
        return inputName.getText();
    }
    
    public int getLevelGame() {
        return selectNivel.getSelectedIndex();
    }
    
    public void clearView() {
        inputName.setText("");
        selectNivel.setSelectedIndex(0);
    }
    
    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnPlay() {
        return btnPlay;
    }
    
    public boolean isOk() {
        return !inputName.getText().equals("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectNivel = new javax.swing.JComboBox<>();
        inputName = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-game.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 440, 50));

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-jugar.png"))); // NOI18N
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-nivel.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 250, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-nombre.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 40));

        selectNivel.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        selectNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        add(selectNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 160, 30));

        inputName.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        inputName.setBorder(null);
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });
        add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 160, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 890, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlay;
    private javax.swing.JTextField inputName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> selectNivel;
    // End of variables declaration//GEN-END:variables
}
