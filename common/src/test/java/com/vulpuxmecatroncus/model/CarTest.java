package com.vulpuxmecatroncus.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testConstructor() {
        Car car = new Car();
        car.setColor("red");
        car.setModel("Toyota");
        assertEquals("red", car.getColor());
        assertEquals("Toyota", car.getModel());
    }
    
    @Test
    void testParameterizedConstructor() {
        Car car = new Car("Honda","blue");
        assertEquals("blue", car.getColor());
        assertEquals("Honda", car.getModel());
    }
}