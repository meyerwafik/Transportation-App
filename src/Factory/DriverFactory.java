/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Driver;
import ooadclasses.pkg1.DriverDataAccess;

/**
 *
 * @author Leo
 */
public class DriverFactory {
 public static Driver getDriver(String t){
  return new Driver(t);
 }   
}
