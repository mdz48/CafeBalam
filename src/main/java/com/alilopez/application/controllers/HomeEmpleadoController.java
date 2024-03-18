package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Caja;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

public class HomeEmpleadoController {

    private String idCaja;

    @FXML
    private Button openCajaButton;

    @FXML
    private Button closeCajaButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button historialButton;


    @FXML
    private Button clienteButton;


    @FXML
    private Button ventaLocalButton;

    @FXML
    private Button ventaNacionalButton;

    @FXML
    void onClickOpenCajaButton(MouseEvent event) {

        if (App.getCaja().isStatus() == false) {
            App.getCaja().setStatus(true);
            LocalDate hoy = LocalDate.now();
            String idVendedor = App.getUser().getId();
            double monto = 0;
            idCaja = UUID.randomUUID().toString();
            Caja caja = new Caja(hoy, idVendedor, monto, idCaja);
            if (App.getTienda().openAction(caja)) {
                String contenido = "Bienvenido " + idVendedor;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText(contenido);
                alert.showAndWait();
            } else {
                String contenido = "No se pudo realizar la acción";
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText(contenido);
                alert.showAndWait();
            }
        } else {
            String contenido = "No se pudo realizar la acción";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
    }

    @FXML
    void onClickCloseCajaButton(MouseEvent event) {
        if (App.getCaja().isStatus() == true){
            App.getCaja().setStatus(false);
            if (App.getTienda().closeCaja(idCaja)) {
                String contenido = "Caja Cerrada por: " + App.getUser().getId();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText(contenido);
                alert.showAndWait();
            } else {
                String contenido = "No se pudo realizar la acción";
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText(contenido);
                alert.showAndWait();
            }
        } else {
            String contenido = "No se pudo realizar la acción";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }

    }

    @FXML
    void onClickClienteButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("clientes-view.fxml");
    }

    @FXML
    void onClickVentaLocalButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("ventasLocales-view.fxml");
    }

    @FXML
    void onClickVentaNacionalButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("ventasNacionales-view.fxml");
    }

    @FXML
    void onClickHistorialButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("historial-view.fxml");
    }
    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException, IOException {
        if (App.getCaja().isStatus() == false) {
            App escena = new App();
            escena.changeScene("login-view.fxml");
        } else {
            String contenido = "Cierre la caja antes de irse";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
        }


    @FXML
    void initialize() {
        openCajaButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        closeCajaButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        clienteButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        historialButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        ventaLocalButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        ventaNacionalButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
        exitButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 900; -fx-alignment: center; -fx-background-color:  #cd812b;");
    }
}
