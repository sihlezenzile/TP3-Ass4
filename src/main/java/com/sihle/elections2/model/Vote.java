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
public final  class  Vote
{
    private String id;
    private int vot;

    private Vote() {
    }

    
    
    private Vote(InnerVote in) {
        this.id = in.id;
        this.vot = in.vot;
    }

     
    
    public int getVot() {
        return vot;
    }

        
    public String getId() {
       return id;
    }
    
    public static class InnerVote {
        private String id;
        private int vot;
        
        public InnerVote id(String i)
        {
            id = i;
            return this;
        }
        
        public Vote vot()
        {
            return new Vote(this);
        }
        
        public InnerVote(int v) {
            vot = v;
        }
    }
    
    
    
}
