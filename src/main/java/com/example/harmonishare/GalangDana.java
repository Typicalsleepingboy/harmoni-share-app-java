package com.example.harmonishare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class GalangDana {


    @FXML
    private Label welcomeText;

    public void Onbencanahandle(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BencanaAlam.fxml"));
            Parent root = loader.load();
            Scene scene = welcomeText.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Onsakithandle(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BantuanSakit.fxml"));
            Parent root = loader.load();
            Scene scene = welcomeText.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Onbackahandle(ActionEvent actionEvent) {
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
