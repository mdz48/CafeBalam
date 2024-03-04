package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cliente;
import com.alilopez.application.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.UUID;

public class NewUsuarioController {

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
    private TextField cargoTextField;
    @FXML
    private TextField edadTextfield;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }
    @FXML
    void onClickSaveButton(MouseEvent event) {

        String nombre = nombreTextfield.getText();
        String apellido = lastnameTextfield.getText();
        String correo = correoTextField.getText();
        String cargo = cargoTextField.getText();
        int edad = Integer.parseInt(edadTextfield.getText());
        String id = idTextField.getText();
        String password = passwordTextField.getText();
        Usuario user = new Usuario(nombre, apellido, correo, cargo, edad, id, password);
        if (cargo.equals("Capturista") || cargo.equals("Empleado")){
            if (App.getTienda().addUsuario(user)){
                alertLabel.setText("Se agregó existosamente");
            } else {
                alertLabel.setText("No se pudo agregar");
            }
        } else {
            alertLabel.setText("Ingrese un cargo válido");
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
