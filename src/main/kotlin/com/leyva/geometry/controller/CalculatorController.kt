package com.leyva.geometry.controller

import com.leyva.geometry.model.RectangularPrism
import com.leyva.geometry.model.Shape
import com.leyva.geometry.model.ShapeNames
import com.leyva.geometry.service.ShapeCalculatorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/shape")
class CalculatorController(shapeCalculatorService: ShapeCalculatorService){

    var shapeCalculatorService = shapeCalculatorService

    @GetMapping("/rectangle")
    fun calculateVolumeAndSurfaceAreaOfRectangle(@RequestParam(value = "width") width: Double, @RequestParam(value = "height") height: Double, @RequestParam(value = "depth") depth: Double) : Shape {
        val rectangularPrism = RectangularPrism(width, height, depth)
        rectangularPrism.shapeName = ShapeNames.RECTANGULAR_PRISM.shapeName
        rectangularPrism.volume = shapeCalculatorService.calculateRectangularVolume(rectangularPrism)
        rectangularPrism.surfaceArea = shapeCalculatorService.calculateRectangularServiceArea(rectangularPrism)

        return rectangularPrism
    }

    @GetMapping("/cube")
    fun calculateVolumeAndSurfaceAreaOfACube(@RequestParam(value = "width") dimension: Double) : Shape {
        val cube = RectangularPrism(dimension, dimension, dimension)
        cube.shapeName = ShapeNames.CUBE.shapeName
        cube.volume = shapeCalculatorService.calculateRectangularVolume(cube)
        cube.surfaceArea = shapeCalculatorService.calculateRectangularServiceArea(cube)

        return cube
    }


}