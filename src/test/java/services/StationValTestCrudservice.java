/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.sihle.elections2.model.ValidateStationName;
import com.sihle.elections2.services.crud.DataValCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sihle
 */
public class StationValTestCrudservice {
    
    public StationValTestCrudservice() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    DataValCrudservice crudService;
    @BeforeMethod
    
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DataValCrudservice.class);
    }
    @Test
    public void testCreate() throws Exception {
        ValidateStationName q1 = new ValidateStationName.InnerValStation(true).id("2").avail();
        ValidateStationName returnQuestion = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        ValidateStationName q1 = new ValidateStationName.InnerValStation(true).id("2").avail();
        ValidateStationName returnQuestion = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        ValidateStationName q1 = new ValidateStationName.InnerValStation(true).id("2").avail();
        ValidateStationName returnQuestion = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        ValidateStationName q1 = new ValidateStationName.InnerValStation(true).id("2").avail();
        ValidateStationName returnQuestion = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(q1);

    }
}
