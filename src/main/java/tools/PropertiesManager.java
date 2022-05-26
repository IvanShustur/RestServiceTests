package tools;

public class PropertiesManager {
    private PropertiesManager() {
    }

    public static String getValidAuthorFilePath() {
        return PropertiesReader.readProperties("valid_author_file_path");
    }

    public static String getUpdatedAuthorFilePath() {
        return PropertiesReader.readProperties("updated_author_file_path");
    }

}
