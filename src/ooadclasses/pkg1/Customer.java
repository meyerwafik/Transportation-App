/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadclasses.pkg1;

import Factory.CustomerDataAccessFactory;
import java.util.ArrayList;
import javafx.geometry.Point2D;

/**
 *
 * @author meyer
 */
public class Customer  {
private String name;
private static int id;
private double averagerating;
private String telephonenumber;
private Point2D location;
private int wallet;
private boolean sub; 
private String creditcardnumber;
private String email;
private String password;
private int numberofrides;
private CustomerDataAccess cda;



    public Customer(){
    cda=CustomerDataAccessFactory.getCustomerDataAccess();
    
    }
    
    public String getName() {
        return this.name;
    }

  

    public boolean getSub() {
        return this.sub;
    }

    public  int getId() {
        return this.id;
    }

    public  void setId(int id) {
        this.id = id;
    }
       public  void setname(String name) {
       this.name = name;
    }


    public double getAveragerating() {
        return averagerating;
    }

    public void setAveragerating(double averagerating) {
        this.averagerating = averagerating;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public boolean isSub() {
        return sub;
    }

    public void setSub(boolean sub) {
        this.sub = sub;
    }

    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerDataAccess getCda() {
        return cda;
    }

    public void setCda(CustomerDataAccess cda) {
        this.cda = cda;
    }

    public int getNumberofrides() {
        return numberofrides;
    }

    public void setNumberofrides(int numberofrides) {
        this.numberofrides = numberofrides;
    }

   
   



public boolean validaterepassword(String password,String repassword){
return (password==repassword);
}
public void signup(String name,String telephonenumber,String email,String password,String repassword,String creditcardnumber){
    this.name=name;
    this.telephonenumber=telephonenumber;
    this.creditcardnumber=creditcardnumber;
    this.email=email;
//    if (password.equals(repassword)) 
        this.password=password;
    cda.insertCustomer(this);
    
}

public boolean login(String email,String password){
    Customer c1;
    if(cda.verifylogin(email, password)){
        
        c1=cda.retrieveCustomer(email);
        this.averagerating=c1.getAveragerating();
        this.creditcardnumber=c1.getCreditcardnumber();
        this.email=c1.getEmail();
        this.name=c1.getName();
        this.numberofrides=c1.getNumberofrides();
        this.telephonenumber=c1.getTelephonenumber();
        this.wallet=c1.getWallet();
    return true;
            }
    else return false;
}


}
