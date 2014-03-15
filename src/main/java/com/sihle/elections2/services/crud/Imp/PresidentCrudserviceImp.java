/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.services.crud.Imp;

import com.sihle.elections2.model.Presidents;
import com.sihle.elections2.services.crud.PresidentCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihle
 */
public class PresidentCrudserviceImp implements PresidentCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Presidents find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Presidents persist(Presidents entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Presidents merge(Presidents entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Presidents remove(Presidents entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Presidents> findAll() {
        return null;
    }
    
}
