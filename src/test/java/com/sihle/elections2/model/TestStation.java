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
public class TestStation {
    
    public TestStation() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCreation() throws Exception {
        Station q = new Station.InnerStation("sihle").id("5").name();
        Assert.assertEquals(q.getName(),"sihle");
        Assert.assertEquals(q.getId(),"5");
        
    }
    
    @Test
    public void testUpdate() throws Exception {
        
        Station q = new Station.InnerStation("micheal").id("9").name();
        Assert.assertEquals(q.getName(),"micheal");
        Assert.assertEquals(q.getId(),"9");
    }
}
