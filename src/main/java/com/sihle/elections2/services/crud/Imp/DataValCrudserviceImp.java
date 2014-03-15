/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.services.crud.Imp;

import com.sihle.elections2.model.ValidateStationName;
import com.sihle.elections2.services.crud.DataValCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihle
 */
public class DataValCrudserviceImp implements DataValCrudservice{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ValidateStationName find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ValidateStationName persist(ValidateStationName entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ValidateStationName merge(ValidateStationName entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ValidateStationName remove(ValidateStationName entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ValidateStationName> findAll() {
        return null;
    }   
}
