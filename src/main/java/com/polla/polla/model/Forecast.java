package com.polla.polla.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Document("forecast")
public class Forecast {
    @Id
    private UUID id;
    private Long user;
    @JsonProperty(value = "group_matches")
    private List<Integer> groupMatches = new ArrayList<>();
    @JsonProperty(value = "second_matches")
    private List<Integer> secondMatches = new ArrayList<>();
    private Integer points;
    private Boolean bet;
}
