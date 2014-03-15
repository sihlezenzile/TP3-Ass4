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
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCreation() throws Exception {
        Employee sta = new Employee.InnerEmployee("DOP").id("7").rank();
        Assert.assertEquals(sta.getRank(), "DOP");
    }
    
    @Test
    public void testUpdate() throws Exception {
        Employee sta = new Employee.InnerEmployee("DC").id("7").rank();
        Assert.assertEquals(sta.getRank(), "DC");
        Assert.assertEquals(sta.getId(),"7"); 
    }
}
