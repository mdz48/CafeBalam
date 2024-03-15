package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewVentaLocalController {

    @FXML
    private Label alertLabel;

    @FXML
    private ComboBox<String> tipoComboBox;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private Button closeButton;

    @FXML
    private TextField descuentoTxt;

    @FXML
    private Button saveButton;


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
        String tipo = tipoComboBox.getValue();
        if (App.getTienda().addVentaLocal(cantidad, tipo, descuento)){
            alertLabel.setText("Venta exitosa");
        } else {
            alertLabel.setText("No se pudo realizar");
        }
    }

    @FXML
    void onActionTipoComboBox(ActionEvent event) {

    }
    @FXML
    void initialize() {
        closeButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        saveButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        ObservableList<String> list = FXCollections.observableArrayList(App.getTienda().getTiposProductos());
        tipoComboBox.setItems(list);
    }

}
