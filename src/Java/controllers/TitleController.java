package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TitleController {

    // testing home button
    public void home(ActionEvent e) {
        System.out.println("HOME");
    }

    // testing rentals button
    public void rentals(ActionEvent e) {
        System.out.println("RENTALS");
    }

    // Change scene to home
    public void homeOnClick(ActionEvent e) throws Exception {
        Parent homeRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Home.fxml"));
        Scene homeScene = new Scene(homeRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(homeScene);
        window.show();
    }

    // Change scene to rentals
    public void rentalsOnClick(ActionEvent e) throws Exception {
        Parent rentalsRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Rentals.fxml"));
        Scene rentalsScene = new Scene(rentalsRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(rentalsScene);
        window.show();
    }
}
