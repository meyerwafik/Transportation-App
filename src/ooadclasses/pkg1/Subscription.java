/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

/**
 *
 * @author Leo
 */

public abstract class Subscription extends Discount {
    @Override
    public abstract double getPercentage();
    @Override
      public void checkPromo(String promo)
    {
        this.setPercentage(0.7);
                       
        
           }
   
    
}
