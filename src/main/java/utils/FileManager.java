package utils;

import tools.PropertiesManager;

import java.util.List;

public class FileManager {

    private FileManager() {
    }

    public static Author getValidAuthor() {
        return FileReader.readObject(PropertiesManager.getValidAuthorFilePath(), Author.class);
    }
    public static Author getUpdatedAuthor() {
        return FileReader.readObject(PropertiesManager.getUpdatedAuthorFilePath(), Author.class);
    }

}