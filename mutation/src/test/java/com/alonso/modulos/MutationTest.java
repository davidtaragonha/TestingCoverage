package com.alonso.modulos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MutationTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mutation_NumberMutationsFullMode(){
        Mutation mutation = new Mutation();
        assertEquals(10, mutation.getNumberOfMutations(true));
    }

    @Test
    public void mutation_NumberMutationsNotFulMode(){
        Mutation mutation = new Mutation();
        assertEquals(20, mutation.getNumberOfMutations(false));
    }

}