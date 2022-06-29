
package View;

public class EditPregunta extends javax.swing.JPanel {

 
    public EditPregunta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnatras_admin_editPreguntas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        selectNivel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        viewImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewJava = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnatras_admin_editPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnatras_admin_editPreguntas.setBorderPainted(false);
        btnatras_admin_editPreguntas.setContentAreaFilled(false);
        add(btnatras_admin_editPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Preguntas_chiquito.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 340, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/agregar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 140, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eliminar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 180, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/consultar.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 190, 50));

        selectNivel.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        selectNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        selectNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNivelActionPerformed(evt);
            }
        });
        add(selectNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel_Pregunta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 830, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cargar.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 50));

        viewImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(viewImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 390, 240));

        viewJava.setEditable(false);
        viewJava.setColumns(20);
        viewJava.setRows(5);
        jScrollPane1.setViewportView(viewJava);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 360, 240));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 880, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectNivelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnatras_admin_editPreguntas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectNivel;
    private javax.swing.JLabel viewImg;
    private javax.swing.JTextArea viewJava;
    // End of variables declaration//GEN-END:variables
}
