package com.polla.polla.controller;

import com.polla.polla.model.Forecast;
import com.polla.polla.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/forecasts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ForecastController {

    private final ForecastService forecastService;

    @Autowired
    public ForecastController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping
    public List<Forecast> forecasts(){
        return forecastService.allForecast();
    }

    @PostMapping
    public Forecast saveForecast(@RequestBody Forecast forecast){
        forecast.setId(UUID.randomUUID());
        return forecastService.saveForecast(forecast);
    }
}
