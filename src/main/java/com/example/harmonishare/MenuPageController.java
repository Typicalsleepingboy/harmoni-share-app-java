package com.example.harmonishare;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPageController {

    @FXML
    private Text welcomeText;

    @FXML
    private void handleDonasiButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrationForm.fxml"));
            Parent root = loader.load();
            Scene scene = welcomeText.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlegalangButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GalangDana.fxml"));
            Parent root = loader.load();
            Scene scene = welcomeText.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleRiwayatButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Riwayat.fxml"));
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
