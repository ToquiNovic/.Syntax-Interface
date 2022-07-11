package View;

import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utils.Const;
import utils.Copy;
import utils.Read;

public class EditTema extends javax.swing.JPanel {

    private JFileChooser fileChooser;
    private File file = null;

    public EditTema() {
        initComponents();
        init();
    }

    private void init() {
        fileChooser = new JFileChooser();
    }

    public JButton getBtnBack() {
        return btnatras_admin_editPreguntas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnatras_admin_editPreguntas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputOrigin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnatras_admin_editPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnatras_admin_editPreguntas.setBorderPainted(false);
        btnatras_admin_editPreguntas.setContentAreaFilled(false);
        add(btnatras_admin_editPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Tema.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 200, 50));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/agregar.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 140, 50));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 200, 50));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/consultar.png"))); // NOI18N
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 210, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel_Pregunta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 830, 80));

        jPanel1.setBackground(new java.awt.Color(22, 2, 30));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 0, 56), 1, true));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar desde");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        inputOrigin.setEditable(false);
        inputOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputOriginActionPerformed(evt);
            }
        });
        jPanel1.add(inputOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 44, 720, 30));

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Titulo del tema");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        inputNombre.setEditable(false);
        jPanel1.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 720, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 780, 240));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cargar.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, 0, 900, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void inputOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputOriginActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (file == null) {
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();

                inputOrigin.setText(file.getAbsolutePath());
                inputNombre.setText(file.getName());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Presiona Cargar!");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void clearView() {
        file = null;
        inputNombre.setText("");
        inputOrigin.setText("");
    }

    private boolean isOk() {
        return !inputNombre.getText().equals("");
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (file != null) {
            if (isOk()) {
                File copyFile = new File(Const.PATH_BOOKS + file.getName());
                Copy.copyFile(file, copyFile);
                JOptionPane.showMessageDialog(this, "Copiado!");
                clearView();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige un archivo!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Object[] names = Read.listOfBooks();
        if (names.length != 0) {
            String nameSeled = (String) JOptionPane.showInputDialog(this, "Elige el Tema: \n \"Para ELIMINAR\"", "Eliminar Tema", JOptionPane.PLAIN_MESSAGE, null, names, names[0]);

            if (nameSeled != null) {
                int result = JOptionPane.showConfirmDialog(this, "Seguro deseas Eliminar: " + nameSeled);
                if (result == 0) {
                    File deleteFile = new File(Const.PATH_BOOKS + nameSeled);
                    deleteFile.delete();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay temas a Eliminar!");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Object[] names = Read.listOfBooks();
        if (names.length != 0) {
            String nameSeled = (String) JOptionPane.showInputDialog(this, "Elige el Tema: \n \"Para CONSULTAR\"", "Consultar Tema", JOptionPane.PLAIN_MESSAGE, null, names, names[0]);
            if (nameSeled != null) {
                Read.openPdf(Const.PATH_BOOKS + nameSeled);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnatras_admin_editPreguntas;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputOrigin;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
