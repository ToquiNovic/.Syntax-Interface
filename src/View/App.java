package View;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Juego;
import utils.Const;
import utils.Exec;
import utils.Read;
import utils.Write;

public class App extends JFrame {

    public static final Font FONT = new Font("Roboto Condensed", Font.PLAIN, 18);

    public App() throws HeadlessException {
        init();
        initComponents();
    }

    private void init() {
        setTitle(".Syntax");
        setBounds(100, 100, WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        random = new Random();
        args = new String[2];

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        inicio = new Inicio();
        inicio.getBtnPlay().addActionListener(l -> {
            cardLayout.show(getContentPane(), "configGame");
        });
        inicio.getBtnScore().addActionListener(l -> {
            score.setData();
            cardLayout.show(getContentPane(), "score");
        });
        inicio.getBtnStudy().addActionListener(l -> {
            teoriaLibros.initBooks();
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
            if (isOk()) {
                juego.setName(previousGame.getNamePlayer());
                juego.generarPreguntas(previousGame.getLevelGame());
                juego.setNivel(previousGame.getLevelGame());
                String question = juego.getQuestion();
                generateArgs();
                game.setArgs(args);
                game.setImage(Read.getImgFromName(question, juego.getNivel()));
                previousGame.clearView();
                cardLayout.show(getContentPane(), "game");
            }
        });

        game = new Game();
        game.getBtnBack().addActionListener(l -> {
            int resul = JOptionPane.showConfirmDialog(this, "Seguro deseas salir perderas el progreso!");
            if (resul == 0) {
                juego.clear();
                game.clearView();
                cardLayout.show(getContentPane(), "inicio");
            }
        });
        game.getBtnNext().addActionListener(l -> {
            if (game.isOk()) {

                if (Exec.execJavaFile(juego.getNivel(), juego.getQuestionAnterior(), args).equals(game.getAnswer())) {
                    JOptionPane.showMessageDialog(this, "Respuesta Correcta!");
                    juego.countCorrec();
                } else {
                    JOptionPane.showMessageDialog(this, "Respues incorrecta!");
                    juego.countError();
                }

                if (juego.isOver()) {
                    JOptionPane.showMessageDialog(this, juego.getScoreFormat(), "Juego Terminado!", JOptionPane.INFORMATION_MESSAGE);
                    game.clearView();
                    Write.saveScore(juego.getScore());
                    juego.clear();
                    cardLayout.show(getContentPane(), "inicio");
                } else {
                    String question = juego.getQuestion();

                    generateArgs();
                    game.setArgs(args);
                    game.clearInputAnswer();
                    game.setImage(Read.getImgFromName(question, juego.getNivel()));
                }

            }
        });

        score = new Puntaje();
        score.getBtnBack().addActionListener(l -> {
            cardLayout.show(getContentPane(), "inicio");
        });

        teoriaLibros = new TeoriaLibros();
        teoriaLibros.getBtnBack().addActionListener(l -> {
            teoriaLibros.clearView();
            cardLayout.show(getContentPane(), "inicio");
        });

        configuracion = new Configuracion();
        configuracion.getBtnBack().addActionListener(l -> {
            cardLayout.show(getContentPane(), "inicio");
        });
        configuracion.getBtnTema().addActionListener(l -> {
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

    public void generateArgs() {
        for (int i = 0; i < args.length; i++) {
            args[i] = String.valueOf(random.nextInt(10));
        }
    }

    private boolean isOk() {
        if (!previousGame.isOk()) {
            JOptionPane.showMessageDialog(this, "Ingresa el nombre!");
            return false;
        }
        if (Read.getCantidadLevel(previousGame.getLevelGame()) < Juego.CANTIDAD_PREGUNTAS) {
            JOptionPane.showMessageDialog(this, "No hay suficientes preguntas en ese Nivel!");
            return false;
        }

        return true;
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
    private Random random;
    private String[] args;

    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", FONT);
        UIManager.put("OptionPane.buttonFont", FONT);

        App main = new App();
        main.pack();
        main.setVisible(true);
    }
}
