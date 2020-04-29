/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import java.util.Date;

/**
 *
 * @author meyer
 */
public abstract class Discount {
    private double percentage;
    private Date start;
    private Date end;
    private int Triplimit;
    private int RemainingTrips;
    protected PromoCodeDataAccess pda;

    public int getRemainingTrips() {
        return RemainingTrips;
    }

    public void setRemainingTrips(int RemainingTrips) {
        this.RemainingTrips = RemainingTrips;
    }
    
   

   public double getPercentage()
    {
       return this.percentage;
        
           }


    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getTriplimit() {
        return Triplimit;
    }

    public void setTriplimit(int Triplimit) {
        this.Triplimit = Triplimit;
    }
    public abstract void checkPromo(String promo);
    
    
}
