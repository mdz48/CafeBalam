package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cafe;
import com.alilopez.application.models.Cliente;
import com.alilopez.application.models.Venta;
import com.alilopez.application.models.VentaLocal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class VentasLocalesController {

    @FXML
    private TableView<VentaLocal> ventasLocalesTable;

    @FXML
    private Button addButton;

    @FXML
    private Button buscarButton;

    @FXML
    private TableColumn<Venta, Integer> colCantidad;

    @FXML
    private TableColumn<Venta, String> colIdVenta;

    @FXML
    private Button exitButton;

    @FXML
    private TableColumn<VentaLocal, String> colIDVendedor;

    @FXML
    private TableColumn<Venta, Integer> colMonto;

    @FXML
    private TableColumn<VentaLocal, Integer> colDescuento;

    @FXML
    private Button removeButton;

    @FXML
    private TableColumn<Venta, LocalDate> colFecha;

    @FXML
    void onClickAddButton(MouseEvent event) {
        App.newStage("newVentaLocal-view", "App - Venta Local");
    }

    @FXML
    void onClickBuscarButton(MouseEvent event) {
        App.newStage("buscarProduct-view", "App - Buscar Producto");
    }


    @FXML
    void onClickRemoveButton(MouseEvent event) {
        App.newStage("removeProduct-view", "App - Eliminar Producto");
    }

    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException {
        App escena = new App();
        short permisos = App.getUser().getAcess();
        if (permisos == 1) {
            escena.changeScene("homeAdmin-view.fxml");
        } else if (permisos == 2) {
            escena.changeScene("homeCapturista-view.fxml");
        } else if (permisos == 3) {
            escena.changeScene("homeEmpleado-view.fxml");
        }
    }

    @FXML
    public void initialize() {
        colIdVenta.setCellValueFactory(new PropertyValueFactory<>("idVenta"));
        colMonto.setCellValueFactory(new PropertyValueFactory<>("monto"));
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        colCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        colDescuento.setCellValueFactory(new PropertyValueFactory<>("descuentoLocal"));
        colIDVendedor.setCellValueFactory(new PropertyValueFactory<>("idVendedor"));
        ObservableList<VentaLocal> ventas = FXCollections.observableArrayList(App.getTienda().getVentasLocales());
        ventasLocalesTable.setItems(ventas);
    }

}
