
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class textField extends Application {

    public void start(Stage primaryStage) {

        TextField name = new TextField();
        TextField pswd = new PasswordField();
        Button logiButton = new Button("Login");
        Label nm = new Label("Your Name:");
        Label pd = new Label("Your pswd:");

        GridPane combo = new GridPane();

        combo.addRow(0, nm, name);
        combo.addRow(1, pd, pswd);
        combo.addRow(2, logiButton);
        combo.setHgap(20);
        combo.setVgap(20);

        Scene first = new Scene(combo, 600, 600);
        primaryStage.setTitle("label program");
        primaryStage.setScene(first);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
