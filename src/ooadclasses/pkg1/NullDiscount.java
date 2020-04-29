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
public class NullDiscount extends Discount{

    @Override
    public double getPercentage() {
        return 0;
    }
      public void checkPromo(String promo)
    {
       
                     this.setPercentage(0);
        
           }
    
}
