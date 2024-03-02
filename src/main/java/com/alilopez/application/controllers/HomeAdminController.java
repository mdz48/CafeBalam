package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HomeAdminController {

    @FXML
    private Button cajaButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button clienteButton;

    @FXML
    private Button historialButton;

    @FXML
    private Button inventarioButton;

    @FXML
    private Button usuarioButton;

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
    void onClickHistorialButton(MouseEvent event) {

    }

    @FXML
    void onClickInventarioButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("inventario-view.fxml");
    }

    @FXML
    void onClickUsuarioButton(MouseEvent event) {

    }

    @FXML
    void onClickVentaButton(MouseEvent event) {

    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException, IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }
}
