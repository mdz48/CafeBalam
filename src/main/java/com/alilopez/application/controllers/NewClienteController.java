package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cliente;
import javafx.fxml.FXML;
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
        UUID randomId = UUID.randomUUID();
        String id = randomId.toString();
        Cliente cliente = new Cliente(id, nombre, apellido, correo, telefono, gasto, comprado);
        if (App.getTienda().addCliente(cliente)){
            alertLabel.setText("ID generado: " + id);
        } else {
            alertLabel.setText("No se pudo agregar");
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
