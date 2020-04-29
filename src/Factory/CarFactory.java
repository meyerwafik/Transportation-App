/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Car;
import ooadclasses.pkg1.Economy;
import ooadclasses.pkg1.Luxury;
import ooadclasses.pkg1.Pets;
import ooadclasses.pkg1.Scooter;

/**
 *
 * @author Leo
 */
public class CarFactory {
    
//    public static Luxury getLuxury(){
//    return new Luxury();
//    } 
//    
//    public static Economy getEconomy(){
//    return new Economy();
//    }
//    
//    public static Pets getPets(){
//    return new Pets();
//    }
//    
//    public static Scooter getScooter(){
//    return new Scooter();
//    }
     public static Car getFactoryCar(String type){
    if (type.equals("Luxury")){
        return new Luxury();
    }
    else if(type.equals("Economy")){
            return new Economy();
    } else if (type.equals("Scooter"))
    {
        return new Scooter();
    }else if (type.equals("Pets")){
        return new Pets();
    }
    return null;
    
}
}
