package com.caa.spring.mongo.api.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.caa.spring.mongo.api.model.Match;

// Combine both repository interfaces into a single interface
public interface MatchRepository extends MongoRepository<Match, Long>{
    List<Match> findMatchByDivision(String division);
    List<Match> findMatchByMatchDateAndDivisionAndHomeTeamAndAwayTeam(String matchDate, String division, String homeTeam, String awayTeam);
    List<Match> findMatchByMatchSummaryID(long matchSummaryID);
    List<Match> findByPlayer1IDOrPlayer2ID(int player1ID, int player2ID);
	
}