package com.example.harmonishare;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Riwayat {

    @FXML
    private Label welcomeText;

    @FXML
    private void onBackButtonmenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
            Parent root = loader.load();
            Scene scene = welcomeText.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
