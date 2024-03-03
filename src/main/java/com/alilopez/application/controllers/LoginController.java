
package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Login;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private Button loginButton;

    @FXML
    private Button salirButton;

    @FXML
    private TextField userTxt;

    @FXML
    private Label wrongLabel;

    @FXML
    void onClickSalirButton(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickLoginButton(MouseEvent event) throws IOException {
        Login user = new Login();
        App escena = new App();
        short permisos = user.checkLogin(userTxt.getText(), passwordTxt.getText());
        if (permisos == 0){
            wrongLabel.setVisible(true);
        } else if (permisos == 1) {
            escena.changeScene("homeAdmin-view.fxml");
        } else if (permisos == 2) {
            escena.changeScene("inventario-view.fxml");
        } else if (permisos == 3) {
            escena.changeScene("clientes-view.fxml");
        }
    }

    @FXML
    void initialize() {
        loginButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        loginButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
        salirButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        salirButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
    }

}
