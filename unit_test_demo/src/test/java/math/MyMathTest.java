package demo.junit_class_demo.math;

import org.junit.Test;

import demo.junit_class_demo.math.MyMath;

import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * An class that provides test cases for the 
 * "simple" math operations of the MyMath 
 * class, for demonstrating Unit Testing.
 * @author agkortzis (antonis.gkortzis@gmail.com)
 */
public class MyMathTest {
	MyMath mm = new MyMath();
	
	/*
	 * A unit test that checks a valid positive input
	 */
    @Test
    public void testGetSignShouldReturnPositive() {
       String x = mm.checkSign(5);
       assertThat(x, containsString("positive"));

    }
    
    /*
	 * A unit test that checks a valid negative input
	 */
    @Test
    public void testGetSignShouldReturnNegative() {
        String x = mm.checkSign(-5);
        assertThat(x, containsString("negative"));
    }

    @Test (expected = IllegalArgumentException.class)
    	public void testGetSignShouldReturnNull() {
    		mm.checkSign(0);
    }
     @Test
        public void testReverseNumber(){
            Assert.assertEquals(5,mm.reverseNumber(-5));
     }
    
}



