/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ooadclasses.pkg1.Cancel;
import ooadclasses.pkg1.Request;
import ooadclasses.pkg1.RideCommand;

/**
 *
 * @author Leo
 */
public class RideCommandFactory {
    public static RideCommand getRideCommandRequest(){
    return new Request();
    }
    
    public static RideCommand getRideCommandCancel(){
    return new Cancel();
    }
}
