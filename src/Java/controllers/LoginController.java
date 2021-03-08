package Java.controllers;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController {

    public void LoginOnClick(ActionEvent e) throws Exception {
        Parent appRoot = FXMLLoader.load(getClass().getResource("../../resources/view/App.fxml"));
        Scene appScene = new Scene(appRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(appScene);
        window.show();
    }

    public void accountCreateOnClick(ActionEvent e) throws Exception {
        Parent createAccountRoot = FXMLLoader.load(getClass().getResource("../../resources/view/CreateAccount.fxml"));
        Scene createAccountScene = new Scene(createAccountRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(createAccountScene);
        window.show();
    }
}
