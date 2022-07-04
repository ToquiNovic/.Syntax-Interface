package View;

import javax.swing.JButton;
import utils.Read;


public class Puntaje extends javax.swing.JPanel {

    public Puntaje() {
        initComponents();
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setData() {
        textScore.setText(Read.getModelScore());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textScore = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-puntaje.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 440, 50));

        textScore.setEditable(false);
        textScore.setColumns(20);
        textScore.setFont(new java.awt.Font("FreeMono", 0, 24)); // NOI18N
        textScore.setRows(5);
        jScrollPane2.setViewportView(textScore);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 760, 290));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 890, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textScore;
    // End of variables declaration//GEN-END:variables
}
