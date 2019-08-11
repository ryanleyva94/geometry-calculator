package com.leyva.geometry.controller;

import com.leyva.geometry.service.ShapeCalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @MockBean
    private ShapeCalculatorService shapeCalculatorService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testController() throws Exception {
        final ResultActions result = mockMvc.perform( MockMvcRequestBuilders
                .get("/shape/cube?width=10")
                .accept(MediaType.APPLICATION_JSON));


    }
}
