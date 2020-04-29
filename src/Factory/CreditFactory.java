/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Cash;
import ooadclasses.pkg1.Credit;


/**
 *
 * @author Leo
 */
public class CreditFactory {
     public static Credit creditfactory(){
    return new Credit();
    }
}
