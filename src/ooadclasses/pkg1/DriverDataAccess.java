/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import Factory.CarFactory;
import Factory.DriverFactory;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.geometry.Point2D;
import projectooad.ProjectOOAD;

/**
 *
 * @author Leo
 */
public class DriverDataAccess {

    public Driver getDriver(Point2D location,String type,Driver d){
        
        int x,y;
     
        try {
            
                Connection con =ProjectOOAD.getconnection();
                 System.out.println("ccccc");
                PreparedStatement dr=con.prepareStatement("SELECT Driver_Email,Location_X,Location_Y FROM driver_dataaccess WHERE Type = '"+type+"'" );
          ResultSet r=   dr.executeQuery();
          double min=10000;
          double dis;
          String driver=null;
           System.out.println("dddd");
          while(r.next()){
              
             x= r.getInt("Location_X");
             y= r.getInt("Location_Y");
              
             dis=Math.sqrt((Math.pow(x-location.getX(),2)+Math.pow(y-location.getY(),2)));
             if(dis<min)
             {
                 min=dis;
              driver=r.getString("Driver_Email");
              
          }
          
        }
           System.out.println("eeeee");
          PreparedStatement drf=con.prepareStatement("SELECT * FROM driver_dataaccess WHERE Driver_Email = '"+driver+"'" );
      ResultSet rsf=drf.executeQuery();
      rsf.next();
      d.setName(rsf.getString("Name"));
      d.setEmail(rsf.getString("Driver_Email"));
      d.setAvgrate(rsf.getDouble("Average_Rate"));
      d.setTelephone(rsf.getString("Phone"));
      d.setComptrips(rsf.getInt("Completed_Trips"));
      Point2D curloc=new Point2D(rsf.getInt("Location_X"),rsf.getInt("Location_Y") );
      d.setCurrentlocation(curloc);
      d.getCar().setApkm(rsf.getDouble("Amount_per_km"));
      d.getCar().setC(rsf.getString("Colour"));
      System.out.println( d.getCar().getC());
      d.getCar().setPlatenumber(rsf.getString("Plate_number"));
      System.out.println( rsf.getString("Plate_number"));
      System.out.println( d.getCar().getPlatenumber());
      d.getCar().setYear(rsf.getInt("Year"));   
      d.getCar().setCarType(rsf.getString("Car"));   
      System.out.println( d.getCar().getCarType());
        }
           catch (Exception ex)
           {
                
            }
        
     
        return d;
    }
}
