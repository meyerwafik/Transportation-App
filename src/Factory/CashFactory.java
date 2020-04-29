/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Cash;


/**
 *
 * @author Leo
 */
public class CashFactory {
     public static Cash cashactory(){
    return new Cash();
    }
}
