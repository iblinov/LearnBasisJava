
package by.bsu2.forkjoin.folderprocessor;

import by.bsu2.forkjoin.utility.FileUtils;
import java.util.Comparator;

public class FileInfo {
    
    private String name;
    private int length;

    public FileInfo(String name, int length) {
        this.name = name;
        this.length = length;
    }
    
    public static Comparator<FileInfo> extensionComparator = (first, second) -> {
        int comparison = FileUtils.getFileExtension(first.name).compareTo(FileUtils.getFileExtension(second.name));
        if(comparison != 0) {
            return comparison;
        } else {
            return first.name.compareTo(second.name);
        }
    };
    
    public static Comparator<FileInfo> lengthComparatorDescending = (first, second) -> {
        return second.length - first.length;
    };

    @Override
    public String toString() {
        return name + " " + length + " line(s)";
    }
    
}
