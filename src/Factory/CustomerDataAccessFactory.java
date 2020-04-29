/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.CustomerDataAccess;

/**
 *
 * @author Leo
 */
public class CustomerDataAccessFactory {
    public static CustomerDataAccess getCustomerDataAccess(){
    return new CustomerDataAccess();
    }
    
}
