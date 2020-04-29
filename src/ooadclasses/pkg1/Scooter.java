/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import javafx.geometry.Point2D;

/**
 *
 * @author meyee
 */


public class Scooter extends Car {


    @Override
    public double getApkm() {
        return 2.5;
    }

    @Override
      public String getType() {
        return "Scooter";
    }
}
