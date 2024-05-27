package by.bsu2.forkjoin.folderprocessor;

import by.bsu2.forkjoin.utility.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveTask;


public class FolderProcessor extends RecursiveTask<List<FileInfo>> {


    public static final List<String> EXTENSIONS = Arrays.asList(new String[]{"java", "xml", "json", "html", "css"});

    private File folder;
    private List<FileInfo> fileInfoList;
    private List<FolderProcessor> subFolderTaskList;

    public FolderProcessor(String folderPath) {
        folder = new File(folderPath);
        fileInfoList = new ArrayList<>();
        subFolderTaskList = new ArrayList<>();
    }

    public FolderProcessor(File folder) {
        this.folder = folder;
        fileInfoList = new ArrayList<>();
        subFolderTaskList = new ArrayList<>();
    }

    @Override
    protected List<FileInfo> compute() {
        try {
            File[] folderContent = folder.listFiles();
            if (folderContent != null) {
                for (int i = 0; i < folderContent.length; i++) {
                    if (folderContent[i].isDirectory()) {
                        FolderProcessor task = new FolderProcessor(folderContent[i]);
                        subFolderTaskList.add(task);
                        task.fork();
                    } else if (EXTENSIONS.contains(FileUtils.getFileExtension(folderContent[i]))) {
                        fileInfoList.add(new FileInfo(folderContent[i].getName(), FileUtils.getLineCount(folderContent[i])));
                    }
                }
            }
            subFolderTaskList.forEach(i -> fileInfoList.addAll(i.join()));
        } catch(IOException e) {

        }
        return fileInfoList;
    }
    
}