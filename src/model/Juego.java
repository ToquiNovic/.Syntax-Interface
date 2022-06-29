package model;

public class Juego {
    
    public static final String PASSWORD = "1234";
    public static final int CANTIDAD_PREGUNTAS = 4;

    private String[] nameQuestions;
    private String name;
    private int countErrors;
    private int countCorrec;
    private int nivel;

    public void generarPreguntas() {
        nameQuestions = new String[CANTIDAD_PREGUNTAS];
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

    public void clear() {
        name = "";
        countErrors = 0;
        countCorrec = 0;
        nivel = 0;
        nameQuestions = null;
    }
}
