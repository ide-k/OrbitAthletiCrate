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

//    private void loadSplashScreen() {
//        try {
//            StackPane pane = FXMLLoader.load(getClass().getResource("../../resources/view/Splash.fxml"));
//            loginRoot.getChildren().setAll(pane);
//
//            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
//            fadeIn.setFromValue(0);
//            fadeIn.setToValue(1);
//            fadeIn.setCycleCount(1);
//
//            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
//            fadeOut.setFromValue(1);
//            fadeOut.setToValue(0);
//            fadeOut.setCycleCount(1);
//
//            fadeIn.play();
//
//            fadeIn.setOnFinished((e) -> {})
//
//        }

}
