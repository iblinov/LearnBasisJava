
package by.bsu2.forkjoin.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileUtils {
    
    public static int getLineCount(File file) throws IOException {
        try(LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {
            lnr.skip(Long.MAX_VALUE);
            return lnr.getLineNumber();
        }
    }
    
    public static String getFileExtension(String fileName) {
        String extension = "";
        int dotPosition = fileName.lastIndexOf('.');
        if (dotPosition != -1) {
            extension = fileName.substring(dotPosition + 1).toLowerCase().trim();
        }
        return extension;
    }
    
    public static String getFileExtension(File file) {
        return getFileExtension(file.getName());
    }
    
}