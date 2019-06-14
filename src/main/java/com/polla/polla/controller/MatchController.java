package com.polla.polla.controller;

import com.polla.polla.model.Match;
import com.polla.polla.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("matches")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MatchController {

    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<Match> matches(){
        return matchService.matches();
    }

    @PostMapping
    public Match saveMatch(@RequestBody Match match){
        match.setId(UUID.randomUUID());
        return matchService.saveMatch(match);
    }

    @PostMapping("/all")
    public String saveAllMatch(@RequestBody List<Match> matches){
        matches.forEach(m -> {
            m.setId(UUID.randomUUID());
            matchService.saveMatch(m);
        });

        return "XD";
    }
}
