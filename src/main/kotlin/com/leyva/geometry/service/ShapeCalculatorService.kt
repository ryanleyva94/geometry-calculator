package com.leyva.geometry.service

import com.leyva.geometry.model.RectangularPrism

class ShapeCalculatorService{

    fun calculateRectangularVolume(rectangularPrism: RectangularPrism): Double{
        return rectangularPrism.width * rectangularPrism.height * rectangularPrism.depth
    }

    fun calculateRectangularServiceArea(rectangularPrism: RectangularPrism): Double{
        var faceOne = 2 * rectangularPrism.width * rectangularPrism.height
        var faceTwo = 2 * rectangularPrism.width * rectangularPrism.depth
        var faceThree = 2 * rectangularPrism.depth * rectangularPrism.height

        return faceOne + faceTwo + faceThree
    }


}