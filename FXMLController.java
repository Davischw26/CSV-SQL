import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FXMLController 
{

    @FXML
    private TextField csvFile;
    @FXML
    private TableView table;

    public void initialize() 
    {
    }

    @FXML
    private void OpenCSVChooser(ActionEvent event) 
    {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        FileChoose fc = new FileChoose();
        fc.setFileType("csv");
        fc.start(stage);        
        csvFile.setText(fc.getFilePath());
    }

    @FXML
    private void UpdateTable(ActionEvent event) 
    {

        CSVReader csvr = new CSVReader();
        csvr.setPath(csvFile.getText());

        
        try
        {
            csvr.run(); 
        } 
        catch (Exception ex) 
        {
            // Fehlerbehandlung
        }
        
        
        

    }
}