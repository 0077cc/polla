package com.polla.polla.service.impl;

import com.polla.polla.model.Forecast;
import com.polla.polla.repository.ForecastRepository;
import com.polla.polla.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForecastServiceImpl implements ForecastService {

    private final ForecastRepository forecastRepository;

    @Autowired
    public ForecastServiceImpl(ForecastRepository forecastRepository) {
        this.forecastRepository = forecastRepository;
    }

    @Override
    public Forecast saveForecast(Forecast forecast) {
        return forecastRepository.save(forecast);
    }

    @Override
    public List<Forecast> allForecast() {
        return forecastRepository.findAll();
    }
}
