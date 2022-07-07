import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;


public class label extends Application {

    public void start(Stage primaryStage) {
        
        Label l1= new Label("Hello coder");
        StackPane sp=new StackPane();
        sp.getChildren().add(l1);
        Scene first= new Scene(sp,600,600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
        
    
}