/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import projectooad.ProjectOOAD;

/**
 *
 * @author meyer
 */
public class CustomerDataAccess {
    


    public void insertCustomer(Customer c){
        try {
                Connection con =ProjectOOAD.getconnection();
                PreparedStatement cr=con.prepareStatement("INSERT INTO customertest(Name,Average_Rating,Phone_number,Wallet,Subscription,Credit_card_number,State,Email,Password,Number_of_rides)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?) ");

                cr.setString(1,c.getName());
                cr.setDouble(2, 0);
                cr.setString(3, c.getTelephonenumber());
                cr.setInt(4, 0);
                cr.setBoolean(5, Boolean.FALSE);
                cr.setString(6, c.getCreditcardnumber());
                cr.setString(7, "NotInRide");
                cr.setString(8,c.getEmail() );
                cr.setString(9, c.getPassword());
                cr.setInt(10, 0);

                cr.executeUpdate();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
    public boolean verifylogin(String email,String password)
    {
          try {
                Connection con =ProjectOOAD.getconnection();
                
                PreparedStatement cr=con.prepareStatement("SELECT Password FROM Customertest WHERE Email='"+email+"'");
                
                ResultSet result =cr.executeQuery();
                result.next();
                
              
    
                if( result.getString("Password").equals(password)){
                   
                    return true;
                }
          }
           catch (Exception ex) {
                
            }
        
        return false;
    }
    public void setWallet(int wallet,String email){
         try {
                Connection co2 =ProjectOOAD.getconnection();
                PreparedStatement cr=co2.prepareStatement("UPDATE Customertest SET Wallet='"+wallet+"' WHERE Email = '"+email+"'");
                cr.executeUpdate();
        
    }   catch (Exception ex) {
             System.out.println("error");
        }
    }
    public Customer retrieveCustomer(String email){
       
        Customer c1=Factory.CustomerFactory1.customerfactory();
        try {
            Connection co = ProjectOOAD.getconnection();
            PreparedStatement log=co.prepareStatement("SELECT * FROM Customertest WHERE Email='"+email+"'");
            ResultSet result2 =log.executeQuery();
            result2.next();
            c1.setname(result2.getString("Name"));
            c1.setCreditcardnumber(result2.getString("Credit_card_number"));
            c1.setAveragerating(result2.getDouble("Average_Rating"));
            c1.setEmail(result2.getString("Email"));
            c1.setNumberofrides(result2.getInt("Number_of_rides"));
            c1.setWallet(result2.getInt("Wallet"));
            c1.setTelephonenumber(result2.getString("Phone_number"));
            
            
            
            
        } catch (Exception ex) {
            
        }
        return c1; 
    }

}
