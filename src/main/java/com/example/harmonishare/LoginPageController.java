package com.example.harmonishare;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginPageController {

    @FXML
    private Label welcomeText;
    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameTextField;

    private Map<String, String> credentials = new HashMap<>();

    public LoginPageController() {
        credentials.put("naufal", "naufal1");
        credentials.put("mei", "mei1");
        credentials.put("miss7you", "fadhil789");
    }

    @FXML
    private void onLoginButtonClick() {
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) welcomeText.getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error loading RegistrationForm.fxml: " + e.getMessage());
            }
        } else {
            welcomeText.setText("Password dan username tidak terdaftar disistem kami");
        }
    }

    public void setThankYouData(String name, String donation) {
    }
}