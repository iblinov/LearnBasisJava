package by.bsu2.streams;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public interface FileHandler {
    static final String FILE_NAME = "files\\dat\\text.txt";

    /**
     * Parameters equivalent to parameters in FileSystems.getDefault().getPath(String first, String more)
     * @param firstPath
     * @param morePath
     * @return list which elements are file lines
     */
     static List<String> linesList(String firstPath, String... morePath) throws CustomException {


        Path path = FileSystems.getDefault(). getPath(firstPath, morePath);
        Stream<String> lines = null;
        try {
            lines = Files.lines(path);
        } catch (IOException e) {
           throw new CustomException("IOException e", e);
        }
        List<String> listNames = new ArrayList<>();
        if (lines != null) {
            lines.forEach(listNames::add);
        }
        if (listNames.isEmpty()) {
            throw new CustomException("file is empty");
        }
        return listNames;
    }
}
