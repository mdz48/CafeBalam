package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cafe;
import com.alilopez.application.models.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.util.UUID;

public class NewProductController {

    @FXML
    private Button closeButton;

    @FXML
    private Label alertLabel;

    @FXML
    private TextField precioTextField;

    @FXML
    private Button saveButton;
    @FXML
    private TextField costoTextField;

    @FXML
    private TextField nombreTextfield;
    @FXML
    private TextField pesoTextField;
    @FXML
    private TextField cantidadTextField;
    @FXML
    private TextField tipoTextField;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }
    @FXML
    void onClickSaveButton(MouseEvent event) {
        String nombre = nombreTextfield.getText();
        String tipo = tipoTextField.getText();
        float costo = Integer.parseInt(costoTextField.getText());
        float precio = Integer.parseInt(precioTextField.getText());
        float peso = Integer.parseInt(pesoTextField.getText());
        float cantidad = Integer.parseInt(cantidadTextField.getText());
        UUID randomId = UUID.randomUUID();
        String id = randomId.toString();
        Cafe cafe = new Cafe(precio, peso, id, nombre, cantidad, tipo, costo);
        if (App.getTienda().addProducto(cafe)){
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

    @FXML
    private void restriccionCaracteracteres(KeyEvent event){
        if (event.getTarget() == cantidadTextField){
            if (!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }

        } else if (event.getTarget() == costoTextField) {
            if (!Character.isDigit(event.getCharacter().charAt(0))  && event.getCharacter().charAt(0) != '.'){
                event.consume();
            }
            if (event.getCharacter().charAt(0) == '.' && costoTextField.getText().contains(".")){
                event.consume();
            }
        } else if (event.getTarget() == pesoTextField) {
            if (!Character.isDigit(event.getCharacter().charAt(0))  && event.getCharacter().charAt(0) != '.'){
                event.consume();
            }
            if (event.getCharacter().charAt(0) == '.' && pesoTextField.getText().contains(".")){
                event.consume();
            }
        } else if (event.getTarget() == precioTextField) {
            if (!Character.isDigit(event.getCharacter().charAt(0))  && event.getCharacter().charAt(0) != '.'){
                event.consume();
            }
            if (event.getCharacter().charAt(0) == '.' && precioTextField.getText().contains(".")){
                event.consume();
            }
        }
    }



}
