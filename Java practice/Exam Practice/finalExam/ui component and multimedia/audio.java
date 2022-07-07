import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class audio extends Application {

    public void start(Stage newStage) {

        try {
            Media input = new Media("file:///D:/Entertainment/Songs/Aashiqi-2/02-Sunn_Raha_Hai.mp3");
            MediaPlayer song = new MediaPlayer(input);
            song.setAutoPlay(false);
            Button start = new Button("Play song");
            Button stop = new Button("Pause");
            Label initial = new Label("    Click on \"play song\" for enjoying song.....");
            Label current = new Label("    Your song is playing.....");

            GridPane root = new GridPane();
            root.addRow(0, initial);
            root.addRow(1, current);
            current.setVisible(false);
            root.addRow(2, start, stop);
            root.setHgap(20);
            root.setVgap(20);

            Scene first = new Scene(root, 500, 500);
            newStage.setTitle("Media Player");
            newStage.setScene(first);
            newStage.show();

            start.setOnMouseClicked(e -> {
                song.play();
                initial.setVisible(false);
                current.setVisible(true);


            });

            stop.setOnMouseClicked(e -> {
                song.pause();
                current.setVisible(false);
                initial.setVisible(true);

            });
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
