package com.leyva.geometry.controller

import com.leyva.geometry.model.RectangularPrism
import com.leyva.geometry.service.ShapeCalculatorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController(shapeCalculatorService: ShapeCalculatorService){

    var shapeCalculatorService = shapeCalculatorService

    @GetMapping("/rectangle")
    fun calculateVolumeAndSurfaceAreaOfRectangle(@RequestParam(value = "width") width: Double, @RequestParam(value = "height") height: Double, @RequestParam(value = "depth") depth: Double) : RectangularPrism{
        val rectangularPrism = RectangularPrism(width, height, depth)
        rectangularPrism.volume = shapeCalculatorService.calculateVolume(rectangularPrism)

        return rectangularPrism
    }


}