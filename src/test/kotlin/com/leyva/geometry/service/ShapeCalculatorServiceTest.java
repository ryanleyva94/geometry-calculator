package com.leyva.geometry.service;

import com.leyva.geometry.model.RectangularPrism;
import com.leyva.geometry.model.Shapes;
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
    public void testCalculateRectangularVolume(){
        RectangularPrism rectangularPrism = new RectangularPrism(Shapes.RECTANGULAR_PRISM.getShapeName(), 2, 3, 4);

        double volume = shapeCalculatorService.calculateRectangularVolume(rectangularPrism);

        assertEquals(24, volume, 0.0);
    }

    @Test
    public void testCalculateRectangularSurfaceArea(){
        RectangularPrism rectangularPrism = new RectangularPrism(Shapes.RECTANGULAR_PRISM.getShapeName(),2, 3, 4);

        double surfaceArea = shapeCalculatorService.calculateRectangularServiceArea(rectangularPrism);

        assertEquals(52, surfaceArea, 0.0);
    }

}
