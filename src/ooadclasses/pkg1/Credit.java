/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

/**
 *
 * @author meyer
 */
public class Credit extends Payment {


    @Override
    public void payride(int amount, int ampaid, Customer c) {
        
    }
    public  String getPaymentType(){
    return"Credit Card";
}
}