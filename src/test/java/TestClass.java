package com.engineer;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestClass {
	  
	  Calculation obj = new Calculation();
    
    @Test
    public void twoPlusTwoEqualsFour(){       
       assertEquals(4,obj.adder(2,2));
    }
}