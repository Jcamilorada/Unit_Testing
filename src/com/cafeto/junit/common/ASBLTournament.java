package com.cafeto.junit.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class ASBLTournament extends AbstractTournament {

    /*String sport, name;
    int quantityOfStaff, year;
    List<String> teams, finalMatch;
    List<Integer> scoreBoard;*/

    ASBLTournament() {
        sport = "basketball";
        name = "All Star Basketball League";
        quantityOfStaff = 756;
        year = 1998;
        teams = Arrays.asList("West", "East");
        finalMatch = Arrays.asList("West", "East");
        scoreBoard = Arrays.asList(154, 119);
    }
}
