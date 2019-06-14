package com.polla.polla.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Document("match")
public class Match {
    @Id
    private UUID id;
    private String group;
    private String match;
    private String phase;
    private String date;
    private List<String> teams = new ArrayList<>();
    private List<Integer> score = new ArrayList<>();
}
