import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class labelWithimage extends Application {

    public void start(Stage primaryStage) {

        try {
            FileInputStream input = new FileInputStream("logo.png");
            Image img = new Image(input);
            ImageView image = new ImageView(img);
            Label l1 = new Label("Rashmin Gajera", image);
            StackPane sp = new StackPane();
            sp.getChildren().add(l1);
            Scene first = new Scene(sp, 1200, 900);
            primaryStage.setTitle("label program");
            primaryStage.setScene(first);
            primaryStage.show();
        } catch (FileNotFoundException e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}