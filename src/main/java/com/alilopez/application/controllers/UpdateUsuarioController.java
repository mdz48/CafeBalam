package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UpdateUsuarioController {

    @FXML
    private Label alertLabel;


    @FXML
    private Button closeButton;


    @FXML
    private TextField edadTextField;

    @FXML
    private TextField passTxt;

    @FXML
    private TextField idTextField;


    @FXML
    private Button saveButton;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        if (!idTextField.getText().isEmpty() && !passTxt.getText().isEmpty()){
            if (!edadTextField.getText().isEmpty()) {
                try {
                    int edad = Integer.parseInt(edadTextField.getText());
                    if (App.getTienda().updateUsuario(idTextField.getText(), edad, passTxt.getText())){
                        String contenido = "Se actualizaron los cambios";
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText(contenido);
                        alert.showAndWait();
                    }
                } catch (NumberFormatException e){
                    String contenido = "Numero inválido";
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText(contenido);
                    alert.showAndWait();
                }
            }
        } else {
            if (App.getTienda().updateUsuario(idTextField.getText(), passTxt.getText())) {
                String contenido = "Se actualizó la contraseña";
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText(contenido);
                alert.showAndWait();
            } else {
                String contenido = "No se pudo realizar los cambios";
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText(contenido);
                alert.showAndWait();
            }
        }
    }

    @FXML
    void initialize() {
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center; -fx-background-color:  #cd812b;");
        saveButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;-fx-background-color:  #cd812b;");
    }

}
