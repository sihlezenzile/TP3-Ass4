/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.services.crud.Imp;

import com.sihle.elections2.model.Statistics;
import com.sihle.elections2.services.crud.StatisticsCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihle
 */
public class StatisticCrudserviceImp implements StatisticsCrudservice {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Statistics find(String id) {
        return null;
    }

    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Statistics persist(Statistics entity) {
        return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Statistics merge(Statistics entity) {
        return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Statistics remove(Statistics entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Statistics> findAll() {
        return null;
    }
    
}
