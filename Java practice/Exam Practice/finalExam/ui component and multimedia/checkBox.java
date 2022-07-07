import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;


public class checkBox extends Application {

    public void start(Stage primaryStage) {
        
        CheckBox c1Box= new CheckBox("India");
        CheckBox c2Box= new CheckBox("USA");
        CheckBox c3Box= new CheckBox("Australiya");
        CheckBox c4Box= new CheckBox("Germeny");
        CheckBox c5Box= new CheckBox("Rusia");
        CheckBox c6Box= new CheckBox("Newzeland");
        Label country= new Label("Country");

        GridPane choice = new GridPane();
        choice.setHgap(10);
        choice.setVgap(10);
        choice.addColumn(0, country);
        choice.addColumn(1,c1Box,c2Box,c3Box,c4Box,c5Box,c6Box);


        Scene first= new Scene(choice,600,600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
        
    
}