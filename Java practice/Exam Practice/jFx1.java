import javafx.application.*;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
// import javafx.event.EventHandler;

public class jFx1 extends Application {

    public void start(Stage PrimaryStage) {

        Button btn = new Button("Rashmin Here");
        Button home = new Button("Home");
        Label lab = new Label("Hello Future Coder!!");
        Label emp = new Label("");

        StackPane pn = new StackPane();
        
        pn.getChildren().addAll(btn);
        GridPane pn1 = new GridPane();
        pn1.setVgap(50);
        pn1.addRow(0, emp);
        pn1.addRow(1, lab);
        pn1.addRow(2, home);


        Scene first = new Scene(pn, 400, 400);
        Scene second = new Scene(pn1, 400, 400);

        PrimaryStage.setTitle("First javaFx program");
        PrimaryStage.setScene(first);
        PrimaryStage.show();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                PrimaryStage.setScene(second);

            }

        });

        home.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                PrimaryStage.setScene(first);
        PrimaryStage.setTitle("First javaFx program");


            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}