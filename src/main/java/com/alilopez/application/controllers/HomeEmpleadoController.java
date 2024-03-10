package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HomeEmpleadoController {

    @FXML
    private Button cajaButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button historialButton;


    @FXML
    private Button clienteButton;


    @FXML
    private Button ventaButton;

    @FXML
    void onClickCajaButton(MouseEvent event) {

    }

    @FXML
    void onClickClienteButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("clientes-view.fxml");
    }

    @FXML
    void onClickVentaButton(MouseEvent event) {

    }

    @FXML
    void onClickHistorialButton(MouseEvent event) {

    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException, IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }
}
