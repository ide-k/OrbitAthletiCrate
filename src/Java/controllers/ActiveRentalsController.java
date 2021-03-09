package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ActiveRentalsController {
    public void homeOnClick(ActionEvent e) throws Exception {
        Parent homeRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Home.fxml"));
        Scene homeScene = new Scene(homeRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(homeScene);
        window.show();
    }

    // Change scene to weights
    public void weightsOnClick(ActionEvent e) throws Exception {
        Parent weightsRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Weights.fxml"));
        Scene weightsScene = new Scene(weightsRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(weightsScene);
        window.show();
    }

    public void favOnClick(ActionEvent e) throws Exception {
        Parent favRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Favourites.fxml"));
        Scene favScene = new Scene(favRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(favScene);
        window.show();
    }

    public void activeRentConfirmOnClick(ActionEvent e) throws Exception {
        Parent rentRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Rentals.fxml"));
        Scene rentScene = new Scene(rentRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(rentScene);
        window.show();
    }

    public void mapOnClick(ActionEvent e) throws Exception {
        Parent mapRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Map.fxml"));
        Scene mapScene = new Scene(mapRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(mapScene);
        window.show();
    }

}
