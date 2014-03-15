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
public class RankTest {
    
    public RankTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCreation() throws Exception {
        Rank sta = new Rank.InnerRank("National Patry").id("7").name();
        Assert.assertEquals(sta.getName(), "National Patry");
    }
    
    @Test
    public void testUpdate() throws Exception {
        Rank sta = new Rank.InnerRank("Agang").id("9").name();
        Assert.assertEquals(sta.getName(), "Agang");
        Assert.assertEquals(sta.getId(),"9"); 
    }
}
