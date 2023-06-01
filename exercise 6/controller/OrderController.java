package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.BedroomLamp;
import model.CeilingLamp;
import model.WallLamp;

public class OrderController implements Initializable {


    @FXML

    Label name1, name2, name3, qnty1, qnty2, qnty3, lineamount1, lineamount2, lineamount3, Total;

    @FXML
    Stage stage;

    @FXML
    Scene scene;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.blamp.getProductStatus()) {
            name1.setText(HomeController.blamp.getProductName());
            qnty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            lineamount1.setText(Double.toString(HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity()));
            name1.setVisible(true);
            qnty1.setVisible(true);
            lineamount1.setVisible(true);
            // price1.setVisible(true);
        }

        if (HomeController.clamp.getProductStatus()) {
            name2.setText(HomeController.clamp.getProductName());
            qnty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
            lineamount2.setText(Double.toString(HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity()));
            name2.setVisible(true);
            qnty2.setVisible(true);
            lineamount2.setVisible(true);
            // price2.setVisible(true);

    }
    
        if (HomeController.wlamp.getProductStatus()) {
            name3.setText(HomeController.wlamp.getProductName());
            qnty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            lineamount3.setText(Double.toString(HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity()));
            name3.setVisible(true);
            qnty3.setVisible(true);
            lineamount3.setVisible(true);
            // price3.setVisible(true);
    }

        double amt1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
        double amt2 = HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();
        double amt3 = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();
        
        
        double total = amt1 + amt2 + amt3;
        Total.setText(Double.toString(total));

    }

}