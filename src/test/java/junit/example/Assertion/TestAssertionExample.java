package junit.example.Assertion;

import static org.junit.Assert.*;

import junit.common.Tournament;
import org.junit.Test;

import junit.common.NBA;
import junit.common.ASBL;
import junit.common.TournamentFactory;

/**
 * Created by jolaya on 2/20/2015.
 */
public class TestAssertionExample {
    
    AssertionExample assertionExample = new AssertionExample();
    
    //Lets begin with a simple question where we have an expected result. We can assure the patriots won the nfl tournament.
    //Thus we expect that the result of getWinnerOfTournament, if we insert nfl as the tournament, be the string patriots.
    @Test
    public void testGetWinnerOfTournament(){
        assertEquals(assertionExample.getWinnerOfTournament("nfl").toLowerCase(), "patriots");
    }
    
    //This example helps to see how the function assertEquals works for other types of data, in this case Integer.
    //In our NFL tournament example we can assure that the patriots won with 28 points. Thus we expect to function getScoreOfWinner
    //to be 28. now let's test it.
    @Test
    public void testGetScoreOfWinner(){
        assertEquals(assertionExample.getScoreOfWinner("nfl"), 28);
    }
    
    //Assert also supports the revision of objects. Lets try using the getTournament function a see how it retrieves the same object.
    @Test
    public void testGetTournament(){
        assertEquals(assertionExample.getTournament("nba"), NBA.getInstance());
    }
    
    //Another function of Assert from JUnit is assertArrayEquals which permits to comparison of arrays of Objects or primitive type (int, short, String, etc).
    //In the following example we want to compare to arrays containing Tournament Objects. We will use the function getTournamentOfGivenSport which return the tournaments,
    //that host a specific sport. We know before hand that the tournaments currently registered are {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"} and we know that
    //their are 3 available sports soccer, basketball and football. For basketball we expect to receive find an array with nba and asbl tournaments.
    @Test
    public void testGetTournamentOfGivenSport(){
        String[] listOfTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
        Tournament[] basketballTournament = {ASBL.getInstance(), NBA.getInstance()};
        
        assertArrayEquals(assertionExample.getTournamentOfGivenSport(listOfTournaments, "basketball"), basketballTournament);
        
    }
    
}
