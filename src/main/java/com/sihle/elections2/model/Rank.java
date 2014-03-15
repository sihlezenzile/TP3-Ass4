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
public class Rank 
{
    
    private String id;
    private String name;
    private String acron;

    private Rank() {
    }
    
    private Rank(InnerRank inner)
    {
        id = inner.id;
        name = inner.name;
        acron = inner.acron;
    }
    public static class InnerRank
    {
        private String id;
        private String name;
        private String acron;

        public InnerRank(String n) {
            name = n;
        }
        
        public InnerRank id(String i)
        {
            id = i;
            return this;
            
        }
        public Rank name()
        {
            return new Rank(this);
        }
        
        public InnerRank acron(String i)
        {
            acron = i;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAcron() {
        return acron;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.acron);
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
        final Rank other = (Rank) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.acron, other.acron)) {
            return false;
        }
        return true;
    }
     
    
    
}
