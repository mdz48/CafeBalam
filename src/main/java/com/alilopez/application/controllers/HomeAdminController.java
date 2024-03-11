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
    private Button ventaLocalButton;

    @FXML
    private Button ventaNacionalButton;

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
    void onClickUsuarioButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("usuarios-view.fxml");
    }

    @FXML
    void onClickVentaLocalButton(MouseEvent event) throws IOException {
        App.newStage("newVentaLocal-view", "App - Realizar Venta Local");
    }
    @FXML
    void onClickVentaNacionalButton(MouseEvent event) throws IOException {
        App.newStage("newVentaNacional-view", "App - Realizar Venta Nacional");
    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException, IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }
}
