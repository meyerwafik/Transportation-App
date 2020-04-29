/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ooadclasses.pkg1;
//
//import Factory.CarFactory;
//import java.util.ArrayList;
//import java.util.Date;
//import javafx.geometry.Point2D;
//import javafx.scene.image.Image;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author meyer
// */
//public class RideTest {
//    
//    public RideTest() {
//    }
//    
////    @BeforeClass
////    public static void setUpClass() {
////    }
////    
////    @AfterClass
////    public static void tearDownClass() {
////    }
////    
////    @Before
////    public void setUp() {
////    }
////    
////    @After
////    public void tearDown() {
////    }
////
////    /**
////     * Test of getBadge method, of class Ride.
////     */
////    @Test
////    public void testGetBadge() {
////        System.out.println("getBadge");
////        Ride instance = new Ride();
////        Image expResult = null;
////        Image result = instance.getBadge();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getRate method, of class Ride.
////     */
////    @Test
////    public void testGetRate() {
////        System.out.println("getRate");
////        Ride instance = new Ride();
////        int expResult = 0;
////        int result = instance.getRate();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setRate method, of class Ride.
////     */
////    @Test
////    public void testSetRate() {
////        System.out.println("setRate");
////        int rate = 0;
////        Ride instance = new Ride();
////        instance.setRate(rate);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setBadge method, of class Ride.
////     */
////    @Test
////    public void testSetBadge() {
////        System.out.println("setBadge");
////        Image badge = null;
////        Ride instance = new Ride();
////        instance.setBadge(badge);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getReview method, of class Ride.
////     */
////    @Test
////    public void testGetReview() {
////        System.out.println("getReview");
////        Ride instance = new Ride();
////        String expResult = "";
////        String result = instance.getReview();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setReview method, of class Ride.
////     */
////    @Test
////    public void testSetReview() {
////        System.out.println("setReview");
////        String review = "";
////        Ride instance = new Ride();
////        instance.setReview(review);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getKilometer method, of class Ride.
////     */
////    @Test
////    public void testGetKilometer() {
////        System.out.println("getKilometer");
////        Ride instance = new Ride();
////        double expResult = 0.0;
////        double result = instance.getKilometer();
////        assertEquals(expResult, result, 0.0);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setKilometer method, of class Ride.
////     */
////    @Test
////    public void testSetKilometer() {
////        System.out.println("setKilometer");
////        double kilometer = 0.0;
////        Ride instance = new Ride();
////        instance.setKilometer(kilometer);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getStartlocation method, of class Ride.
////     */
////    @Test
////    public void testGetStartlocation() {
////        System.out.println("getStartlocation");
////        Ride instance = new Ride();
////        Point2D expResult = null;
////        Point2D result = instance.getStartlocation();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setStartlocation method, of class Ride.
////     */
////    @Test
////    public void testSetStartlocation() {
////        System.out.println("setStartlocation");
////        Point2D startlocation = null;
////        Ride instance = new Ride();
////        instance.setStartlocation(startlocation);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getEndlocation method, of class Ride.
////     */
////    @Test
////    public void testGetEndlocation() {
////        System.out.println("getEndlocation");
////        Ride instance = new Ride();
////        Point2D expResult = null;
////        Point2D result = instance.getEndlocation();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setEndlocation method, of class Ride.
////     */
////    @Test
////    public void testSetEndlocation() {
////        System.out.println("setEndlocation");
////        Point2D endlocation = null;
////        Ride instance = new Ride();
////        instance.setEndlocation(endlocation);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getStarttime method, of class Ride.
////     */
////    @Test
////    public void testGetStarttime() {
////        System.out.println("getStarttime");
////        Ride instance = new Ride();
////        Date expResult = null;
////        Date result = instance.getStarttime();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setStarttime method, of class Ride.
////     */
////    @Test
////    public void testSetStarttime() {
////        System.out.println("setStarttime");
////        Date starttime = null;
////        Ride instance = new Ride();
////        instance.setStarttime(starttime);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getEndtime method, of class Ride.
////     */
////    @Test
////    public void testGetEndtime() {
////        System.out.println("getEndtime");
////        Ride instance = new Ride();
////        Date expResult = null;
////        Date result = instance.getEndtime();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setEndtime method, of class Ride.
////     */
////    @Test
////    public void testSetEndtime() {
////        System.out.println("setEndtime");
////        Date endtime = null;
////        Ride instance = new Ride();
////        instance.setEndtime(endtime);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getFare method, of class Ride.
////     */
////    @Test
////    public void testGetFare() {
////        System.out.println("getFare");
////        Ride instance = new Ride();
////        int expResult = 0;
////        int result = instance.getFare();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setFare method, of class Ride.
////     */
////    @Test
////    public void testSetFare() {
////        System.out.println("setFare");
////        int fare = 0;
////        Ride instance = new Ride();
////        instance.setFare(fare);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getCustomer method, of class Ride.
////     */
////    @Test
////    public void testGetCustomer() {
////        System.out.println("getCustomer");
////        Ride instance = new Ride();
////        Customer expResult = null;
////        Customer result = instance.getCustomer();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setCustomer method, of class Ride.
////     */
////    @Test
////    public void testSetCustomer() {
////        System.out.println("setCustomer");
////        Customer customer = null;
////        Ride instance = new Ride();
////        instance.setCustomer(customer);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getDriver method, of class Ride.
////     */
////    @Test
////    public void testGetDriver() {
////        System.out.println("getDriver");
////        Ride instance = new Ride();
////        Driver expResult = null;
////        Driver result = instance.getDriver();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setDriver method, of class Ride.
////     */
////    @Test
////    public void testSetDriver() {
////        System.out.println("setDriver");
////        Driver driver = null;
////        Ride instance = new Ride();
////        instance.setDriver(driver);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getDiscount method, of class Ride.
////     */
////    @Test
////    public void testGetDiscount() {
////        System.out.println("getDiscount");
////        Ride instance = new Ride();
////        Discount expResult = null;
////        Discount result = instance.getDiscount();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setDiscount method, of class Ride.
////     */
////    @Test
////    public void testSetDiscount() {
////        System.out.println("setDiscount");
////        Discount discount = null;
////        Ride instance = new Ride();
////        instance.setDiscount(discount);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of cancelRide method, of class Ride.
////     */
////    @Test
////    public void testCancelRide() {
////        System.out.println("cancelRide");
////        ArrayList<Rideable> r = null;
////        Ride instance = new Ride();
////        instance.cancelRide(r);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setrating method, of class Ride.
////     */
////    @Test
////    public void testSetrating() {
////        System.out.println("setrating");
////        int r = 0;
////        Ride instance = new Ride();
////        instance.setrating(r);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setreview method, of class Ride.
////     */
////    @Test
////    public void testSetreview() {
////        System.out.println("setreview");
////        String s = "";
////        Ride instance = new Ride();
////        instance.setreview(s);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getP method, of class Ride.
////     */
////    @Test
////    public void testGetP() {
////        System.out.println("getP");
////        Ride instance = new Ride();
////        Payment expResult = null;
////        Payment result = instance.getP();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setP method, of class Ride.
////     */
////    @Test
////    public void testSetP() {
////        System.out.println("setP");
////        Payment p = null;
////        Ride instance = new Ride();
////        instance.setP(p);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of addbadge method, of class Ride.
////     */
////    @Test
////    public void testAddbadge() {
////        System.out.println("addbadge");
////        Image m = null;
////        Ride instance = new Ride();
////        instance.addbadge(m);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of calculateFare method, of class Ride.
////     */
//    @Test
//    public void testCalculateFare() {
//        System.out.println("calculateFare");
//        Car c = CarFactory.getFactoryCar("Economy");
//        double km = 5.0;
//        Discount d = new Promocode();
//        d.setRemainingTrips(5);
//        Ride instance = new Ride();
//        int expResult = (int) 15;
//        int result = instance.calculateFare(c, km, d);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of RequestRide method, of class Ride.
//     */
////    @Test
////    public void testRequestRide() {
////        System.out.println("RequestRide");
////        Point2D start = null;
////        Point2D end = null;
////        String promocode = "";
////        Payment p = null;
////        Driver d = null;
////        Ride instance = new Ride();
////        instance.RequestRide(start, end, promocode, p, d);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of rideadd method, of class Ride.
////     */
////    @Test
////    public void testRideadd() {
////        System.out.println("rideadd");
////        String Email = "";
////        int rate = 0;
////        String Review = "";
////        int km = 0;
////        int start_x = 0;
////        int start_y = 0;
////        int end_X = 0;
////        int end_y = 0;
////        int fare = 0;
////        String driveremail = "";
////        Double discount = null;
////        String payment = "";
////        Ride instance = new Ride();
////        instance.rideadd(Email, rate, Review, km, start_x, start_y, end_X, end_y, fare, driveremail, discount, payment);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of nearestcar method, of class Ride.
////     */
////    @Test
////    public void testNearestcar() {
////        System.out.println("nearestcar");
////        Point2D startlocation = null;
////        String cartype = "";
////        Ride instance = new Ride();
////        Car expResult = null;
////        Car result = instance.nearestcar(startlocation, cartype);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////    
//}
