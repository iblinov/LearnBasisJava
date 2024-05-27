package by.bsu2.optional;

import java.io.*;
import java.util.Optional;


public class BuildOptionalReader {
    public final static String DEFAULT_DIR = "hidden/";
    public static String buildPath(String filename) { // java 7
        if (filename == null || filename.isEmpty()) {
            return null;
        }
        filename = DEFAULT_DIR + filename;
        if (!new File(filename).exists()) {
            return null;
        }
        return filename;
    }
    public static Optional<String> buildPathSafe(String filename) { // java 8
        if (filename == null || filename.isEmpty() || !new File(filename).exists()) {
            return Optional.empty();
        }
        return Optional.of(DEFAULT_DIR+filename);
    }
    public static Optional<BufferedReader> buildReader(String filename) { // java 8
        if (filename == null || filename.isEmpty() || !new File(DEFAULT_DIR+filename).exists()) {
            return Optional.empty();
        }
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(DEFAULT_DIR+filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.of(reader);
    }
}
