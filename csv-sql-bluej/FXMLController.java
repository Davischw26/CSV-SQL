 

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FXMLController {

    @FXML
    private TextField selectedCsvFile;
    
    @FXML
    private Label updatedCsvFile;   
    
    public FileChoose fc;
    public Boolean csv_sql;

    public void initialize() {
        
    }

    @FXML
    private void OpenCSVChooser(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        fc = new FileChoose();
        fc.setFileType("csv");
        fc.start(stage);
        selectedCsvFile.setText(fc.getFilePath());
    }
    
    @FXML
    private void UpdateTable(ActionEvent event) {
        updatedCsvFile.setText(fc.getFilePath());
        
        CSVReader csvr = new CSVReader();
        csvr.setPath(updatedCsvFile.getText());
        
      
        
        try { 
            
            
        } catch (Exception ex) {

        }

    }
    
    @FXML
    private void setTrue(ActionEvent event) {
        csv_sql = !csv_sql;

    }
}