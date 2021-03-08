package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IssueController {

    public void backOnClick(ActionEvent e) throws Exception {
        Parent homeRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Home.fxml"));
        Scene homeScene = new Scene(homeRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(homeScene);
        window.show();
    }

    public void submitOnClick(ActionEvent e) throws Exception {
        Parent submitRoot = FXMLLoader.load(getClass().getResource("../../resources/view/SubmissionThank.fxml"));
        Scene submitScene = new Scene(submitRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(submitScene);
        window.show();
    }
}
