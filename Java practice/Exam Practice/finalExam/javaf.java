import java.io.FileInputStream;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class javaf extends Application {
    public void start(Stage primaryStage) {

        try {
            Button btn = new Button("this is new button");
            btn.setTextFill(Color.RED);
            Rectangle rtn = new Rectangle(550, 550);
            rtn.setFill(Color.rgb(255, 0, 0));
            FileInputStream input = new FileInputStream("E:/work-ps/My logo _rg Black.png");
            Image img = new Image(input);
            ImageView image = new ImageView(img);
            StackPane root = new StackPane();
            root.getChildren().addAll(rtn, image, btn);
            Scene first = new Scene(root, 600, 600);
            primaryStage.setTitle("illustrtion of the program");
            primaryStage.setScene(first);
            primaryStage.show();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
