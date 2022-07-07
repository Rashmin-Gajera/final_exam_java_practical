import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class addCircle extends Application {

    public void start(Stage firstStage) {
        Circle circle = new Circle(200);
        circle.setFill(Color.rgb(255, 0, 0));
        
        StackPane st= new StackPane();
        st.getChildren().add(circle);
        Scene first= new Scene(st, 600, 600);
        firstStage.setTitle("Scene with the Red circle");
        firstStage.setScene(first);
        firstStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
