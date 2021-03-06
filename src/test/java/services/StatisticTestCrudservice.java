/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.sihle.elections2.model.Party;
import com.sihle.elections2.model.Statistics;
import com.sihle.elections2.services.crud.PartyCrudservice;
import com.sihle.elections2.services.crud.StatisticsCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sihle
 */
public class StatisticTestCrudservice {
    
    public StatisticTestCrudservice() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Mock
    StatisticsCrudservice crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StatisticsCrudservice.class);
    }
    @Test
    public void testCreate() throws Exception {
        Statistics q1 = new Statistics.InnerStatistics(4).id("7").lowest();
        Statistics returnParty = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnParty);
        Mockito.verify(crudService).persist(q1);
    }
    @Test
    public void testRead() throws Exception {
        Statistics q1 = new Statistics.InnerStatistics(4).id("7").lowest();
        Statistics  returnQuestion = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Statistics q1 = new Statistics.InnerStatistics(4).id("7").lowest();
        Statistics  returnQuestion = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {
        Statistics q1 = new Statistics.InnerStatistics(4).id("7").lowest();
        Statistics returnQuestion = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(q1);

    }
}
