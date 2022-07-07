import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Slider;



public class slider extends Application {

    public void start(Stage primaryStage) {
        
        Slider slider= new Slider(0,500,100);
        Slider slider2= new Slider(0,500,100);
        slider2.setOrientation(Orientation.VERTICAL);
        
        StackPane sp=new StackPane();
        sp.getChildren().add(slider);
        sp.getChildren().add(slider2);

        Scene first= new Scene(sp,600,600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
        
    
}
