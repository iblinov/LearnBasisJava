package by.bsu2.forkjoin.main;

import by.bsu2.forkjoin.folderprocessor.FileInfo;
import by.bsu2.forkjoin.folderprocessor.FolderProcessor;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;



public class Main {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        FolderProcessor projectsFolder = new FolderProcessor("src/");
        pool.execute(projectsFolder);
        pool.shutdown();
        List<FileInfo> results = projectsFolder.join();
        System.out.println("Project info:");
        Collections.sort(results, FileInfo.lengthComparatorDescending);
        results.forEach(System.out::println);        
    }
    
}