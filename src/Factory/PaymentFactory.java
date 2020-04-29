/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Cash;
import ooadclasses.pkg1.Credit;
import ooadclasses.pkg1.Payment;

/**
 *
 * @author meyer
 */
public class PaymentFactory {
    public static Payment PaymentFactory(String s){
    if(s.equals("Cash")){return new Cash();}
    else 
        return new Credit();
    }
}
