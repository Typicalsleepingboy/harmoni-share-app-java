package com.example.harmonishare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

public class RegistrationFormController {

    @FXML
    private Label confirmationLabel;

    @FXML
    private Label thankHarmoni;

    @FXML
    private Label thankYouLabel;

    @FXML
    private Label welcomeText;
    @FXML
    private String name;
    @FXML
    private String donation;
    @FXML
    private double donationAmount;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField donationTextField;

    @FXML
    private void onConfirmButtonClick() {
        name = nameTextField.getText();
        donation = donationTextField.getText();
        confirmationLabel.setText("Data Donasi Anda:");
        thankYouLabel.setText("Terima kasih, " + name + ", atas donasi sebesar " + donation + " IDR");
        thankHarmoni.setText("Anda luar biasa, Anda memberikan harapan dan kekuatan. Terima kasih karena telah membuat perbedaan yang nyata dalam hidup banyak orang. Semoga kebaikan ini kembali berlipat ganda untuk Anda.");
        try {
            donationAmount = Double.parseDouble(donation);
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
            String formattedDonation = numberFormat.format(donationAmount);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Thank.fxml"));
            Parent root = loader.load();

            ThankController thankController = loader.getController();
            thankController.setThankYouData(name, formattedDonation);

            Scene scene = confirmationLabel.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (NumberFormatException e) {
            System.err.println("Jumlah donasi tidak valid: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onBackButtonClick(ActionEvent actionEvent) {
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
