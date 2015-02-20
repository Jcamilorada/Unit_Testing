package examples.Assertions;

import static org.junit.Assert.*;

import junit.common.Player;
import junit.common.Players.Carolina;
import junit.common.Players.Maria;
import junit.examples.AssertionExerciseProblem;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by jolaya on 2/19/2015.
 */
public class JUnitAssertionExamples {

    AssertionExerciseProblem assertionExerciseProblem = new AssertionExerciseProblem();
    Player[] expectedArrayOfPlayers;
    int[] expectedIntegerArray;
    String myName = "Manuel";
    String[] expectedArrayOfStrings = {"Hello", "World", "my", "name", "is", myName};

    @Before
    public void setUp(){
        //Expected Array Of Players
        expectedArrayOfPlayers = new Player[2];
        expectedArrayOfPlayers [0] = new Carolina("Carolina", 28, new ArrayList<String>() {{
            add("soccer");
        }});
        expectedArrayOfPlayers [1] = new Maria("Maria", 18, new ArrayList(){{
            add("baseball");
        }});

        //Expected array of Integers
        expectedIntegerArray = new int[5];
        expectedIntegerArray[0] = 2;
        expectedIntegerArray[1] = 7;
        expectedIntegerArray[2] = 27;
        expectedIntegerArray[3] = 87;
        expectedIntegerArray[4] = 102;
    }


    /*@Test
    public void testPlayerNameChange(){
        assertArrayEquals(assertionExerciseProblem.changePlayerForMaria("Karol"), expectedArrayOfPlayers);
    }*/

    @Test
    public void testDetermineNumbersWithResidueOfTwo(){
        assertArrayEquals(assertionExerciseProblem.determineNumbersWithResidueOfTwo(), expectedIntegerArray);
    }

    @Test
    public void testAddYourName(){
        assertArrayEquals(assertionExerciseProblem.addYourName(myName), expectedArrayOfStrings);
    }

    /*@Test
    public void testGetPlayerName(){
        assertEquals(assertionExerciseProblem.getPlayerByName("Carolina"), expectedArrayOfPlayers[0]);
    }*/

    @Test
    public void testAgeByName(){
        assertEquals(assertionExerciseProblem.getAgeByName("Carolina"), 28);
    }
}
