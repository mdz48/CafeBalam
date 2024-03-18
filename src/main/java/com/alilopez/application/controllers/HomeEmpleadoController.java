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
    void onClickVentaLocalButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("ventasLocales-view.fxml");
    }

    @FXML
    void onClickVentaNacionalButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("ventasNacionales-view.fxml");
    }

    @FXML
    void onClickHistorialButton(MouseEvent event) {

    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException, IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }

    @FXML
    void initialize() {
        cajaButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        clienteButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        historialButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        ventaLocalButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        ventaNacionalButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        exitButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
    }
}
