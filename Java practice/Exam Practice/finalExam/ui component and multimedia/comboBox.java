import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;

public class comboBox extends Application {

    public void start(Stage primaryStage) throws Exception {

        ComboBox language = new ComboBox();
        language.getItems().add("C");
        language.getItems().add("C++");
        language.getItems().add("Java");
        language.getItems().add("C#");
        language.getItems().add("Python");

        Label fav = new Label("Choose your favourite language");

        GridPane choice = new GridPane();
        choice.addColumn(1, fav);
        choice.addColumn(2, language);
        choice.setHgap(20);
        choice.setVgap(20);

        Scene first = new Scene(choice, 600, 600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}