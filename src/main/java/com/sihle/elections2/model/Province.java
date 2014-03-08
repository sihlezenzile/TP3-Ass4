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
public class Province {
    
    private int districts;
    private int stations;
    private String id;

    private Province() {
    }

    private Province(InnerProvince in)
    {
        stations= in.stations;
        districts = in.districts;
        id = in.id;
    }
    
    public static class InnerProvince
    {
        private int districts;
        private int stations; 
        private String id;
        
        public InnerProvince(int p)
        {
            stations = p;
        }
        
        public InnerProvince districts(int d)
        {
            districts = d;
            return this;
        }
        
        public InnerProvince id(String i)
        {
            id = i;
            return this;
        }
        
        public Province stations()
        {
            return new Province(this);
        }
    }
    
    public int getDistricts() {
        return districts;
    }

    public int getStations() {
        return stations;
    }
    
    public String getId() {
       return id;
    }   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.districts;
        hash = 43 * hash + this.stations;
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
        final Province other = (Province) obj;
        if (this.districts != other.districts) {
            return false;
        }
        if (this.stations != other.stations) {
            return false;
        }
        return true;
    }
    
    
    
}
