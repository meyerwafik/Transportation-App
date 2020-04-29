/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.RideDataAccess;

/**
 *
 * @author meyer
 */
public class RideDataAccessFactory {
 public static RideDataAccess getRideDataAccess(){
 return new RideDataAccess();
 }   
}
