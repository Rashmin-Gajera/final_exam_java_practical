import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
// import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

public class multipleScene extends Application {

    public void start(Stage firstStage) {


        /*
         * here we initilize the button and circle
         * there are two button and circle 
         * first circle have the specific color
         * second circle have the red color
         */
        Button btn1 = new Button("Change scene");
        Button btn2 = new Button("Restore scene");
        Circle circle1 = new Circle(20, 45, 210);
        Circle circle2 = new Circle(20, 45, 210);
        circle1.setFill(Color.rgb(134, 145, 17));
        circle2.setFill(Color.rgb(255, 0, 0));

        /*
         * here we create the first pane
         * after constuct the pane we add the butoon node and circle node into it
         * create the scene name first_scene
         * constuct the scene using speicific height and width and add the pane
         */
        StackPane pane1 = new StackPane();
        pane1.getChildren().add(circle1);
        pane1.getChildren().add(btn1);
        Scene first_scene = new Scene(pane1, 600, 600);

         /*
         * here we create the second pane
         * after constuct the pane we add the butoon node and circle node into it
         * create the scene name second_scene
         * constuct the scene using speicific height and width and add the pane to the scene
         */
        StackPane pane2 = new StackPane();
        pane2.getChildren().add(circle2);
        pane2.getChildren().add(btn2);
        Scene second_scene = new Scene(pane2, 600, 600);


        /*
         * here we constuct the stage 
         * and add the first_scene as the default scene
         */
        firstStage.setTitle("circle with button");
        firstStage.setScene(first_scene);
        firstStage.show();

        /*
         * event handler for switching the scene[first_scene------> second_scene]
         * if user click on btn1 button then scen is changed to second_scene
         */
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                firstStage.setScene(second_scene);

            }
        });

        /*
         * event handler for switching the scene [second_scene------> first_scene]
         * if user click on bt21 button then scene again the restore to first_scene
         */
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                firstStage.setScene(first_scene);

            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}
