package me.kaloquan.fxdemo.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.awt.event.ActionEvent;

public class MainController {
    @FXML
    StackPane paneStack;
    @FXML
    JFXButton btnStart;

    @FXML
    public void btnStartOnclick(){
        JFXDialog dialog = new JFXDialog();
        dialog.setDialogContainer(paneStack);
        dialog.setContent(new Label("Content"));
        dialog.show();
    }
}
