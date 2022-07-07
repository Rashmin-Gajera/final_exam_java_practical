import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;


public class radioButton extends Application {

    public void start(Stage primaryStage) {
        
        RadioButton c1Box= new RadioButton("Male");
        RadioButton c2Box= new RadioButton("Female");
        RadioButton c3Box= new RadioButton("Other");
        Label country= new Label("Gneder:");

        GridPane choice = new GridPane();
        choice.setHgap(10);
        choice.setVgap(10);
        choice.addColumn(0, country);
        choice.addColumn(1,c1Box,c2Box,c3Box);


        Scene first= new Scene(choice,600,600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
        
    
}