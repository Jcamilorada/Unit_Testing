package com.cafeto.junit.exercise;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Created by jolaya on 2/24/2015.
 */
public class TestJUnitExercise {
    static JUnitExercise jUnitExercise;
    long startTime, endTime, duration;

    /**
     * The method initialize is wrapped over the @BeforeClass annotation thus initialization of the class external packages are done here.*
     * Also a printed message to let the user know the test class has initialized.* 
     */
    
    @BeforeClass
    public static void initialize(){
        jUnitExercise = new JUnitExercise();
        System.out.println("JUnitExercise was initialized in @BeforeClass");
    }

    /**
     * The wrapUp method is wrapped over the @AfterClass annotation, since it has no resources to dispose of it simply * 
     * shows a message to let the user know the test class has ended* 
     */
    
    @AfterClass
    public static void wrapUp() {
        System.out.println("End of Test in @AfterClass");

    }

    /**
     * The setUp method is wrapped around a @Before annotation, thus it will execute at the beginning of each test case. *
     * The setUp class is in charge of calculating the start time of the test and display a message showing it.* 
     */
    
    @Before
    public void setUp(){
        //counter for time.
        startTime =  System.nanoTime();
        StringBuilder startTimeString = new StringBuilder();
        startTimeString.append("@Before - Test starts at: ");
        startTimeString.append(startTime);
        System.out.println(startTimeString.toString());
    }

    /**
     * The tearDown method is wrapped around a @After annotation, thus it will execute at the end of each test case.*
     * The tearDown function will calculate the time in which a test is finished and display a me message showing it.* 
     */
    
    @After
    public void tearDown(){
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        
        StringBuilder durationString = new StringBuilder();
        durationString.append("@After - Test duration was: ");
        durationString.append(duration);
        durationString.append(" ms");
        System.out.println(durationString.toString());
    }

    /**
     * Tests the method getWinnerOfTournament from the JUnitExercise class. It checks the correct functionality of the method *
     * by proving the the winner of the nfl tournament was the team patriots.* 
     */

    @Test
    public void testGetWinnerOfTournament(){
        assertEquals(jUnitExercise.getWinnerOfTournament("nfl").toLowerCase(), "patriots");
        System.out.println("Test for get winner of tournament.");
    }

    /**
     * Tests that the method getWinnerOfTournament from the JUnitExercise class should throw a nullPointerException if it finds no winner for a tournament *
     * Thus if a tournament mlb is introduced a NullPointerException is expected.*
     */

    @Test(expected = NullPointerException.class)
    public void testGetWinnerOfTournamentExpectNull(){
        System.out.print("Test for null get winner of tournament.");
        jUnitExercise.getWinnerOfTournament("mlb");
    }

    /**
     * Test the method getWinnerBySport from the JUnitExercise class should retrieve the correct array of values given a sport. *
     * Specifically this function will revise for the sport football expecting to get back the values for football winners *
     * {pros fl, patriots}.* 
     */
    
    @Test
    public void testGetWinnerBySportForFootball(){
        String[] footballWinners = {"pros fl", "patriots"};
        assertArrayEquals(jUnitExercise.getWinnersBySport("football"), footballWinners);
        System.out.println("Test for get winner by sport for football.");
    }

    /**
     * Test the method getWinnerBySport from the JUnitExercise class should retrieve the correct array of values given a sport. *
     * Specifically this function will revise for the sport soccer expecting to get back the values for soccer winners *
     * {"colombia", "germany"}.* 
     */

    @Test
    public void testGetWinnerBySportForSoccer(){
        String[] soccerWinners = {"colombia", "germany"};
        assertArrayEquals(jUnitExercise.getWinnersBySport("soccer"), soccerWinners);
        System.out.println("Test for get winner by sport for soccer.");
    }

    /**
     * Test the method getWinnerBySport from the JUnitExercise class should retrieve the correct array of values given a sport. *
     * Specifically this function will revise for the sport basketball expecting to get back the values for basketball winners *
     * {"west", "heats"}.* 
     */

    @Test
    public void testGetWinnerBySportForBasketball(){
        String[] basketballWinners = {"west", "heats"};
        assertArrayEquals(jUnitExercise.getWinnersBySport("basketball"), basketballWinners);
        System.out.println("Test for get winner by sport for basketball.");

    }

    /**
     * Test the method getWinnerOfSystem from the JUnitExercise class should retrieve the correct array of values. *
     * The expected result should be the an array of arrays with the values {pros fl, patriots}, {colombia, germany}, {west, heats}* 
     */
    
    @Test
    public void testGetWinnersOfSystem(){
        String[][] winnerOfSystem = {{"pros fl", "patriots"}, {"colombia", "germany"}, {"west", "heats"}};
        
        assertArrayEquals(jUnitExercise.getWinnersOfSystem(), winnerOfSystem);

        System.out.println("Test for get winners of system method.");
    }

    /**
     * Test the method getWinnerOfSystem from the JUnitExercise class should return an error when searched outside of its bounds. *
     * This is proven by trying to search for a fourth value in the expected array given that there are only three expected values. *
     */

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWinnersOfSystemExpectIndexOutOfBound(){
        System.out.println("Test for IndexOutOfBoundException get winners of system method.");
        
        String[][] winners;
        
        winners = jUnitExercise.getWinnersOfSystem();
        
        String error = winners[0][3];
    }

    /**
     * Test the method getArrayOfSports from the JUnitExercise class should retrieve the correct array of values. *
     * The expected result should be the an array of arrays with the values soccer, basketball, football. *
     */

    @Test
    public void testGetArrayOfSports(){
        String[] currentRegisteredSports = {"soccer", "basketball", "football"};
        assertArrayEquals(jUnitExercise.getArrayOfSports(), currentRegisteredSports);

        System.out.println("Test for get array of registered sports.");
    }
}
