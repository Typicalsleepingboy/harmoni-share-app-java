package com.example.harmonishare;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class HarmoniApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HarmoniApplication.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        String imagePath = "/com/example/harmonishare/image/logo.png";
        Image iconImage = new Image(Objects.requireNonNull(getClass().getResource(imagePath)).toExternalForm());
        stage.getIcons().add(iconImage);
        stage.setTitle("HarmoniShare+");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}