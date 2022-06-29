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

    public static Object[][] getModelScore() {

        ArrayList<String[]> data = new ArrayList<>();

        File file = new File(Const.PATH_SCORE);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try ( Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    data.add(sc.nextLine().split(","));
                }
            }
        } catch (IOException e) {
        }

        Object[][] returnData = new Object[data.size()][5];

        int index = 0;
        for (String[] dat : data) {
            returnData[index++] = dat;
        }

        return returnData;
    }
}