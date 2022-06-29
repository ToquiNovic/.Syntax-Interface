
package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copy {
    public static boolean copyFile(File sourse, File dest) {
        try {
            Files.copy(sourse.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Copy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
