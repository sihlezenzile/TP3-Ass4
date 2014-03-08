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
public final class PartyValidation implements DataValidation
{
    private boolean avail;
    private String id;
    
    private PartyValidation (InnerVal val)
    {
        avail = val.avail;
        id = val.id;
    }
    
    private PartyValidation ()
    {

    }

    public static class InnerVal{
        
        private boolean avail;
        private String id;
        
        public InnerVal(boolean b)
        {
            avail = b;
        }
        
        public InnerVal id(String i)
        {
            id = i;
            return this;
        }
        
        public PartyValidation avail()
        {
            return new PartyValidation(this);
        }
    }
    
    public boolean isAvail() {
        return avail;
    }

    public String getId() {
        return id;
    }
   
    
    
    @Override
    public boolean isAvalible(String name) {
        Party s1 = new Party.InnerParty("DA", "Hellen Zille","Lindiwe").id("7").name();
        Party s2 = new Party.InnerParty("ANC", "Jacob Zuma","Motlante").id("8").name();

        List<Party> party = new ArrayList<>();
        party.add(s1);
        party.add(s2);
        
        for(Party p: party)
            if(p.getName().equalsIgnoreCase(name))
                return true;
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.avail ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final PartyValidation other = (PartyValidation) obj;
        if (this.avail != other.avail) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
