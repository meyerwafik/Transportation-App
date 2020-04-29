/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

/**
 *
 * @author meyer
 */

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.geometry.Orientation;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.text.Font.font;
import javafx.stage.Screen;

public class FAQ {
private static double buttonheight = 50;
     private static final String font="Verdana";
      Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
      
    public static Scene faq() {
        Label l = new Label("1) What are the types of the discounts KAGAMY offers?\n"
                + "\n"
                + "    KAGAMY offers two types of discounts.\n"
                + "\n"
                + "    KAGAMY offers Promocodes and Subscriptions for the users.\n"
                + "\n"
                + "    Types of offers:\n"
                + "    Subscriptions:\n"
                + "    KAGAMY offers different packages for their users to subsribe to our app:\n"
                + "    A) Monthly Subscriptions:\n"
                + "    - Customers are allowed to pay 500 EGP for 30 days to take 50% discount on all their rides with maximum of 60 rides.\n"
                + "    - You cannot cancel the subscription.\n"
                + "    - Issuance of a check book is allowed for the customers .\n"
                + "\n"
                + "    B) Yearly Subscriptions:\n"
                + "    - Customers are allowed to pay 50000 EGP for 365 days to take 50% discount on all their rides with maximum of 1000 rides.\n"
                + "    - You can cancel the subscription and get 50% of your money before 6 months of the beginning.\n"
                + "    - Issuance of a check book is allowed for the customers .\n"
                + "\n"
                
                + "    Promocodes:\n"
                + "    - Customers will receive Promocodes as SMS messages from KAGAMY to offer various discounts. \n"
                + "    - 1 type of Promocodes is offer for 50% on 10 rides with maximum discount 15 EGP, \n if the customer didn't use this offer for 5 days it will end without his usage.\n"
                + "    - Another type of Promocodes is offer for 25% on 10 rides with maximum discount 20 EGP, \n if the customer didn't use this offer for 7 days it will end without his usage.\n"
                + "\n"
                + "    ****************\n"
                + "    Types of rides:\n"
                + "    - The user can choose the type of ride he want to take.\n"
                + "    - we have 4 types of rides in KAGAMY: Pets, Economy, Luxury, and Scooter.\n"
                + "    - the first one (Pets) will offer cars that you can get your pets inside while you ride.\n"
                + "    - the second one (Economy) will offer cars that has reasonable prices and mid class cars.\n"
                + "    - the third one (Luxury) will offer cars that has more expensive price and high class cars.\n"
                + "    - the fourth one (Scooter) will offer scooters for single customer to ride,\n it will be more reasonable prices than the Economy.\n"
                + "\n"
                + "    Prices and fares for every type of ride:\n"
                + "    - Pets: 5.75 EGP/Km \n"
                + "    - Economy: 4.25 EGP/Km \n"
                + "    - Luxury: 6.5 EGP/Km \n"
                + "    - Scooter: 2.5 EGP/Km \n");
        l.setAlignment(Pos.CENTER);
        l.setFont(Font.font("Cambria", FontWeight.BOLD, FontPosture.REGULAR, 16));;
        Label bottom = new Label("© KAGAMI. All rights reserved 2019.\n" 
                + "® KAGAMY logo and POWERING YOUR IDEAS are registered trademarks of KAGAMY") ;
        l.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(3.0);
        dropShadow.setOffsetX(2.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
        
        bottom.setEffect(dropShadow);
        ImageView img1 = new ImageView("projectooad/img.jpeg");
        img1.setFitHeight(150);
        img1.setFitWidth(150);
        ImageView img2 = new ImageView("projectooad/email.png");
        img2.setFitHeight(170);
        img2.setFitWidth(150);
        
        Label num = new Label("Hotline : 19973\n");
        num.setEffect(dropShadow);
        num.setTextFill(Color.WHITE);
        Label email = new Label("E-mail us: KAGAMINB.GOV.EG");
        email.setTextFill(Color.WHITE);
        email.setEffect(dropShadow);
        
        ScrollPane sp = new ScrollPane(l);
        HBox hbabove= new HBox(img1,num,img2,email);
        hbabove.setStyle("-fx-background-color:#1D3C54");
        HBox hbbott= new HBox(bottom);
        hbbott.setBackground(new Background(new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY)));
        
        BorderPane bp = new BorderPane(sp);
        bp.setBottom(hbbott);
        
        Scene scene = new Scene(bp,900,650);
        l.prefWidthProperty().bind(scene.widthProperty());
            VBox vbtop = new VBox(hbabove);
            bp.setTop(vbtop);
            bp.setPadding(new Insets(0,0,0,2));
            return scene;

        }
}
