package com.cafeto.junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 * Factory interface Tournament. Tournaments are all "done" at the moment of creation. * 
 */

//
public interface ITournament
{

    /**
     * Getter for the type sport played in the tournament. Their can only be 3 tournament types. Data type is String. *
     * * 
     * @return string sport
     */
    String getSport();

    /**
     * Getter for name of tournament. Data type is a String. *
     * *
     * @return stringName
     */
    String getName();

    /**
     * Getter for the amount of staff that was present in the tournament. Data type is an integer. *
     * * 
     * @return integer quantity of staff
     */
    int getQuantityOfStaff();

    /**
     * Getter for List of Teams. Each tournament has the names of the teams that participated in the tournament. Data type is a List of Strings. *
     * * 
     * @return List with strings that contains the teams per tournament.
     */
    List<String> getTeams();

    /**
     * Getter for Final Match at the end of the tournament. Data type is a List of String. Each String is the name of the team. *
     * * 
     * @return List of string containing 2 matches.
     */
    List<String> getFinalMatch();

    /**
     * Getter for Scoreboard at the end of the tournament. Data type is a List of String. Each String is the name of the team. *
     * * 
     * @return List of integers with the two last scored of each team that participated.
     */
    List<Integer> getScoreBoard();

    /**
     * Getter for the year of realization of the event. Data type is integer. *
     * *
     * @return integer year
     */
    int getYear();
}
