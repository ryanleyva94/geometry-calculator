package com.leyva.geometry.controller

import com.leyva.geometry.model.RectangularPrism
import com.leyva.geometry.model.Shapes
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
    fun calculateVolumeAndSurfaceAreaOfRectangle(@RequestParam(value = "width") width: Double, @RequestParam(value = "height") height: Double, @RequestParam(value = "depth") depth: Double) : RectangularPrism{
        val rectangularPrism = RectangularPrism(Shapes.RECTANGULAR_PRISM.shapeName, width, height, depth)
        rectangularPrism.volume = shapeCalculatorService.calculateRectangularVolume(rectangularPrism)
        rectangularPrism.surfaceArea = shapeCalculatorService.calculateRectangularServiceArea(rectangularPrism)

        return rectangularPrism
    }

    @GetMapping("/cube")
    fun calculateVolumeAndSurfaceAreaOfACube(@RequestParam(value = "width") dimension: Double) : RectangularPrism {
        val cube = RectangularPrism(Shapes.CUBE.shapeName, dimension, dimension, dimension)
        cube.volume = shapeCalculatorService.calculateRectangularVolume(cube)
        cube.surfaceArea = shapeCalculatorService.calculateRectangularServiceArea(cube)

        return cube
    }


}