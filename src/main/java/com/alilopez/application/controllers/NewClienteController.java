package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.UUID;

public class NewClienteController {

    @FXML
    private Button closeButton;

    @FXML
    private Label alertLabel;

    @FXML
    private TextField correoTextField;

    @FXML
    private Button saveButton;
    @FXML
    private TextField lastnameTextfield;

    @FXML
    private TextField nombreTextfield;
    @FXML
    private TextField telefonoTextfield;
    @FXML
    private TextField gastoTextfield;
    @FXML
    private TextField compradoTextField;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }
    @FXML
    void onClickSaveButton(MouseEvent event) {

        String nombre = nombreTextfield.getText();
        String apellido = lastnameTextfield.getText();
        String correo = correoTextField.getText();
        long telefono = Long.parseLong(telefonoTextfield.getText());
        float comprado = Integer.parseInt(compradoTextField.getText());
        float gasto = Integer.parseInt(gastoTextfield.getText());
        Cliente cliente = new Cliente(nombre, apellido, correo, telefono, gasto, comprado);
        if (App.getTienda().addCliente(cliente)){
            String contenido = "Este correo ya fue registrado";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        } else {
            String contenido = "Se registró";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
    }
    @FXML
    void initialize() {
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center; -fx-background-color:  #cd812b;");

        saveButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;-fx-background-color:  #cd812b;");
    }

}
