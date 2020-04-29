/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import ooadclasses.pkg1.Ride;


/**
 *
 * @author Maria
 */
public class DriverDetails {
    private  double buttonheight = 50;
    private  final double width =900;
    private  final double length =650;
     public  Scene DriverDetailsScene(Ride r){
        HBox hb = new HBox();
        VBox vb1 = new VBox();
        VBox vb2 = new VBox();
        hb.getChildren().addAll(vb1, vb2);
        
        Label details = new Label("Driver's Details");
        Label name = new Label("Name: ");
        Label model = new Label("Car Model: ");
        Label type = new Label("Car Type: ");
        Label plate = new Label("Plate Number: ");
        Label color = new Label("Car Colour: ");
        Label number = new Label("Phone Number: ");
        Label rating = new Label("Driver's Rating: ");
        Label completedTrips = new Label("Completed Trips: ");
        
//        Label detailsDB = new Label("");
        Label nameDB = new Label(r.getDriver().getName());
        Label modelDB = new Label(r.getDriver().getCar().getCarType());
        Label typeDB = new Label(r.getDriver().getCar().getType());
        Label plateDB = new Label(r.getDriver().getCar().getPlatenumber());
        Label colorDB = new Label(r.getDriver().getCar().getC());
        Label numberDB = new Label(r.getDriver().getTelephone());
        Label ratingDB = new Label(""+r.getDriver().getAvgrate());
        Label completedTripsDB = new Label(""+r.getDriver().getComptrips());
        
        details.setFont(Font.font("Verdana", FontWeight.BOLD, 23));
        name.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        model.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        type.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        plate.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        color.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        number.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        rating.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        completedTrips.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        
        nameDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        modelDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        typeDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        plateDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        colorDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        numberDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        ratingDB.setFont(Font.font("Verdana", FontWeight.BOLD, 19));
        completedTripsDB.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        Button StartRide =new Button("StartRide");
         StartRide.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new InRide().inRideScene(r) );         
    }
     );
        StartRide.setStyle("-fx-background-color:#a97c06");
        StartRide.setPrefWidth(width/4);
        StartRide.setPrefHeight(buttonheight);
        StartRide.setLayoutX(560);
        StartRide.setLayoutY(430);
        StartRide.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        Button CancelRide =new Button("CancelRide");
         CancelRide.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new RequestRide().RequestRide(r.getCustomer()));         
    }
     );
        CancelRide.setStyle("-fx-background-color:#a97c06");
        CancelRide.setPrefWidth(width/4);
        CancelRide.setPrefHeight(buttonheight);
        CancelRide.setLayoutX(560);
        CancelRide.setLayoutY(430);
        CancelRide.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        
        vb2.getChildren().addAll(StartRide, CancelRide);
        vb1.setSpacing(45);
        vb1.setPadding(new Insets(16, 0, 0, 16));
        vb2.setSpacing(20);
        vb2.setPadding(new Insets(257.5, 0, 0,200));
        HBox detailsHbox = new HBox(details);
        
        HBox nameHbox = new HBox(name, nameDB);
        HBox modelHbox = new HBox(model, modelDB);
        HBox typeHbox = new HBox(type, typeDB);
        HBox plateHbox = new HBox(plate, plateDB);
        HBox colorHbox = new HBox(color, colorDB);
        HBox numberHbox = new HBox(number, numberDB);
        HBox ratingHbox = new HBox(rating, ratingDB);
        HBox completedTripsHbox = new HBox(completedTrips, completedTripsDB);
       
        vb1.getChildren().addAll(detailsHbox, nameHbox, modelHbox, typeHbox, plateHbox, colorHbox, numberHbox, ratingHbox , completedTripsHbox);
        Scene scene = new Scene(hb,900,650);
        return scene;
     }
}
