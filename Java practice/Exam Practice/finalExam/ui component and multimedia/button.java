import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;



public class button extends Application {

    public void start(Stage primaryStage) {
        
        Button btn= new Button("Hello coder!!");
        btn.setTextFill(Color.rgb(255,0,0,0.5));
        StackPane sp=new StackPane();
        sp.getChildren().add(btn);
        Scene first= new Scene(sp,600,600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
        
    
}
