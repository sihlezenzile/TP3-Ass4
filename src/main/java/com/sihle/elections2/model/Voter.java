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

public  class Voter {
    
    private String id;
    private String name;
    private String surname;
    private String province;

    private Voter() {
    }
    
    private Voter(InnerVoter inner) {
        
        name = inner.name;
        surname = inner.surname;
        province = inner.province;
        id = inner.id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getProvince() {
        return province;
    }
    
    public static class InnerVoter
    {
        private String id;
        private String name;
        private String surname;
        private String province;
        
        public InnerVoter(String p) {
            province = p;
            
            }
        
        public InnerVoter id(String i)
        {
            id = i;
            return this;
            
        }
        
        public InnerVoter surname(String s)
        {
            surname = s;
            return this;
        }
        
        public InnerVoter name(String n)
        {
            name = n;
            return this;
        }
        
        public Voter province()
        {
            return new Voter(this);
            
            //return new Question(this);
        }
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        Voter voter = (Voter)obj;
        
        
    if (!id.equals(voter.id)) return false;

        //final Voter other = (Voter) obj;
        return true;
    }
    
    
}
