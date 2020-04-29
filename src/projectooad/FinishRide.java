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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import ooadclasses.pkg1.Ride;

/**
 *
 * @author Leo
 */
public class FinishRide {
    Scene scene;
    BorderPane bp;
    HBox hb,hb1,hb2,hbbadge,hbamountshouldbepaid,hbamountpaid;
    ImageView star1,star2,star3,star4,star5,badge1,badge2,badge3;
    Image istar,istarcolor,ibadge1,ibadge2,ibadge3;
    Button home;
    VBox vb;
    VBox vbb;//    vertcial Box Bottom
    Label amountshouldbepaidtext,amountshouldbepaidvalue,amountpaidtext;
    TextField amountpaidvalue;
     static final String urlstar="projectooad/Star.png";
     static final String urlstarcolor="projectooad/Starcolor.png";
     int r;
    public FinishRide(){
    }
    
    public Scene finishridescene(Ride x){
        bp=new BorderPane();
        hb=new HBox();
        hb1=new HBox();
        hb.setAlignment(Pos.CENTER);
        bp.setTop(hb);
        star1=new ImageView();
        star2=new ImageView();
        star3=new ImageView();
        star4=new ImageView();
        star5=new ImageView();
        istar=new Image(urlstar);
        istarcolor=new Image(urlstarcolor);
        star1.setImage(istar);
        star1.setOnMouseClicked(e->{
        star1.setImage(istarcolor);
//        star1.setImage(istar);
        star2.setImage(istar);
        star3.setImage(istar);
        star4.setImage(istar);
        star5.setImage(istar);
        
        r=1;
        x.setrating(r);
        });
        star2.setImage(istar);
        star2.setOnMouseClicked(e->{
        star1.setImage(istarcolor);
        star2.setImage(istarcolor);
        star3.setImage(istar);
        star4.setImage(istar);
        star5.setImage(istar);
        
        r=2;
        x.setrating(r);
        });
        star3.setImage(istar);
        star3.setOnMouseClicked(e->{
        star1.setImage(istarcolor);
        star2.setImage(istarcolor);
        star3.setImage(istarcolor);
        star4.setImage(istar);
        star5.setImage(istar);
        r=3;
        x.setrating(r);
        });
        star4.setImage(istar);
                star4.setOnMouseClicked(e->{
        star1.setImage(istarcolor);
        star2.setImage(istarcolor);
        star3.setImage(istarcolor);
        star4.setImage(istarcolor);
        star5.setImage(istar);
        r=4;
        x.setrating(r);
        });
        star5.setImage(istar);
        star5.setOnMouseClicked(e->{
        star1.setImage(istarcolor);
        star2.setImage(istarcolor);
        star3.setImage(istarcolor);
        star4.setImage(istarcolor);
        star5.setImage(istarcolor);
        r=5;
        x.setrating(r);
        });
        
        hb.getChildren().addAll(star1,star2,star3,star4,star5);
        String font = "Verdana";
        
        hb1.setAlignment(Pos.CENTER);
        hb1.setPadding(new Insets(20));
        TextField tf=new TextField();
        tf.setPrefSize(300, 150);
//        tf.setWrapText(true);
        Label wr=new Label("Write review: ");
        wr.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        hb1.getChildren().addAll(wr,tf);
        bp.setCenter(hb1);
        ibadge1= new Image("projectooad/cleanestcar.jpg");
        ibadge2=new Image("projectooad/stirringwheel.png");
        ibadge3=new Image("projectooad/navigation.png");
        badge1=new ImageView(ibadge1);
        badge1.setFitWidth(250);
        badge1.setFitHeight(150);
        badge2=new ImageView(ibadge2);
        badge2.setFitWidth(250);
        badge2.setFitHeight(150);
        badge3=new ImageView(ibadge3);
        badge3.setFitWidth(250);
        badge3.setFitHeight(150);
        vbb=new VBox();
        hbbadge = new HBox();
        hbbadge.setAlignment(Pos.CENTER);
        hbbadge.setMargin(badge2, new Insets(20));
        hbbadge.getChildren().addAll(badge1,badge2,badge3);
        hbamountshouldbepaid=new HBox();
        amountshouldbepaidtext=new Label("Amount should be paid: ");
        amountshouldbepaidtext.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        amountshouldbepaidvalue=new Label(""+x.getP().calculateFare(x.getStartlocation(), x.getEndlocation(),x.getDriver().getCar().getApkm(),x.getDiscount()));
        amountshouldbepaidvalue.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        amountpaidtext=new Label("Amount paid: ");
        amountpaidtext.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        amountpaidvalue=new TextField();
        home = new Button("Return to home");
        home.setFont(Font.font(font,25));
      
        home.setOnMouseClicked((MouseEvent event) -> {
           x.getP().pay(x.getStartlocation(),x.getEndlocation(),x.getDriver().getCar().getApkm() ,x.getCustomer(),Integer.parseInt(amountpaidvalue.getText()),x.getDiscount());
  GUImanager.getPrimaryStage().setScene( new RequestRide().RequestRide(x.getCustomer()));   
            System.out.println(tf.getText());
  x.rideadd(x.getCustomer().getEmail(), r,tf.getText() , (int)x.getKilometer(),(int)x.getStartlocation().getX() , (int)x.getStartlocation().getY(), (int)x.getEndlocation().getX(), (int)x.getEndlocation().getY(), x.getFare(), x.getDriver().getEmail(),x.getDiscount().getPercentage(), x.getP().getPaymentType());
//       x.getDriver().setX(null);
    }
     );
        hbamountshouldbepaid.getChildren().addAll(amountshouldbepaidtext,amountshouldbepaidvalue);
        hbamountshouldbepaid.setMargin(amountshouldbepaidtext, new Insets(20));
        hbamountpaid=new HBox();
        hbamountpaid.getChildren().addAll(amountpaidtext,amountpaidvalue,home);
        hbamountpaid.setMargin(amountpaidtext, new Insets(20));
        hbamountshouldbepaid.setAlignment(Pos.CENTER);
        hbamountpaid.setAlignment(Pos.CENTER);
        vbb.getChildren().addAll(hbbadge,hbamountshouldbepaid,hbamountpaid);
        bp.setBottom(vbb);
        scene=new Scene(bp,900,650);
        return scene; 
    } 
}
