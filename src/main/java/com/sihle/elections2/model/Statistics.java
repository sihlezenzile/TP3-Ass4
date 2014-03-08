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
public final class Statistics {
    
    private String id;
    private int highest;
    private int lowest;
    
    private Statistics()
    {
        
    }
    
    private Statistics(InnerStatistics obj)
    {
        id = obj.id;
        highest = obj.highest;
        lowest = obj.lowest;   
    }
    
    
    public static class InnerStatistics{
        private String id;
        private int highest;
        private int lowest;

        public InnerStatistics(int lowest) {
            this.lowest = lowest;
        }
        
        
        public InnerStatistics id(String i)
        {
            id = i;
            return this;
        }
        
        public InnerStatistics highest(int h)
        {
            highest = h;
            return this;
        }
        
        public Statistics lowest()
        {
            return new Statistics(this);
        }
         
    }

    public String getId() {
        return id;
    }

    public int getHighest() {
        return highest;
    }

    public int getLowest() {
        return lowest;
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
        final Statistics other = (Statistics) obj;
        return true;
    }
    
    
}
