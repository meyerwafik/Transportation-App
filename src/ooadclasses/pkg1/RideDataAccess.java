/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import projectooad.ProjectOOAD;

/**
 *
 * @author meyer
 */
public class RideDataAccess {
    
    public void insertRide(Ride r){
        try {
                Connection con =ProjectOOAD.getconnection();
                PreparedStatement cr=con.prepareStatement("INSERT INTO ride_dataaccess(Email,Rate,Review,Km,Start_X,Start_Y,End_X,End_Y,Fare,Driver_Email,Discount,Payment)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

                cr.setString(1,r.getCustomer().getEmail());

                cr.setInt(2, r.getRate());
                cr.setString(3, r.getReview());
                cr.setInt(4,(int)r.getKilometer());
                cr.setInt(5,(int) r.getStartlocation().getX());
                 cr.setInt(6,(int) r.getStartlocation().getY());
                 cr.setInt(7,(int) r.getEndlocation().getX());
               cr.setInt(8,(int) r.getEndlocation().getY());
                cr.setInt(9, r.getFare());
                cr.setString(10, r.getDriver().getEmail());
                cr.setDouble(11, r.getDiscount().getPercentage());
                System.out.println(r.getDiscount().getPercentage());
                cr.setString(12, r.getP().getPaymentType());

                cr.executeUpdate();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
    
}
