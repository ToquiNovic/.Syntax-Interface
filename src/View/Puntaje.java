package View;

import javax.swing.JButton;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import utils.Read;

public class Puntaje extends javax.swing.JPanel {

    public Puntaje() {
        initComponents();
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setData() {
        TableModel model = tableScore.getModel();
        Object[][] data = Read.getModelScore();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                model.setValueAt(data[i][j], i, j);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableScore = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-puntaje.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 440, 50));

        jScrollPane1.setBackground(new java.awt.Color(22, 2, 30));

        tableScore.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tableScore.setFont(new java.awt.Font("FreeMono", 0, 18)); // NOI18N
        tableScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nivel", "Correctas", "Incorrectas", "Puntaje"
            }
        ));
        jScrollPane1.setViewportView(tableScore);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 720, 190));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 890, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableScore;
    // End of variables declaration//GEN-END:variables
}
