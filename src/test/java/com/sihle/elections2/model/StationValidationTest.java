/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.model;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sihle
 */
public class StationValidationTest {
    
    public StationValidationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCreation() throws Exception {
        
        ValidateStationName q = new ValidateStationName.InnerValStation(false).id("1").avail();
        
        Assert.assertTrue(q.isAvalible("high"));

        
    }
    
    @Test
    public void testUpdate() throws Exception {
        ValidateStationName q = new ValidateStationName.InnerValStation(true).id("2").avail();
        
        Assert.assertTrue(q.isAvalible("sihle"));
    }
}
