/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import javafx.geometry.Point2D;






public abstract class Car {
   private String carType;
   private String platenumber;
   private String c;
   private double apkm;
   private Point2D currentlocation;
    private int year;
  

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public abstract double getApkm(); 

    public void setApkm(double apkm) {
        this.apkm = apkm;
    }

    public Point2D getCurrentlocation() {
        return currentlocation;
    }

    public void setCurrentlocation(Point2D currentlocation) {
        this.currentlocation = currentlocation;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   
       public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public abstract String getType();
    
    
}
