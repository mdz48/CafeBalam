package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HomeCapturistaController {


    @FXML
    private Button exitButton;


    @FXML
    private Button inventarioButton;

    @FXML
    void onClickInventarioButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("inventario-view.fxml");
    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException, IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }

    @FXML
    void initialize() {
        inventarioButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        exitButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
    }
}
