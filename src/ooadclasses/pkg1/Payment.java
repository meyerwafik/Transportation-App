/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import javafx.geometry.Point2D;

/**
 *
 * @author meyer
 */
public abstract class Payment {
public final void pay(Point2D start,Point2D finish,double apk,Customer c,int amountpaid,Discount d){
    int x=calculateFare(start, finish, apk,d);
    payride(x,amountpaid,c);        

}
public abstract void payride(int amount,int ampaid,Customer c);
public abstract String getPaymentType();











public int calculateFare(Point2D start,Point2D finish,double apk,Discount d){
    double dx=Math.abs(start.getX()-finish.getX());
    double dy=Math.abs(start.getY()-finish.getY());
    double cost=(1-d.getPercentage())*((dx+dy)*apk);
    return (int)cost;
}
}

