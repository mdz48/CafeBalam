package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.VentaLocal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class BuscarVentaLocalController {

    @FXML
    private Label alertLabel;

    @FXML
    private Button buscarButton;

    @FXML
    private Button closeButton;

    @FXML
    private DatePicker datePicker;

    @FXML
    private DatePicker datePicker2;

    @FXML
    void onActionDatePicker(ActionEvent event) {

    }

    @FXML
    void onClickBuscarButton(MouseEvent event) {
        if (!(datePicker.getValue() == null)) {
            if (datePicker2.getValue() == null) {
                ArrayList<VentaLocal> aux = App.getTienda().searchVentasLocales(datePicker.getValue());
                if (!aux.isEmpty()) {
                    StringBuilder contenido = new StringBuilder("Lista de Ventas en esa fecha:\n");
                    for (int i = 0; i < aux.size(); i++) {
                        contenido.append(aux.get(i)).append("\n");
                    }
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Ventas Registrados");
                    alert.setHeaderText(null);
                    alert.setContentText(contenido.toString());
                    alert.showAndWait();
                } else {
                    String contenido = "No existen ventas registradas en este día";
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText(contenido);
                    alert.showAndWait();
                }
            } else {
                ArrayList<VentaLocal> aux = App.getTienda().searchVentasLocales(datePicker.getValue(), datePicker2.getValue());
                if (!aux.isEmpty()) {
                    StringBuilder contenido = new StringBuilder("Lista de Ventas en esas fechas:\n");
                    for (int i = 0; i < aux.size(); i++) {
                        contenido.append(aux.get(i)).append("\n");
                    }
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Ventas Registrados");
                    alert.setHeaderText(null);
                    alert.setContentText(contenido.toString());
                    alert.showAndWait();
                } else {
                    String contenido = "No existen ventas registradas en estos días";
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText(contenido);
                    alert.showAndWait();
                }
            }
        } else {
            String contenido = "Ingrese una fecha";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
    }

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void initialize() {
    }

}
