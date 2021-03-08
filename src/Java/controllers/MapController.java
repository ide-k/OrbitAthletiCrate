package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MapController {
    public void backOnClick(ActionEvent e) throws Exception {
        Parent weightsRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Weights.fxml"));
        Scene weightsScene = new Scene(weightsRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(weightsScene);
        window.show();
    }

    public void confirmOnClick(ActionEvent e) throws Exception {
        Parent createAccountRoot = FXMLLoader.load(getClass().getResource("../../resources/view/AccountPayment.fxml"));
        Scene createAccountScene = new Scene(createAccountRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(createAccountScene);
        window.show();
    }
}
