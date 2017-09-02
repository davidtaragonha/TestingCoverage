package com.alonso.modulos;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class PruebaTest {
    @Mock
    Prueba pruebaTest;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Prueba_1() throws Exception {
        assertEquals(1,1);
    }

    @Test
    public void Prueba_2() throws Exception {
        assertEquals(2,2);
    }

    @Test
    public void Prueba_3() throws Exception {
        assertNotEquals("message", 2,1);
    }

    @Test
    public void Prueba_4() throws Exception {
        Prueba prueba = new Prueba();
        prueba.m1();
    }

    @Test
    public void Prueba_5() throws Exception {
        Prueba prueba = new Prueba();
        prueba.m2(false);
    }

}