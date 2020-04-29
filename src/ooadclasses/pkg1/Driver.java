 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import Factory.CarFactory;
import Factory.DriverDataAccessFactory;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;

/**
 *
 * @author meyer
 */
public class Driver {
private String name;
private String email;
private static Driver x=null;
private String telephone;
private Car car;
private Image pic;
private double avgrate;
private int comptrips;
private Point2D currentlocation;
private DriverDataAccess dda;

    public static void setX(Driver x) {
        Driver.x = x;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private Driver(){
        
    }
    public static Driver getInstance(String t){
        if (x==null)
            x=new Driver(t);
        return x;
            
    }

public Driver(String t){
dda=DriverDataAccessFactory.getDriverDataAccess();
car=CarFactory.getFactoryCar(t);
}
    public Point2D getCurrentlocation() {
        return currentlocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Image getPic() {
        return pic;
    }

    public void setPic(Image pic) {
        this.pic = pic;
    }

    public double getAvgrate() {
        return avgrate;
    }

    public void setAvgrate(double avgrate) {
        this.avgrate = avgrate;
    }

    public int getComptrips() {
        return comptrips;
    }

    public void setComptrips(int comptrips) {
        this.comptrips = comptrips;
    }

    public void setCurrentlocation(Point2D currentlocation) {
        this.currentlocation = currentlocation;
    }

  
   

}
