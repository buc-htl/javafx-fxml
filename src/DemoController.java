import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoController {

    @FXML
    private TextField fEingabe;

    @FXML
    private Label lAusgabe;


    @FXML
    protected void handleAusgebenButtonAction(ActionEvent event) {

        lAusgabe.setText(fEingabe.getText());
    }
}
