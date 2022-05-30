import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExampleCode extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Beispiel");
        stage.setMinHeight(150);
        stage.setMinWidth(250);

        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 300, 200); // w, h
        stage.setScene(scene);


        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10)); // top, right, bottom, left


        Label lEingabe = new Label("Eingabe:");
        TextField fEingabe = new TextField();
        Button btnAusgabe = new Button("Ausgeben");
        btnAusgabe.setPrefHeight(40);
        btnAusgabe.setPrefWidth(100);
        btnAusgabe.setDefaultButton(true);
        Label lAusgabe = new Label("");

        gridPane.add(lEingabe, 0, 0);
        gridPane.add(fEingabe, 1, 0);
        gridPane.add(btnAusgabe, 1, 2,2,1);
        gridPane.add(lAusgabe, 1, 3);

        GridPane.setHalignment(lEingabe, HPos.RIGHT);

        btnAusgabe.setOnAction( new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                lAusgabe.setText(fEingabe.getText());
            }
        });
        //gridPane.setGridLinesVisible(true); // uncomment the line to see the grid
        stage.show();
    }

}


