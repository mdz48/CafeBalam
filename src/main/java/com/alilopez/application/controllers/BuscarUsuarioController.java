package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarUsuarioController {

    @FXML
    private Label alertLabel;

    @FXML
    private Button buscarButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField idTextfield;

    @FXML
    void onClickBuscarButton(MouseEvent event) {
        String contenido = App.getTienda().searchUsuario(idTextfield.getText());
        if ((contenido.equals(null))) {
            contenido = "No se pudo encontrad";
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void initialize() {
    }

}
