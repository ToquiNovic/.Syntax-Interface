package model;

import java.util.ArrayList;
import java.util.Collections;
import utils.Read;

public class Juego {

    public static final String PASSWORD = "1234";
    public static final int CANTIDAD_PREGUNTAS = 4;

    private ArrayList<String> namesQuestions;
    private String name;
    private int countErrors;
    private int countCorrec;
    private int nivel;
    private int index = 0;

    public void generarPreguntas(int level) {
        namesQuestions = Read.getNamesQuestions(level);
        Collections.shuffle(namesQuestions);
    }

    public String getQuestion() {
        return namesQuestions.get(index++);
    }

    public String getQuestionAnterior() {
        return namesQuestions.get(index - 1);
    }

    public String getName() {
        return name;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountErrors() {
        return countErrors;
    }

    public int getCountCorrec() {
        return countCorrec;
    }

    public int countError() {
        return ++countErrors;
    }

    public int countCorrec() {
        return ++countCorrec;
    }

    public boolean isOver() {
        return index == CANTIDAD_PREGUNTAS;
    }

    public String getScore() {
        return name + "," + nivel + "," + countCorrec + "," + countErrors + "," + (countCorrec * (nivel + 1)) + "\n";
    }

    public String getScoreFormat() {
        return "Nombre: " + name + "\n"
                + "Nivel: " + nivel + "\n"
                + "Correctas: " + countCorrec + "\n"
                + "Incorrectas: " + countErrors + "\n"
                + "Puntaje: " + (countCorrec * (nivel + 1));
    }

    public void clear() {
        name = "";
        countErrors = 0;
        countCorrec = 0;
        nivel = 0;
        index = 0;
        namesQuestions = null;
    }
}
