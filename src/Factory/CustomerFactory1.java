/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Customer;


/**
 *
 * @author Leo
 */
public class CustomerFactory1 {
    public static Customer customerfactory(){
    return new Customer();
    }
}
