/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author sihle
 */
public final class RigisterParty implements DataValidation{
    private int counter;
    private String id;
    private String reg;
    
    private RigisterParty(InnerRegister in)
    {
        id = in.id;
        reg = in.reg;
        
    }
    
    private RigisterParty()
    {
        

    }

    @Override
    public boolean isAvalible(String i) {
        Party s1 = new Party.InnerParty("DA", "Hellen Zille","Lindiwe").id("7").name();
        Party s2 = new Party.InnerParty("ANC", "Jacob Zuma","Motlante").id("8").name();

        List<Party> party = new ArrayList<>();
        party.add(s1);
        party.add(s2);
        
        for(Party p: party)
            if(p.getName().equalsIgnoreCase(i))
                return true;
        
        return false;
    }
    
    
    public static class InnerRegister
    {
        private String id;
        private String reg;

        public InnerRegister(String reg) {
            this.reg = reg;
        }
        
        public InnerRegister id(String i)
        {
            id = i;
            return this;
        }
        
        public RigisterParty reg()
        {
           return new RigisterParty(this);
        }
        
        
    }
    public String add(String n, String p, String d)
    {
        Party sta;
        counter++;
        String i = counter+"";
        
        if(isAvalible(n)== false){
            sta = new Party.InnerParty(n, p, d).id(i).name();
            return "registered";}
        
        return "name exists";
    }

    public String getId() {
        return id;
    }

    public String getReg() 
    {
        
        return reg;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.counter;;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RigisterParty other = (RigisterParty) obj;
        if (this.counter != other.counter) {
            return false;
        }

        return true;
    }
    
}
