/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import java.util.ArrayList;
import java.util.Date;
import javafx.geometry.Point2D;

/**
 *
 * @author Leo
 */
public interface Rideable {

    public void RequestRide(Point2D start,Point2D end,Payment p,Driver d,Discount dis);
    public void cancelRide(ArrayList<Rideable> r);

 
}
