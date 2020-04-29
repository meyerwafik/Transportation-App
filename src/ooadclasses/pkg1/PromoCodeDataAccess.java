/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import projectooad.ProjectOOAD;

/**
 *
 * @author meyer
 */
public class PromoCodeDataAccess {
     public double checkPromo(String promo)
     {
       try {
                Connection con =ProjectOOAD.getconnection();
                
                PreparedStatement cr=con.prepareStatement("SELECT Discount FROM promocodes WHERE PromoCode='"+promo+"'");
               
                ResultSet result =cr.executeQuery();
                result.next();
                double d=result.getDouble("Discount");
                System.out.println(d);
                return d;
                        
        
    
    }    catch (Exception ex) {
             
         }
       return 0;
     }   
    
}
