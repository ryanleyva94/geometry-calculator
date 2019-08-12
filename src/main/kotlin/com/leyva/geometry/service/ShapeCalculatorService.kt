package com.leyva.geometry.service

import com.leyva.geometry.model.RectangularPrism

open class ShapeCalculatorService{

    fun calculateRectangularVolume(rectangularPrism: RectangularPrism): Double{
        return Math.round(rectangularPrism.width * rectangularPrism.height * rectangularPrism.depth * 1000.0)/1000.0
    }

    fun calculateRectangularServiceArea(rectangularPrism: RectangularPrism): Double{
        var faceOne = 2 * rectangularPrism.width * rectangularPrism.height
        var faceTwo = 2 * rectangularPrism.width * rectangularPrism.depth
        var faceThree = 2 * rectangularPrism.depth * rectangularPrism.height

        return Math.round((faceOne + faceTwo + faceThree) * 1000.0)/1000.0
    }


}