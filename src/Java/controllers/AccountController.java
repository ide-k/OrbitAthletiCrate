package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccountController {

    public void backOnClick(ActionEvent e) throws Exception {
        Parent historyRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Home.fxml"));
        Scene historyScene = new Scene(historyRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(historyScene);
        window.show();
    }

    public void paymentOnClick(ActionEvent e) throws Exception {
        Parent paymentRoot = FXMLLoader.load(getClass().getResource("../../resources/view/ChangeAccountPayment.fxml"));
        Scene paymentScene = new Scene(paymentRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(paymentScene);
        window.show();
    }
}
