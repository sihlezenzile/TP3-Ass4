/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.services.crud.Imp;

import com.sihle.elections2.model.Districts;
import com.sihle.elections2.services.crud.DistrictCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihle
 */
public class DistrictCrudserviceImp implements DistrictCrudservice
{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Districts find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Districts persist(Districts entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Districts merge(Districts entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Districts remove(Districts entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Districts> findAll() {
        return null;
    } 
}
