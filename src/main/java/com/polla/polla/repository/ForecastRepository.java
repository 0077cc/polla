package com.polla.polla.repository;

import com.polla.polla.model.Forecast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepository extends MongoRepository<Forecast, String> {
}
