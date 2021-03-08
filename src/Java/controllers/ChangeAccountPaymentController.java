package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChangeAccountPaymentController {

    public void backOnClick(ActionEvent e) throws Exception {
        Parent accountRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Account.fxml"));
        Scene accountScene = new Scene(accountRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(accountScene);
        window.show();
    }
}
