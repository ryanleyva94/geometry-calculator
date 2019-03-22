package com.leyva.geometry.service;

import com.leyva.geometry.model.RectangularPrism;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeCalculatorServiceTest {

    private ShapeCalculatorService shapeCalculatorService;

    @Before
    public void setup(){
        shapeCalculatorService = new ShapeCalculatorService();
    }

    @Test
    public void testCalculateVolume(){
        RectangularPrism rectangularPrism = new RectangularPrism(2, 3, 4);

        double volume = shapeCalculatorService.calculateVolume(rectangularPrism);

        assertEquals(24, volume, 0.0);
    }

}
