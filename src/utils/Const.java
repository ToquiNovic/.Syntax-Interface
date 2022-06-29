package utils;

public class Const {

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    public static final String PATH = System.getProperty("user.dir");

    public static final String PATH_SCORE = String.format("%s%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "data", FILE_SEPARATOR, "score.txt");
    public static final String PATH_BOOKS = String.format("%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "books", FILE_SEPARATOR);
    public static final String PATH_USER_MANUAL = String.format("%s%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "user", FILE_SEPARATOR, "userManual.pdf");

    public static final String PATH_QUESTION = String.format("%s%s%s%s%s%s", PATH, FILE_SEPARATOR, "src", FILE_SEPARATOR, "questions", FILE_SEPARATOR);
    public static final String PATH_QUESTION_IMG = String.format("%s%s%s", PATH_QUESTION, "img", FILE_SEPARATOR);
    public static final String PATH_QUESTION_JAV = String.format("%s%s%s", PATH_QUESTION, "java", FILE_SEPARATOR);

    public static final String PATH_QUESTION_IMG_LEVEL_0 = String.format("%s%s%s", PATH_QUESTION_IMG, "level_0", FILE_SEPARATOR);
    public static final String PATH_QUESTION_IMG_LEVEL_1 = String.format("%s%s%s", PATH_QUESTION_IMG, "level_1", FILE_SEPARATOR);
    public static final String PATH_QUESTION_IMG_LEVEL_2 = String.format("%s%s%s", PATH_QUESTION_IMG, "level_2", FILE_SEPARATOR);

    public static final String PATH_QUESTION_JAV_LEVEL_0 = String.format("%s%s%s", PATH_QUESTION_JAV, "level_0", FILE_SEPARATOR);
    public static final String PATH_QUESTION_JAV_LEVEL_1 = String.format("%s%s%s", PATH_QUESTION_JAV, "level_1", FILE_SEPARATOR);
    public static final String PATH_QUESTION_JAV_LEVEL_2 = String.format("%s%s%s", PATH_QUESTION_JAV, "level_2", FILE_SEPARATOR);

    public static String getPath(int level, Tipo tipo) {
        switch (tipo) {
            case IMG:
                return getPathImg(level);
            case JAVA:
                return getPathJava(level);
            default:
                throw new AssertionError();
        }
    }

    public static String getPathImg(int level) {
        switch (level) {
            case 0:
                return PATH_QUESTION_IMG_LEVEL_0;
            case 1:
                return PATH_QUESTION_IMG_LEVEL_1;
            case 2:
                return PATH_QUESTION_IMG_LEVEL_2;
            default:
                throw new AssertionError();
        }
    }

    public static String getPathJava(int level) {
        switch (level) {
            case 0:
                return PATH_QUESTION_JAV_LEVEL_0;
            case 1:
                return PATH_QUESTION_JAV_LEVEL_1;
            case 2:
                return PATH_QUESTION_JAV_LEVEL_2;
            default:
                throw new AssertionError();
        }
    }
}
