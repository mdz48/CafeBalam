package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UpdateClienteController {

    @FXML
    private Label alertLabel;

    @FXML
    private Button closeButton;

    @FXML
    private TextField compradoTextField;

    @FXML
    private TextField gastadoTextField;

    @FXML
    private Button saveButton;

    @FXML
    private TextField idTextField;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        if (idTextField.getText().isEmpty() || compradoTextField.getText().isEmpty() || gastadoTextField.getText().isEmpty()){
            alertLabel.setText("Ingrese todos los campos");
        }
        if (App.getTienda().updateClient(idTextField.getText(), Integer.parseInt(compradoTextField.getText()), Integer.parseInt(gastadoTextField.getText()))){
            alertLabel.setText("Cambios Guardados!");
        } else {
            alertLabel.setText("No encontró el ID");
        }
    }

    @FXML
    void initialize() {
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center; -fx-background-color:  #cd812b;");

        saveButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;-fx-background-color:  #cd812b;");
    }

}
