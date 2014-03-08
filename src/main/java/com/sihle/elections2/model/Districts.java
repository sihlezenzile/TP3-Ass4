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
public class Districts {
    
    private int number;
    private  String id;

    private Districts() {
    }

    private Districts(InnerDis d) {
        
        number = d.number;
        
    }

    public static class InnerDis
    {
        private int number;
        private  String id; 

        public InnerDis(int number) {
            this.number = number;
        }
        
        public InnerDis id(String i)
        {
            id = i;
            return this;
        }
        
        public Districts number()
        {
            return new Districts(this);
        }
    }
    
    public int getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.number;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Districts other = (Districts) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
