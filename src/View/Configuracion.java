
package View;

public class Configuracion extends javax.swing.JPanel {

 
    public Configuracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnatras_admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnedit_Pregunta = new javax.swing.JButton();
        btnedit_tema = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnatras_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnatras_admin.setBorderPainted(false);
        btnatras_admin.setContentAreaFilled(false);
        add(btnatras_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Admin.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 530, 50));

        btnedit_Pregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Preguntas (782 × 500 px).png"))); // NOI18N
        btnedit_Pregunta.setBorderPainted(false);
        btnedit_Pregunta.setContentAreaFilled(false);
        add(btnedit_Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 550, 100));

        btnedit_tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Tema (782 × 500 px).png"))); // NOI18N
        btnedit_tema.setBorderPainted(false);
        btnedit_tema.setContentAreaFilled(false);
        add(btnedit_tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 420, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 880, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnatras_admin;
    private javax.swing.JButton btnedit_Pregunta;
    private javax.swing.JButton btnedit_tema;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
