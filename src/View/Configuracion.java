package View;

import javax.swing.JButton;

public class Configuracion extends javax.swing.JPanel {

    public Configuracion() {
        initComponents();
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnPregunta() {
        return btnPregunta;
    }

    public JButton getBtnTema() {
        return btnTema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPregunta = new javax.swing.JButton();
        btnTema = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Admin.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 530, 50));

        btnPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Preguntas (782 × 500 px).png"))); // NOI18N
        btnPregunta.setBorderPainted(false);
        btnPregunta.setContentAreaFilled(false);
        add(btnPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 550, 100));

        btnTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Tema (782 × 500 px).png"))); // NOI18N
        btnTema.setBorderPainted(false);
        btnTema.setContentAreaFilled(false);
        add(btnTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 420, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 880, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPregunta;
    private javax.swing.JButton btnTema;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
