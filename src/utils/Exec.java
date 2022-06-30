package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Exec {

    public static final String PATH_JAVA_LEVEL_0 = String.format("%s%s%s%s%s%s%s%s", "src", Const.FILE_SEPARATOR, "questions", Const.FILE_SEPARATOR, "java", Const.FILE_SEPARATOR, "level_0", Const.FILE_SEPARATOR);
    public static final String PATH_JAVA_LEVEL_1 = String.format("%s%s%s%s%s%s%s%s", "src", Const.FILE_SEPARATOR, "questions", Const.FILE_SEPARATOR, "java", Const.FILE_SEPARATOR, "level_1", Const.FILE_SEPARATOR);
    public static final String PATH_JAVA_LEVEL_2 = String.format("%s%s%s%s%s%s%s%s", "src", Const.FILE_SEPARATOR, "questions", Const.FILE_SEPARATOR, "java", Const.FILE_SEPARATOR, "level_2", Const.FILE_SEPARATOR);

    public static String getPathLevel(int level) {
        switch (level) {
            case 0:
                return PATH_JAVA_LEVEL_0;
            case 1:
                return PATH_JAVA_LEVEL_1;
            case 2:
                return PATH_JAVA_LEVEL_2;
            default:
                throw new AssertionError();
        }
    }

    public static String execJavaFile(int level, String questionAnterior, String[] args) {
        String comand = String.format("%s%s%s%s%s", "java ", getPathLevel(level), questionAnterior, ".java " ,String.join(" ", args));
        try {
            Process process = Runtime.getRuntime().exec(comand);
            InputStream inputStream = process.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            return new BufferedReader(inputStreamReader).lines().collect(Collectors.joining());
        } catch (IOException e) {
        }

        return "";
    }
}
