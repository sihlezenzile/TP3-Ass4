/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sihle
 */
public class ValidateStationName{
    private String id;
    private boolean avail;

    private ValidateStationName() 
    {
        
    }
    
    private ValidateStationName(InnerValStation in) 
    {
        this.id = in.id;
        this.avail = in.avail;
    }

    public String getId() {
        return id;
    }

    
    public boolean isAvail() {
        return avail;
    }
    
    public static class InnerValStation
    {
        private String id;
        private boolean avail;
        
        public InnerValStation(boolean a)
        {
            avail = a;
        }
        
        public InnerValStation id(String i)
        {
            id = i;
            return this;
        }
        
        public ValidateStationName avail()
        {
            return new ValidateStationName(this);
        }
    }
          
    
    //@Override
    public boolean isAvalible(String name) {
        Station s1 = new Station.InnerStation("sihle").id("5").name();
        Station s2 = new Station.InnerStation("high").id("6").name();
        
        List<Station> party = new ArrayList<>();
        
        party.add(s1);
        party.add(s2);
        
        for(Station p: party)
            if(p.getName().equalsIgnoreCase(name))
                return true;
        
        return false;
    }
    
}
