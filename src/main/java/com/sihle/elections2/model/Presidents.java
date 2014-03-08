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
public final class Presidents {
    
    private String name;
    private String id;

    private Presidents() {
    }

    private Presidents(InnerPresident p) {
        
        name = p.name;
        id = p.id;
    }
    
    public static class InnerPresident
    {
        private String name;
        private String id;
        
        public InnerPresident(String n)
        {
           name = n;
           
        }
        
        public InnerPresident id(String i)
        {
            id= i;
            return this;
        }
        
        public Presidents name()
        {
            return new Presidents(this);
        }
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Presidents other = (Presidents) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
