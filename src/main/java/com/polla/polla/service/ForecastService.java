package com.polla.polla.service;

import com.polla.polla.model.Forecast;

import java.util.List;

public interface ForecastService {
    Forecast saveForecast(Forecast forecast);
    List<Forecast> allForecast();
}
