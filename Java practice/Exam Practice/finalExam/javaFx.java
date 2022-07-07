import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

public class javaFx extends Application {


    @override
public void start(Stage PrimaryStage){

    try (FileInputStream img = new FileInputStream("C:/Users/Rashmin/OneDrive/Desktop/Java practice/Exam Practice/finalExam/Final logo.png")) {
        Image ig= new Image(img);
        ImageView igm = new ImageView(ig);
Button btn = new Button("Rashmin here");
Rectangle rc = new Rectangle(1600, 900);
rc.setFill(Color.rgb(50,255,190));
StackPane pn = new StackPane();
pn.getChildren().add(rc);
// pn.getChildren().add(btn);
pn.getChildren().add(igm);



Scene first = new Scene(pn,1600,900);
PrimaryStage.setTitle("Test");
PrimaryStage.setScene(first);
    } catch (IOException e) {
        e.printStackTrace();
    }
    PrimaryStage.show();
    

}

    public static void main(String[] args) {
        
        launch(args);
    }
    
}