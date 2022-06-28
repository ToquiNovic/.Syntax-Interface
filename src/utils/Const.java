package utils;

public class Const {

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    public static final String PATH = System.getProperty("user.dir");

    public static final String PATH_SCORE = String.format("%s%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "data", FILE_SEPARATOR, "score.txt");
    public static final String PATH_BOOKS = String.format("%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "books", FILE_SEPARATOR);
    public static final String PATH_USER_MANUAL = String.format("%s%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "user", FILE_SEPARATOR , "userManual.pdf");
}
