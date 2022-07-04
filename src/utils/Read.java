package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Read {

    public static String[] listOfBooks() {
        File[] files = new File(Const.PATH_BOOKS).listFiles();

        if (files.length == 0) {
            return new String[0];
        }

        String[] names = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            names[i] = files[i].getName();
        }

        return names;
    }

    public static String[] listOfJava(int level) {
        File[] files = new File(Const.getPathJava(level)).listFiles();

        if (files.length == 0) {
            return new String[0];
        }

        String[] names = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            names[i] = files[i].getName();
        }

        return names;
    }

    public static File fileOfJavaLevel(String name, int level) {
        File file = new File(Const.getPath(level, Tipo.JAVA) + name);

        return file;
    }
    
    public static File fileOfImgLevel(String name, int level){
        File files[] = new File(Const.getPathImg(level)).listFiles();
        
        for (File file : files) {
            if (file.getName().contains(name.split("\\.")[0])) {
                return file;
            }
        }
        return null;
    }

    public static void openBooksPdf(String name) {
        File file = new File(Const.PATH_BOOKS + name);
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void openPdf(String path) {
        File file = new File(path);
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getModelScore() {
        StringBuilder returnData = new StringBuilder();
        returnData.append(String.format("%s %12s %12s %12s %12s\n", "NOMBRE", "NIVEL", "CORRECTAS", "ERRORES", "PUNTAJE"));
        
        File file = new File(Const.PATH_SCORE);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try ( Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    String []data = sc.nextLine().split(",");
                    returnData.append(String.format("%s %12s %12s %12s %12s\n", data[0], data[1], data[2], data[3], data[4]));
                }
            }
        } catch (IOException e) {
        }

        return returnData.toString();
    }

    public static ArrayList<String> getNamesQuestions(int level) {
        File[] files = new File(Const.getPathJava(level)).listFiles();
        ArrayList<String> namesQuestions = new ArrayList<>();

        for (File file : files) {
            namesQuestions.add(file.getName().split("\\.")[0]);
        }

        return namesQuestions;
    }

    public static File getImgFromName(String name, int level) {
        File[] files = new File(Const.getPathImg(level)).listFiles();

        for (File file : files) {
            if (file.getName().startsWith(name)) {
                return file;
            }
        }

        return null;
    }

    public static int getCantidadFiles(String path) {
        return new File(path).listFiles().length;
    }

    public static int getCantidadQuestionsLevel0() {
        return getCantidadFiles(Const.PATH_QUESTION_JAV_LEVEL_0);
    }

    public static int getCantidadQuestionsLevel1() {
        return getCantidadFiles(Const.PATH_QUESTION_JAV_LEVEL_1);
    }

    public static int getCantidadQuestionsLevel2() {
        return getCantidadFiles(Const.PATH_QUESTION_JAV_LEVEL_2);
    }

    public static int getCantidadLevel(int level) {
        switch (level) {
            case 0:
                return getCantidadQuestionsLevel0();
            case 1:
                return getCantidadQuestionsLevel1();
            case 2:
                return getCantidadQuestionsLevel2();
            default:
                throw new AssertionError();
        }
    }
}
