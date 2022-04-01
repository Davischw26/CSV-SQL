 

import java.io.File;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChoose extends Application {
    private static File file;
    private String fileType = null;

    public void setFileType(String FileType) {
        fileType = FileType;
    }

    @Override
    public void start(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(fileType, "*." + fileType));
        file = fileChooser.showOpenDialog(primaryStage);
    }

    public String getFilePath() {
        String path = file.getPath();
        return path;
    }
}