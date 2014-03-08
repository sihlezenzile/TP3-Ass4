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
public class PartyTest {
    
    public PartyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
        Party sta = new Party.InnerParty("DA", "Hellen Zille","Lindiwe").id("7").name();
        Assert.assertEquals(sta.getPresident(), "Hellen Zille");
        Assert.assertEquals(sta.getId(),"7"); 
    }
    
    @Test
    public void testUpdate() throws Exception {
        Party sta = new Party.InnerParty("ANC", "Jacob Zuma","Motlante").id("7").name();
        Assert.assertEquals(sta.getPresident(), "Jacob Zuma");
        Assert.assertEquals(sta.getId(),"7"); 
    }
}
