/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.sihle.elections2.model.Vote;
import com.sihle.elections2.services.crud.VoteCrudservice;
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
public class VoteTestCrudservice {
    
    public VoteTestCrudservice() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Mock
    VoteCrudservice crudService;
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VoteCrudservice.class);
    }

    @Test
    public void testCreate() throws Exception {
        Vote q1 = new Vote.InnerVote(1).id("9").vot();
        Vote returnQuestion = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Vote q1 = new Vote.InnerVote(1).id("9").vot();
        Vote returnQuestion = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Vote q1 = new Vote.InnerVote(1).id("9").vot();
        Vote returnQuestion = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Vote q1 = new Vote.InnerVote(1).id("9").vot();
        Vote returnQuestion = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(q1);

    }
}
