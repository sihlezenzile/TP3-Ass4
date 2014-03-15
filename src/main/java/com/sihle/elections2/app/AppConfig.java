/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sihle.elections2.app;

import com.sihle.elections2.services.CrudService;
import com.sihle.elections2.services.crud.Imp.PartyCrudserviceImp;
import com.sihle.elections2.services.crud.Imp.VoterCrudseviceImp;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author sihle
 */
@Configurable
public class AppConfig {
    
    @Bean(name="partyCrudService")
    public CrudService getPartyCrudService(){
        return new PartyCrudserviceImp();
    }
    
    @Bean(name="partyCrudService")
    public CrudService getVoterCrudService(){
        return new VoterCrudseviceImp();
    } 
}
