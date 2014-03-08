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
public final class Station {
    private String name;
    private String id;
    private int number;

    private Station() {
    }
    
    private Station(InnerStation oc) {
        id = oc.id;
        name = oc.name;
        number = oc.number;
        
    }
    
    public static class InnerStation{
        private String name;
        private String id;
        private int number;

        public InnerStation(String name) {
            this.name = name;
        }
        
        
        public Station name()
        {
            return new Station (this);
        }
        
        public InnerStation id(String i)
        {
            id = i;
            return this;
        }
        
        public InnerStation number(int nu)
        {
            number = nu;
            return this;
        }

        
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Station other = (Station) obj;
        return true;
    }
}
