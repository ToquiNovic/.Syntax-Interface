package utils;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {

    public static void saveScore(String line) {
        try {
            PrintWriter printWriter;
            try (FileWriter fileWriter = new FileWriter(Const.PATH_SCORE, true)) {
                printWriter = new PrintWriter(fileWriter);
                printWriter.print(line);
            }
            printWriter.close();
        } catch (IOException e) {
        }
    }
}
