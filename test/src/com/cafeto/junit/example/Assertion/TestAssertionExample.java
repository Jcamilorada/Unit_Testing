package com.cafeto.junit.example.Assertion;

import static org.junit.Assert.*;

import com.cafeto.junit.common.ITournament;
import com.cafeto.junit.common.TournamentFactory;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by jolaya on 2/20/2015.
 */
public class TestAssertionExample {

    AssertionExample assertionExample = new AssertionExample();
    TournamentFactory tournamentFactory = new TournamentFactory();

    @Test
    public void testGetWinnerOfTournament(){
        assertEquals(assertionExample.getWinnerOfTournament("nfl").toLowerCase(), "patriots");
    }

    @Test
    public void testGetScoreOfWinner(){
        assertEquals(assertionExample.getScoreOfWinner("nfl"), 28);
    }

    @Test
    public void testGetTournament(){
        assertEquals(assertionExample.getTournament("nba"), tournamentFactory.getTournament("nba").get());
    }

    @Test
    public void testGetTournamentOfGivenSport(){
        String[] listOfTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
        ITournament[] basketballTournament = {tournamentFactory.getTournament("asbl").get(), tournamentFactory.getTournament("nba").get()};

        assertArrayEquals(assertionExample.getTournamentOfGivenSport(listOfTournaments, "basketball"), basketballTournament);

    }

}
