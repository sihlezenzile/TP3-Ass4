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
public class StatisticsTest {
    
    Statistics sta;
    
    public StatisticsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCreation() throws Exception {
        sta = new Statistics.InnerStatistics(3).id("5").lowest();
        Assert.assertEquals(sta.getLowest(),3);
        Assert.assertEquals(sta.getId(),"5");
        
    }
    
    @Test
    public void testUpdate() throws Exception {
        sta = new Statistics.InnerStatistics(4).id("7").lowest();
        Assert.assertEquals(sta.getLowest(),4);
        Assert.assertEquals(sta.getId(),"7");
    }
}
