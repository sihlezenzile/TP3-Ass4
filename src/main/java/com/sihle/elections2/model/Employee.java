/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.model;

import java.util.Objects;

/**
 *
 * @author sihle
 */
public final class Employee {
    private String id;
    private String name;
    private String rank;
    private String station;

    public Employee() {
    }
    
    public Employee(InnerEmployee inner)
    {
        id = inner.id;
        name = inner.name;
        station = inner.station;
        rank = inner.rank;
    }
    
    public static class InnerEmployee
    {
        private String id;
        private String name;
        private String rank;
        private String station;

        public InnerEmployee(String p) {
            rank = p;
            
        }
        
        public InnerEmployee id(String i)
        {
            id = i;
            return this;
            
        }
        public InnerEmployee name(String n)
        {
            name = n;
            return this;
        }
        
        public InnerEmployee station(String n)
        {
            station = n;
            return this;
        }
        public Employee rank()
        {
            return new Employee(this);
            
            //return new Question(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getStation() {
        return station;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.rank);
        hash = 79 * hash + Objects.hashCode(this.station);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.rank, other.rank)) {
            return false;
        }
        if (!Objects.equals(this.station, other.station)) {
            return false;
        }
        return true;
    }
    
    
}
