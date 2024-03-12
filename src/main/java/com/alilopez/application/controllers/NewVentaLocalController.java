package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewVentaLocalController {

    @FXML
    private Label alertLabel;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private Button closeButton;

    @FXML
    private TextField descuentoTxt;

    @FXML
    private Button saveButton;

    @FXML
    private TextField tipoProductoTxt;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        float descuento;
        double cantidad = Integer.parseInt(cantidadTxt.getText());
        if (descuentoTxt.getText().isEmpty()){
            descuento = 0;
        } else {
            descuento = Integer.parseInt(descuentoTxt.getText());
        }
        String tipo = tipoProductoTxt.getText();
        if (App.getTienda().addVentaLocal(cantidad, tipo, descuento)){
            alertLabel.setText("Venta exitosa");
        } else {
            alertLabel.setText("No se pudo realizar");
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
