/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.JUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caleb Cragun
 */
public class UnitTests {
    
    public UnitTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class");
    }
    
    @Before
    public void setUp() {
        System.out.println("before");
    }
    
    @After
    public void tearDown() {
        System.out.println("after");
    }

    @Test
    public void testMax(){
        System.out.println("Find max testcase");
        assertEquals(4, JUnit.findMax(new int[]{1,2,3,4,3,2,1}));
        assertEquals(-1, JUnit.findMax(new int[]{-12,-1,-2,-3}));
    }
    
    @Test
    public void testSum(){
        System.out.println("Sum values testcase");
        assertEquals(4, JUnit.sumValues(2, 2));
        assertEquals(5, JUnit.sumValues(2, 3));
        assertEquals(6, JUnit.sumValues(2, 4));
        assertEquals(7, JUnit.sumValues(2, 5));
        assertEquals(8, JUnit.sumValues(2, 6));
    }
    
    @Test
    public void testPalindrome(){
        System.out.println("Palindrome testcase");
        assertEquals("Palindrome", JUnit.palindromeCheck("madam im adam"));
        assertEquals("Not a palindrome", JUnit.palindromeCheck("slick snake"));
        assertEquals("Palindrome", JUnit.palindromeCheck("race car"));
        assertEquals("Not a palindrome", JUnit.palindromeCheck("okie dokie"));
    }
}
