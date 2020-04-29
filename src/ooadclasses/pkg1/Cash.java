/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;


public class Cash extends Payment {
   
    

    @Override
    public void payride(int amount, int ampaid, Customer c) {
     System.out.println(""+c.getWallet()+"   "+c.getEmail());
      System.out.println(""+amount+"   "+ampaid);
      int x =ampaid-amount+c.getWallet();
      c.setWallet(x);
      c.getCda().setWallet(x,c.getEmail());
    }
public  String getPaymentType(){
    return"Cash";
}
   
    
    
}
