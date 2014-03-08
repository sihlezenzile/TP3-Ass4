/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.model;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sihle
 */
public class VoterTest {
    
    
    public VoterTest() {
    }
    
    @BeforeMethod
    public void setUp() throws Exception {
    }
    
    @Test
    public void testCreation() throws Exception {
        Voter sta = new Voter.InnerVoter("Western Cape").id("7").province();
        Assert.assertEquals(sta.getProvince(), "Western Cape");
        Assert.assertEquals(sta.getId(),"7");   
    }
    
    @Test
    public void testUpdate() throws Exception {
        Voter sta = new Voter.InnerVoter("Eastern Cape").id("9").province();
        Assert.assertEquals(sta.getProvince(), "Eastern Cape");
        Assert.assertEquals(sta.getId(),"9");  
    }

}
