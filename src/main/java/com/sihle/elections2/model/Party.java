/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.model;

/**
 *
 * @author sihle
 */
public final class Party {
    
    private String id;
    private String name;
    private String president;
    private String deputy;

    private Party() {
    }

    private Party(InnerParty party) {
        id = party.id;
        name = party.name;
        president = party.president;
        deputy = party.deputy;
        
    }
    public static class InnerParty{
        private String id;
        private String name;
        private String president;
        private String deputy;

        public InnerParty(String name, String president, String deputy) {
            //this.id = id;
            this.name = name;
            this.president = president;
            this.deputy = deputy;
        }
        
        public InnerParty id(String i)
        {
            id = i;
            return this;
        }
        
        public Party name()
        {
            return new Party (this);
        }
        
        public InnerParty president(String p)
        {
            president = p;
            return this;
        }
        
        public InnerParty deputy(String d)
        {
            deputy = d;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }

    public String getDeputy() {
        return deputy;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Party other = (Party) obj;
        return true;
    }
    
    
}
