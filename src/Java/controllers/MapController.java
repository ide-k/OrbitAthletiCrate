package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MapController {
    public void rentalsOnClick(ActionEvent e) throws Exception {
        Parent rentalsRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Rentals.fxml"));
        Scene rentalsScene = new Scene(rentalsRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(rentalsScene);
        window.show();
    }
}
