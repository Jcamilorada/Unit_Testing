package com.cafeto.junit.example.Assertion;

import static org.junit.Assert.*;
import com.cafeto.junit.common.ITournament;
import com.cafeto.junit.common.TournamentFactory;
import org.junit.Test;

/**
 * Created by jolaya on 2/20/2015.
 */
public class TestSimpleInformationRetriever {

    SimpleInformationRetriever simpleInformationRetriever = new SimpleInformationRetriever();
    TournamentFactory tournamentFactory = new TournamentFactory();

    /**
     * Tests the method getWinnerOfTournament from the AssertionExample class. It checks the correct functionality of the method*
     * by proving the the winner of the nfl tournament was the team patriots.*
     */

    @Test
    public void testGetWinnerOfTournament(){
        assertEquals(simpleInformationRetriever.getWinnerOfTournament("nfl").toLowerCase(), "patriots");
    }

    /**
     * Tests the method getScoreOfWinner from the AssertionExample class. It checks the correct functionality of the method *
     * by proving the the winner of the nfl tournament scored 28 points.*
     */

    @Test
    public void testGetScoreOfWinner()
    {
        assertEquals(simpleInformationRetriever.getScoreOfWinner("nfl"), 28);
    }

    /**
     * Tests the method getTournament from the AssertionExample class. It checks the correct functionality of the method by proving *
     * that the retrieved value is the same as the one generated in the tournamentFactory.*
     */

    @Test
    public void testGetTournament()
    {
        assertEquals(simpleInformationRetriever.getTournament("nba"), tournamentFactory.getTournament("nba").get());
    }

    /**
     * Tests the method getTournamentOfGivenSport from the AssertionExample class. It checks the correct functionality of the method by proving *
     * that the retrieved elements correspond to the tournaments that practice the sport basketball.*
     */

    @Test
    public void testGetTournamentOfGivenSport()
    {
        String[] listOfTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
        ITournament[] basketballTournament = {tournamentFactory.getTournament("asbl").get(), tournamentFactory.getTournament("nba").get()};

        assertArrayEquals(simpleInformationRetriever.getTournamentOfGivenSport(listOfTournaments, "basketball"), basketballTournament);

    }

    /**
     * Tests the method sumAmountOfStaffUsedInSystem from the AssertionExample class. It checks the correct functionality of the method by proving *
     * that the retrieved value corresponds to summed amount of all the staff members for each tournament.*
     */
    
    @Test
    public void testSumAmountOfStaffUsedInSystem()
    {
        String[] listOfTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
        assertEquals(simpleInformationRetriever.sumAmountOfStaffUsedInSystem(listOfTournaments), 4550);
        
    }

    /**
     * This test validates that the outcome of a function should be not null. If it happens to be null than it throws *
     * a NullPointerException*
     */

    @Test(expected = NullPointerException.class)
    public void testSumAmountOfStaffUsedInSystemForException()
    {
        System.out.println("Should through IllegalArgumentException");
        simpleInformationRetriever.sumAmountOfStaffUsedInSystem(null);

    }

}
