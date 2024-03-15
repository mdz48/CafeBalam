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
    void onActionDatePicker(ActionEvent event) {

    }

    @FXML
    void onClickBuscarButton(MouseEvent event) {
        ArrayList<VentaLocal> aux = App.getTienda().searchVentasLocales(datePicker.getValue());
        StringBuilder contenido = new StringBuilder("Lista de Ventas en esa fecha:\n");
        for (int i = 0; i < aux.size(); i++) {
            contenido.append(aux.get(i)).append("\n");
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ventas Registrados");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void initialize() {
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center; -fx-background-color:  #cd812b;");

        buscarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;-fx-background-color:  #cd812b;");
    }

}
