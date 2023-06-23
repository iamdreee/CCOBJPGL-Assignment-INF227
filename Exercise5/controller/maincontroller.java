package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class maincontroller {

    @FXML
    ImageView j, k, m, p, w;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    kfc kfc = new kfc();
    jollibee jollibee = new jollibee();
    mcdo mcdo = new mcdo();
    popeyes popeyes = new popeyes();
    wendys wendys = new wendys();
    


    public void initialize() {

        kfc.setprice("P110");
        jollibee.setprice("P79");
        mcdo.setprice("P89");
        popeyes.setprice("P99");
        wendys.setprice("P150");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("jollibee starts at " + jollibee.getprice() + " Per Person!");
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("kfc starts at " + kfc.getprice() + " Per Person!");
        }

        if (sourceButton == btn3) {
            alert.setContentText("mcdo starts at " + mcdo.getprice() + " Per Person!");
        }
        if (sourceButton == btn4) {
            alert.setContentText("popeyes starts at " + popeyes.getprice() + " Per Person!");
        }
        if (sourceButton == btn5) {
            alert.setContentText("wendys starts at " + wendys.getprice() + " Per Person!");
        }
        alert.showAndWait();

    }
}