package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent gui = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/MainPanel.fxml")));
        Scene scene = new Scene(gui);
        stage.setTitle("SimpleTextEditor");
        stage.setScene(scene);
        stage.show();
    }
}
