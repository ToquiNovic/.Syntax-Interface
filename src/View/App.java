package View;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Juego;
import utils.Const;
import utils.Read;

public class App extends JFrame {

    public static final Font FONT = new Font("Roboto Condensed", Font.PLAIN, 18);

    public App() throws HeadlessException {
        init();
        initComponents();
    }

    private void init() {
        setTitle(".Syntax");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private boolean checkPassword() {
        String result = JOptionPane.showInputDialog(this, "Ingresa la contraseña!");
        if (result != null && result.equals(Juego.PASSWORD)) {
            return true;
        }
        if (result != null) {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta!");
        }
        return false;
    }

    private void initComponents() {
        juego = new Juego();

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        inicio = new Inicio();
        inicio.getBtnPlay().addActionListener(l -> {
            cardLayout.show(getContentPane(), "configGame");
        });
        inicio.getBtnScore().addActionListener(l -> {
            if (checkPassword()) {
                score.setData();
                cardLayout.show(getContentPane(), "score");
            }
        });
        inicio.getBtnStudy().addActionListener(l -> {
            cardLayout.show(getContentPane(), "study");
        });
        inicio.getBtnUserManual().addActionListener(l -> {
            Read.openPdf(Const.PATH_USER_MANUAL);
        });
        inicio.getBtnConfig().addActionListener(l -> {
            if (checkPassword()) {
                cardLayout.show(getContentPane(), "config");
            }
        });

        previousGame = new PreviousGame();
        previousGame.getBtnBack().addActionListener(l -> {
            previousGame.clearView();
            cardLayout.show(getContentPane(), "inicio");
        });
        previousGame.getBtnPlay().addActionListener(l -> {
            if (previousGame.isOk()) {
                previousGame.clearView();
                juego.setName(previousGame.getNamePlayer());
                cardLayout.show(getContentPane(), "game");
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa tu nombre!");
            }
        });

        game = new Game();
        game.getBtnBack().addActionListener(l -> {
            int resul = JOptionPane.showConfirmDialog(this, "Seguro deseas salir perderas el progreso!");
            if (resul == 0) {
                juego.clear();
                cardLayout.show(getContentPane(), "inicio");
            }
        });

        score = new Puntaje();
        score.getBtnBack().addActionListener(l -> {
            cardLayout.show(getContentPane(), "inicio");
        });

        teoriaLibros = new TeoriaLibros();
        teoriaLibros.getBtnBack().addActionListener(l -> {
            cardLayout.show(getContentPane(), "inicio");
        });

        configuracion = new Configuracion();
        configuracion.getBtnBack().addActionListener(l -> {
            cardLayout.show(getContentPane(), "inicio");
        });
        configuracion.getBtnTema().addActionListener(l-> {
            cardLayout.show(getContentPane(), "editTema");
        });
        configuracion.getBtnPregunta().addActionListener(l -> {
            cardLayout.show(getContentPane(), "editPregunta");
        });
        
        editTema = new EditTema();
        editTema.getBtnBack().addActionListener(l -> {
            editTema.clearView();
            cardLayout.show(getContentPane(), "config");
        });
        
        editPregunta = new EditPregunta();
        editPregunta.getBtnBack().addActionListener(l -> {
            editPregunta.clearView();
            cardLayout.show(getContentPane(), "config");
        });
        

        add(inicio, "inicio");
        add(previousGame, "configGame");
        add(game, "game");
        add(score, "score");
        add(teoriaLibros, "study");
        add(configuracion, "config");
        add(editTema, "editTema");
        add(editPregunta, "editPregunta");
    }

    private CardLayout cardLayout;

    private Inicio inicio;
    private PreviousGame previousGame;
    private Puntaje score;
    private Game game;
    private TeoriaLibros teoriaLibros;
    private Configuracion configuracion;
    private EditTema editTema;
    private EditPregunta editPregunta;

    private Juego juego;

    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", FONT);
        UIManager.put("OptionPane.buttonFont", FONT);

        App main = new App();
        main.pack();
        main.setVisible(true);
    }
}
