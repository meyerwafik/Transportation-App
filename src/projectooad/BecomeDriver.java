/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author meyer
 */
public class BecomeDriver {
         HBox hb ;
    BorderPane p;
     private static final double width = 900;
    private static final double length = 650;
    private static final double buttonheight= 50;
    private static final String font="Verdana";
    public  Scene becomedriverScene()
    {
        //GridPane with 10px padding around edge
        p=new BorderPane();
        hb=new HBox();
        hb.setPrefSize(width, buttonheight);
      
       p.setTop(hb);
       

        GridPane grid = new GridPane();
         p.setCenter(grid);
        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.setVgap(8);

        grid.setHgap(10);



        //Name Label - constrains use (child, column, row)

        Label Carmodel = new Label("Car Model:");

        grid.add(Carmodel, 0, 0);



        //Name Input

        TextField carModelInput = new TextField();

        grid.add(carModelInput, 1, 0);
        
        
        //pleateno Label 

        Label plateno = new Label("Plate no.:");

        grid.add(plateno, 0, 1);

        //plateno Input

        TextField platenoInput = new TextField();

        grid.add(platenoInput, 1, 1);
        
        //color Label 

        Label color = new Label("color:");

        grid.add(color, 0, 2);
        

        //color Input

        TextField colorT = new TextField();

        grid.add(colorT, 1, 2);
        
        //year Label 

        Label year = new Label("year:");

        grid.add(year, 0, 3);



        //year Input

        TextField yearT = new TextField();

        grid.add(yearT, 1, 3);
        
        //Register

        Button RegisterButton = new Button("Request");
        HBox hb1=new HBox();
        hb1.setPrefHeight(130);
        Label lbl =new Label();
        hb1.getChildren().add(lbl);
       p.setBottom(hb1);
         lbl.setFont(Font.font(font, 20));
        lbl.setAlignment(Pos.TOP_CENTER);
        hb1.setAlignment(Pos.CENTER);

        grid.add(RegisterButton, 1, 7);
         RegisterButton.setOnAction(e->{
             if (yearT.getText().isEmpty()|| colorT.getText().isEmpty()||platenoInput.getText().isEmpty()||carModelInput.getText().isEmpty()){
                   lbl.setText("empty fields");
             }
             else{
                lbl.setText("Your request is submitted successfully");
             }
         }
             );
        
           
                 
         


        //Add everything to grid
        

       
        grid.setPrefSize(900 ,650);
        grid.setAlignment(Pos.CENTER); 


        Scene scene = new Scene(p, 900, 650);
        return scene;

        
    }
}
