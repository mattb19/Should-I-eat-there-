package com.example.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.io.BufferedInputStream;

public class chiefController {



    @FXML
    private Button calculateButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private ImageView theImageView;

    @FXML
    private Label mainLabel;

    public void initialize(){}


    @FXML
    void calculateButtonPressed(ActionEvent event){         // when button is pressed
        if (nameTextField.getText().equals("McDonalds") || nameTextField.getText().equals("mcdonalds")){
            Image jackson = getImage("jackson");        // we dont like mcdonalds, setting it to automatic no
            theImageView.setImage(jackson);
            mainLabel.setText("رامج التصميم مثل الفو");
        } else {
            Image yes = getImage("yes");
            Image no = getImage("no");
            if (Math.random() < 0.7) {              // 70% chance of the machine saying no
                theImageView.setImage(no);
                mainLabel.setText("Find somewhere better.");
            } else {
                theImageView.setImage(yes);
                mainLabel.setText("Get goin!");
            }
        }
    }

    public Image getImage(String type){         // method to access individual image from resources folder
        if (type.equals("no")){
            return new Image(getClass().getResourceAsStream("no.PNG"));
        } else if (type.equals("yes")){
            return new Image(getClass().getResourceAsStream("yes.jpeg"));
        } else if (type.equals("jackson")){
            return new Image(getClass().getResourceAsStream("jackson.jpeg"));
        } else {
            return new Image(getClass().getResourceAsStream("resource.jpeg"));
        }
    }


}
