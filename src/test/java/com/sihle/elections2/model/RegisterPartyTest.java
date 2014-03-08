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
public class RegisterPartyTest {
    
    public RegisterPartyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCreation() throws Exception {
        RigisterParty sta = new RigisterParty.InnerRegister("ANC").id("7").reg();
        Assert.assertEquals(sta.add("ANC", "Jacob", "Kgalema"), "name exists");
    }
    
    @Test
    public void testUpdate() throws Exception {
        RigisterParty sta = new RigisterParty.InnerRegister("ANC").id("7").reg();
        Assert.assertEquals(sta.add("PAC", "Jacob", "Kgalema"), "registered");
        //Assert.assertEquals(sta.getId(),"7"); 
    }
}
