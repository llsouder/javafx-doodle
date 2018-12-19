package net.souderfamily;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddNumber.fxml"));

        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().add
                (getClass().getResource("style.css").toExternalForm());
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
}
