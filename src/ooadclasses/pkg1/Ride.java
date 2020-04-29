/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import Factory.CarFactory;
import Factory.DriverDataAccessFactory;
import Factory.PaymentFactory;
import Factory.RideDataAccessFactory;
import java.util.ArrayList;
import java.util.Date;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;

/**
 *
 * @author meyer
 */
public class Ride implements Rideable,Rateable{
    private Image badge;
    private int rate;
    private String review;
    private double kilometer;
    private Point2D startlocation;
    private Point2D endlocation;
    private Date starttime;
    private Date endtime;
    private int fare;
    private Customer customer;
    private Driver driver;
    private Discount discount;
    private Payment p;
    DriverDataAccess data;
    RideDataAccess ridedata;
    public Ride() {
    ridedata=RideDataAccessFactory.getRideDataAccess();
      
}
    public Image getBadge() {
        return badge;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setBadge(Image badge) {
        this.badge = badge;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public Point2D getStartlocation() {
        return startlocation;
    }

    public void setStartlocation(Point2D startlocation) {
        this.startlocation = startlocation;
    }

    public Point2D getEndlocation() {
        return endlocation;
    }

    public void setEndlocation(Point2D endlocation) {
        this.endlocation = endlocation;
    }

   

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    


    @Override
    public void cancelRide(ArrayList<Rideable> r) {
       r.remove(r.size()-1);
    }

    @Override
    public void setrating(int r) {
    this.rate=r;
    }

    @Override
    public void setreview(String s) {
    this.review=s;
    }

    public Payment getP() {
        return p;
    }

//    public void addbadge() {
    public void setP(Payment p) {
        this.p = p;
    }


    @Override
    public void addbadge(Image m) {
        this.badge=m;
    }


    @Override
    public void RequestRide(Point2D start, Point2D end,  Payment p,Driver d,Discount dis) {
        data=DriverDataAccessFactory.getDriverDataAccess();
        this.discount=dis;
    this.driver=d;
    this.startlocation=start;
    this.endlocation=end;                       
    this.p=p;
       
    this.driver=data.getDriver(start,d.getCar().getType(),this.driver);
    
    }

    public void rideadd(String Email,int rate ,String Review,int km,int start_x,int start_y,int end_X, int end_y, int fare,String driveremail,Double discount,String payment){
   this.discount=new Promocode();
      
   
    customer.setEmail(Email);
    this.rate=rate;
    this.review=Review;
    this.kilometer=km;
    
    this.startlocation=new Point2D((int)(start_x),(int)(start_y));
    this.endlocation=new Point2D((int)(end_X),(int)(end_y));
    this.fare=fare;
    this.driver.setEmail(driveremail);
    this.discount.setPercentage(discount);
    this.p=PaymentFactory.PaymentFactory(payment);
    ridedata.insertRide(this);
}
    
    
    
}
