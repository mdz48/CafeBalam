
package com.alilopez.application.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private PasswordField passwordTxt;

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
    void initialize() {
        salirButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        salirButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
    }

}
