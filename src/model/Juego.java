package model;

public class Juego {
    
    public static final String PASSWORD = "1234";

    private String name;
    private int countErrors;
    private int countCorrec;
    private int nivel;
    
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
    }
}
