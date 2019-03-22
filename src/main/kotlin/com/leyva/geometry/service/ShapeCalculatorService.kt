package com.leyva.geometry.service

import com.leyva.geometry.model.RectangularPrism

class ShapeCalculatorService{

    fun calculateVolume(rectangularPrism: RectangularPrism): Double{
        return rectangularPrism.width * rectangularPrism.height * rectangularPrism.depth
    }
}