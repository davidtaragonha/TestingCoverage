package com.alonso.modulos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void car_isACar() throws Exception {
        Car car = new Car();
        assertEquals(car.isACar(), true);
    }

    @Test
    public void car_getDefaultSize() throws Exception {
        Car car = new Car();
        assertEquals(151, car.getDefaultSize());
    }

}