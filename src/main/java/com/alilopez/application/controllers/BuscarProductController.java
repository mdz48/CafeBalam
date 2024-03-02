package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarProductController {

    @FXML
    private Label alertLabel;

    @FXML
    private Button closeButton;

    @FXML
    private TextField idTextfield;

    @FXML
    private Button buscarButton;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickBuscarButton(MouseEvent event) {
        String contenido = "Producto:\n" + App.getTienda().searchProducto(idTextfield.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-danger");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
        buscarButton.getStyleClass().setAll("btn","btn-success");
        buscarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

}
