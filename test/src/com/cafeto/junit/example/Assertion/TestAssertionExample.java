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

    /**
     * Tests the method getWinnerOfTournament from the AssertionExample class. It checks the correct functionality of the method *
     * by proving the the winner of the nfl tournament was the team patriots.* 
     */

    @Test
    public void testGetWinnerOfTournament(){
        assertEquals(assertionExample.getWinnerOfTournament("nfl").toLowerCase(), "patriots");
    }

    /**
     * Tests the method getScoreOfWinner from the AssertionExample class. It checks the correct functionality of the method *
     * by proving the the winner of the nfl tournament scored 28 points. * 
     */

    @Test
    public void testGetScoreOfWinner(){
        assertEquals(assertionExample.getScoreOfWinner("nfl"), 28);
    }

    /**
     * Tests the method getTournament from the AssertionExample class. It checks the correct functionality of the method by proving *
     * that the retrieved value is the same as the one generated in the tournamentFactory* 
     */

    @Test
    public void testGetTournament(){
        assertEquals(assertionExample.getTournament("nba"), tournamentFactory.getTournament("nba").get());
    }

    /**
     * Tests the method getTournamentOfGivenSport from the AssertionExample class. It checks the correct functionality of the method by proving *
     * that the retrieved elements correspond to the tournaments that practice the sport basketball. *
     */

    @Test
    public void testGetTournamentOfGivenSport(){
        String[] listOfTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
        ITournament[] basketballTournament = {tournamentFactory.getTournament("asbl").get(), tournamentFactory.getTournament("nba").get()};

        assertArrayEquals(assertionExample.getTournamentOfGivenSport(listOfTournaments, "basketball"), basketballTournament);

    }

    /**
     * Tests the method sumAmountOfStaffUsedInSystem from the AssertionExample class. It checks the correct functionality of the method by proving *
     * that the retrieved value corresponds to summed amount of all the staff members for each tournament. *
     */
    
    @Test
    public void testSumAmountOfStaffUsedInSystem(){
        String[] listOfTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
        assertEquals(assertionExample.sumAmountOfStaffUsedInSystem(listOfTournaments), 4550);
        
    }

}
