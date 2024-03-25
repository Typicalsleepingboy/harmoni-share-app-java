package com.example.harmonishare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;


import java.io.IOException;


public class ThankController {

    @FXML
    private Label confirmationLabel;

    @FXML
    private Label thankYouLabel;

    @FXML
    private Label thankHarmoni;

    @FXML
    private Label donationLabel;

    @FXML
    private String name;
    @FXML
    private String donation;
    @FXML
    private Label welcomeText;

    @FXML
    private Slider donationSlider;

    public void setThankYouData(String name, String formattedDonation) {
        thankYouLabel.setText("Terima kasih, " + name + ", atas donasi sebesar " + formattedDonation + " IDR");
        thankHarmoni.setText("Anda luar biasa, Anda memberikan harapan dan kekuatan. Terima kasih karena telah membuat perbedaan yang nyata dalam hidup banyak orang. Semoga kebaikan ini kembali berlipat ganda untuk Anda.");
    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
            Parent root = loader.load();
            LoginPageController loginPageController = loader.getController();
            loginPageController.setThankYouData(name, donation);
            Scene scene = welcomeText.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error loading LoginPage.fxml: " + e.getMessage());
        }
    }


    public void setThankYouData(String data1, String data2, String data21) {
        // Set the received data to the labels
        confirmationLabel.setText("Indentitas: " + data1);
        thankYouLabel.setText("Tujuan : " + data2);
        thankHarmoni.setText("Lokasi/Alamat : " + data21);
    }

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

