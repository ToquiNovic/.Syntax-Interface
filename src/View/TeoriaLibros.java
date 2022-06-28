
package View;

import javax.swing.JButton;
import utils.Read;

public class TeoriaLibros extends javax.swing.JPanel {

 
    public TeoriaLibros() {
        initComponents();
        initBooks();
    }
    
    private void initBooks() {
        String names[] = Read.listOfBooks();
        for (String name : names) {
            panelButtons.add(makeButton(name));
        }
    }
    
    private JButton makeButton(String name) {
        JButton button = new JButton(name.replace(".pdf", ""));
        button.setFont(App.FONT);
        button.addActionListener(l -> {
            Read.openBooksPdf(name);
        });
        return button;
    }

    public JButton getBtnBack() {
        return btnBack;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/texto-temas.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 180, 40));

        panelButtons.setBackground(new java.awt.Color(22, 2, 30));
        panelButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 0, 56), 1, true));
        panelButtons.setDoubleBuffered(false);
        panelButtons.setEnabled(false);
        add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 780, 330));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 880, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel panelButtons;
    // End of variables declaration//GEN-END:variables
}
