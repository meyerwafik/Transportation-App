/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectooad;

import Factory.CashFactory;
import Factory.CreditFactory;
import Factory.RideFactory;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import ooadclasses.pkg1.Customer;
import ooadclasses.pkg1.Discount;
import ooadclasses.pkg1.Driver;
import ooadclasses.pkg1.Payment;
import ooadclasses.pkg1.Ride;
import ooadclasses.pkg1.Rideable;

/**
 *
 * @author meyer
 */
public class RequestRide 
{
    Pane p;
    Payment pay;
    private final double length =650;
    private  final double width =900;
//    Point2D x[]={new Point2D(20,20),new Point2D(50,50),new Point2D(width-20,p.getPrefHeight()-20)};
    BorderPane pane ;
     
    GridPane g1,g2;
    Label src,dst,wallet,carType,walletno,PaymentType,walletCheck,promo;
    TextField sXT,sYT,dXT,dYT,promoT;
    CheckBox ch;
    ComboBox co;
    RadioButton rb1,rb2;
    String [] types={"Economy","Luxury","Pets","Scooter"};
     private  final String font="Verdana";
      Ride r;
      Customer c1;
      Driver hai;
    
    public Scene RequestRide(Customer c)
    {
//         hai=null;
        c1=c;
         pane= new BorderPane();
        grid1();
        grid2();
        sp();
        Scene s=new Scene(pane,width,length);
        return s;
    }
    private void grid1()
    {
        Button FAQ =new Button("FAQs");
        FAQ.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new FAQ().faq());         
    }
     );
        src=new Label("Start");
        dst=new Label("End");
        wallet=new Label("Wallet");
        sXT=new TextField();
        sYT=new TextField();
        dXT=new TextField();
        dYT=new TextField();
        walletno=new Label(""+c1.getWallet());
        g1=new GridPane();
        g1.setPadding(new Insets(10, 10, 10, 10));
        g1.setVgap(8);
        g1.setHgap(8);
        pane.setTop(g1);
        g1.setAlignment(Pos.BASELINE_CENTER);
        g1.add(src, 0, 0);
        g1.add(dst,0,1);
        g1.add(sXT,1,0);
        g1.add(sYT,2,0);
        g1.add(dXT,1,1);
        g1.add(dYT,2,1);
        g1.add(wallet,20,0);
        g1.add(walletno,21,0);
        g1.add(FAQ,20,1);
        
    }
    private void grid2()
    {
        ToggleGroup tg = new ToggleGroup();
        rb1=new RadioButton("Cash");
        rb2=new RadioButton("Credit Card");
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        g2=new GridPane();
        g2.setPadding(new Insets(10, 10, 10, 10));
        g2.setVgap(8);
        g2.setHgap(8);
        carType=new Label("Car Type");
        promo=new Label("Promo Code");
        promoT=new TextField();
        PaymentType=new Label("Choose Payment Type");
        walletCheck=new Label("Use Wallet");
        
        co=new ComboBox();
        ch=new CheckBox();
        g2.add(carType,0,0);
        g2.add(PaymentType,0,1);
//        g2.add(walletCheck,0,2);
//        g2.add(ch,3,2);
        g2.add(rb1,3,1);
        g2.add(rb2,4,1);
        g2.add(promo,0,3);
        g2.add(promoT,3,3);
        pane.setBottom(g2);
        g2.setAlignment(Pos.BASELINE_CENTER);
        co.setItems(FXCollections.observableArrayList(types));
        g2.add(co,3,0);
        Button now = new Button("Ride now");
        pay=CashFactory.cashactory();
      if (rb1.isSelected())
        {
            pay=CashFactory.cashactory();
        }
        if (rb2.isSelected())
        {
            pay=CreditFactory.creditfactory();
        }
        
         now.setOnMouseClicked((MouseEvent event) -> {
              r=RideFactory.ridefactory() ;
              r.setCustomer(c1);
             Point2D sloc=new Point2D(Double.parseDouble(sXT.getText()),Double.parseDouble(sYT.getText()));
             Point2D dloc=new Point2D(Double.parseDouble(dXT.getText()),Double.parseDouble(dYT.getText()));
             Driver hai =Factory.DriverFactory.getDriver(co.getValue().toString());
             
             Discount pro=Factory.PromoCodeFactory.getPomocodeFactory();
             pro.checkPromo(promoT.getText());
             System.out.println(pro.getPercentage());
             r.RequestRide(sloc,dloc,pay,hai,pro);
//             hai=null;
             
  GUImanager.getPrimaryStage().setScene( new DriverDetails().DriverDetailsScene(r) );         
    }
     );
        Button later = new Button("Ride Later");
         Button driver = new Button("Become a Driver");
         driver.setFont(Font.font(font,25));
          driver.setStyle("-fx-background-color:#31658d");
          driver.setTextFill(Color.WHITE);
          driver.setAlignment(Pos.CENTER_RIGHT);
          driver.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new BecomeDriver().becomedriverScene());         
    }
     );
           later.setOnMouseClicked((MouseEvent event) -> {
  GUImanager.getPrimaryStage().setScene(new Booking().laterScene());         
    }
     );
        g2.add(now,2,5);
        g2.add(later,3,5);
         g2.add(driver,9,5);
    }
    private void sp(){
        
      p=new Pane();
         pane.setCenter(p);
         p.setPrefSize(width, length-250);
         p.setStyle("-fx-background-color:#FFFFFF");

    }
}
