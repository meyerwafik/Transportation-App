/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Discount;
import ooadclasses.pkg1.DriverDataAccess;
import ooadclasses.pkg1.PromoCodeDataAccess;
import ooadclasses.pkg1.Promocode;

/**
 *
 * @author Leo
 */
public class PromoCodeDataAccessFactory {
 public static PromoCodeDataAccess getPomocodeFactory(){
 return new PromoCodeDataAccess();
 }   
}
