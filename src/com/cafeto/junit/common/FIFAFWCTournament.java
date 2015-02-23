package com.cafeto.junit.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class FIFAFWCTournament extends AbstractTournament {
    /*String sport, name;
    int quantityOfStaff, year;
    List<String> teams, finalMatch;
    List<Integer> scoreBoard;*/

    FIFAFWCTournament() {
        sport = "soccer";
        name = "FIFA Female World Cup";
        quantityOfStaff = 1200;
        year = 2014;
        teams = Arrays.asList("Ivory Coast", "Brazil", "Colombia", "USA");
        finalMatch = Arrays.asList("USA", "Colombia");
        scoreBoard = Arrays.asList(0,2);
    }
}
