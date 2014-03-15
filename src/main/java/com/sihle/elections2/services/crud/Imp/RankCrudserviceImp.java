/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.services.crud.Imp;

import com.sihle.elections2.model.Rank;
import com.sihle.elections2.services.crud.RankCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihle
 */
public class RankCrudserviceImp implements RankCrudservice{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Rank find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Rank persist(Rank entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Rank merge(Rank entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Rank remove(Rank entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Rank> findAll() {
        return null;
    } 
    
}
