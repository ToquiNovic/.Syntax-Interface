package View;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utils.Const;
import utils.Copy;
import utils.Read;
import utils.Tipo;

public class EditPregunta extends javax.swing.JPanel {

    private File fileImg;
    private File fileJava;

    private JFileChooser fileChooser;

    public EditPregunta() {
        initComponents();
        init();
    }

    private void init() {
        fileChooser = new JFileChooser();
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void clearView() {
        viewImg.setIcon(null);
        viewJava.setText("");
        inputQuestionName.setText("");
        fileImg = null;
        fileJava = null;
    }

    public void setTextInputQuestionName(String name) {
        inputQuestionName.setText(name);
    }

    private Tipo preguntarTipo() {
        String tipos[] = {"Java", "Img"};
        String tipoSeled = (String) JOptionPane.showInputDialog(this, "Que quieres Subir?: \n \"Tipo Archivo\"", "Subir Question!", JOptionPane.PLAIN_MESSAGE, null, tipos, tipos[0]);
        if (tipoSeled == null) {
            return null;
        } else {
            if (tipoSeled.equals(tipos[0])) {
                return Tipo.JAVA;
            }
            return Tipo.IMG;
        }
    }

    private boolean isCorrect() {
        if (fileImg == null) {
            JOptionPane.showMessageDialog(this, "Carga el archivo de imagen!");
            return false;
        }

        if (fileJava == null) {
            JOptionPane.showMessageDialog(this, "Carga el archivo Java!");
            return false;
        }
        return true;
    }

    private boolean isJava(String name) {
        return name.endsWith(".java");
    }

    private boolean isImage(String name) {
        return name.endsWith(".png") || name.endsWith(".gif") || name.endsWith(".jpeg") || name.endsWith(".svg");
    }

    private void setImage(File file) {
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            viewImg.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
            viewImg.setIcon(imageIcon);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se puede previsualizar la imagen!");
        }
    }

    private void setJava(File file) {
        try {
            try ( FileReader fileReader = new FileReader(file);  BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while (bufferedReader.ready()) {
                    viewJava.append(bufferedReader.readLine() + "\n");
                }
            }
        } catch (IOException e) {
        }
    }

    private String getTipoImage(String name) {
        return name.split("\\.")[1];
    }

    private String getNombreArchivo(String name) {
        return name.split("\\.")[0];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        selectNivel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewJava = new javax.swing.JTextArea();
        inputQuestionName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hacia-atras (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar Preguntas_chiquito.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 340, 50));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/agregar.png"))); // NOI18N
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/consultar.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 190, 50));

        selectNivel.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        selectNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        selectNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNivelActionPerformed(evt);
            }
        });
        add(selectNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel_Pregunta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 810, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cargar.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 170, 50));

        viewImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(viewImg);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 390, 240));

        viewJava.setEditable(false);
        viewJava.setColumns(20);
        viewJava.setRows(5);
        jScrollPane1.setViewportView(viewJava);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 360, 240));

        inputQuestionName.setEditable(false);
        inputQuestionName.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        add(inputQuestionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 414, 220, 30));

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE PREGUNTA:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void selectNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectNivelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Tipo tipo = preguntarTipo();
        if (tipo != null) {
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                switch (tipo) {
                    case IMG:
                        fileImg = fileChooser.getSelectedFile();
                        if (!isImage(fileImg.getName())) {
                            fileImg = null;
                            JOptionPane.showMessageDialog(this, "Elige un archivo tipo .png, .gif, .jpeg o .svg");
                        } else {
                            setImage(fileImg);
                        }
                        break;
                    case JAVA:
                        fileJava = fileChooser.getSelectedFile();
                        if (!isJava(fileJava.getName())) {
                            fileJava = null;
                            JOptionPane.showMessageDialog(this, "Elige un Archivo Java");
                        } else {
                            setJava(fileJava);
                            setTextInputQuestionName(getNombreArchivo(fileJava.getName()));
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (isCorrect()) {
            String nombreArchivo = getNombreArchivo(fileJava.getName());

            File copyFileImg = new File(Const.getPathImg(selectNivel.getSelectedIndex()) + nombreArchivo + "." + getTipoImage(fileImg.getName()));
            File copyFileJava = new File(Const.getPathJava(selectNivel.getSelectedIndex()) + fileJava.getName());

            if (Copy.copyFile(fileImg, copyFileImg) && Copy.copyFile(fileJava, copyFileJava)) {
                JOptionPane.showMessageDialog(this, "Archivos Copiados Exitosamente!");
                clearView();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "Nivel Facil: " + Read.getCantidadQuestionsLevel0() + "\n"
                + "Nivel Medio: " + Read.getCantidadQuestionsLevel1() + "\n"
                + "Nivel Dificil: " + Read.getCantidadQuestionsLevel2(),
                "Cantidad preguntas por Nivel",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField inputQuestionName;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selectNivel;
    private javax.swing.JLabel viewImg;
    private javax.swing.JTextArea viewJava;
    // End of variables declaration//GEN-END:variables
}
