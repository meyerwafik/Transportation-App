/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import ooadclasses.pkg1.Ride;


/**
 *
 * @author Andrew
 */
public class InRide {
    Pane p;
    private  double buttonheight = 50;
    private final String url ="projectooad/inridepic.gif";
    private  final double length =650;
    private  final double width =900;
    public  Scene inRideScene(Ride r){
        p= new Pane();
        Button FinishRide =new Button("FinishRide");
         FinishRide.setOnMouseClicked((MouseEvent event) -> {
             
  GUImanager.getPrimaryStage().setScene( new FinishRide().finishridescene(r) );         
    }
     );
        FinishRide.setStyle("-fx-background-color:#a97c06");
        FinishRide.setPrefWidth(width/4);
        FinishRide.setPrefHeight(buttonheight);
        FinishRide.setLayoutX(560);
        FinishRide.setLayoutY(430);
        FinishRide.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        Image img = new Image(url);
        ImageView background = new ImageView(img);
     
        background.setFitWidth(900);
        background.setFitHeight(650);
        p.getChildren().add(background);
        p.getChildren().add(FinishRide);
        Scene scene = new Scene(p,900,650);
        return scene;
    }
    
}
