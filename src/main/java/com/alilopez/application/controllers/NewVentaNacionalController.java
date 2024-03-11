package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewVentaNacionalController {

    @FXML
    private Label alertLabel;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private Button closeButton;

    @FXML
    private TextField costoEnvioTxt;

    @FXML
    private Button saveButton;

    @FXML
    private TextField tipoProductoTxt;

    @FXML
    private TextField direccionTxt;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        float costoEnvío;
        float cantidad;
        try {
            costoEnvío = Float.parseFloat(costoEnvioTxt.getText());
            cantidad = Float.parseFloat(cantidadTxt.getText());
            String direccion = direccionTxt.getText();
            String tipo = tipoProductoTxt.getText();
            if (App.getTienda().addVentaNacional(cantidad, tipo, costoEnvío, direccion)) {
                alertLabel.setText("Venta exitosa");
            } else {
                alertLabel.setText("No se pudo realizar");
            }
        } catch (NumberFormatException e) {
            String contenido = "Ingrese un número válido";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-danger");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
        saveButton.getStyleClass().setAll("btn","btn-success");
        saveButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

}
