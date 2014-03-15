/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.services.crud.Imp;

import com.sihle.elections2.model.Employee;
import com.sihle.elections2.services.crud.EmployeeCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihle
 */
public class EmployeeCrudserviceImp implements EmployeeCrudservice{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Employee find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Employee persist(Employee entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Employee merge(Employee entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Employee remove(Employee entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Employee> findAll() {
        return null;
    } 
}
