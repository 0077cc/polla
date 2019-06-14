package com.polla.polla.service;

import com.polla.polla.model.Match;

import java.util.List;

public interface MatchService {
    List<Match> matches();
    Match saveMatch(Match match);
}
