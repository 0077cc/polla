package com.polla.polla.service.impl;

import com.polla.polla.model.Match;
import com.polla.polla.repository.MatchRepository;
import com.polla.polla.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public List<Match> matches() {
        return matchRepository.findAll();
    }

    @Override
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }
}
