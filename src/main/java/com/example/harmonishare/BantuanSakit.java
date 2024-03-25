package com.example.harmonishare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class BantuanSakit {

    @FXML
    private Text welcomeText;
    @FXML
    private TextField answer1;
    @FXML
    private TextField answer2;
    @FXML
    private TextField answer21;


    private String data1;
    private String data2;
    private String data21;

    @FXML
    private void handleNextButton(ActionEvent event) {
        data1 = answer1.getText();
        data2 = answer2.getText();
        data21 = answer21.getText();


        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Thank.fxml"));
            Parent root = loader.load();
            ThankController thankController = loader.getController();
            thankController.setThankYouData(data1, data2, data21);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBackButton(ActionEvent actionEvent) {
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
}
