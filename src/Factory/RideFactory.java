/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Ride;

/**
 *
 * @author Leo
 */
public class RideFactory {
     public static Ride ridefactory(){
    return new Ride();
    }
}
