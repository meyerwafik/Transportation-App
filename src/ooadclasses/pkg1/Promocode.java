/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import Factory.PromoCodeDataAccessFactory;

/**
 *
 * @author Leo
 */
public class Promocode extends Discount{
    

   private String promo;
   
    

    
//    
//    public boolean validatePromocode(String promocode){
//        
//    }
  public void checkPromo(String promo)
    {
        pda=PromoCodeDataAccessFactory.getPomocodeFactory();
      this.setPercentage(pda.checkPromo(promo));
                       
        
           }
    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }


  
}

