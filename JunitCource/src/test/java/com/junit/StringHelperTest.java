package com.junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	
	//StringHelper helper;
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before Test");
	}
	
    @Test
	public void testArrays() {
		int [] numbers= {12,3,4,1};
		int [] expected= {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}
    
    @Test(expected=NullPointerException.class)
     public void testArrays_Null()
     {
    	int [] numbers=null;
    	Arrays.sort(numbers);
     }
    
    @Test(timeout=100)
     public void test_performance()
     {
    	int array[]= {12,23,4};
    	for(int i=1;i<=1000000;i++)
    	{
    		array[0]=i;
    		Arrays.sort(array);
    	}
     }
    
    @After
    public void after()
    {
    	System.out.println("After Test");
    }
    
    @AfterClass
    public static void afterClass()
    {
    	System.out.println("After Class");
    }
    

}
