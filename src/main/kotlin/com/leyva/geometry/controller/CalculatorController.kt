package com.leyva.geometry.controller

import com.leyva.geometry.model.RectangularPrism
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController{

    @GetMapping("/rectangle")
    fun calculateVolumeAndSurfaceAreaOfRectangle(@RequestParam(value = "width") width: Double, @RequestParam(value = "height") height: Double, @RequestParam(value = "depth") depth: Double) = RectangularPrism(width, height, depth)

}