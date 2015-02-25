package com.cafeto.junit.common;

import java.util.Arrays;

/**
 * Created by jolaya on 2/20/2015.
 */
public class AFLTournament extends AbstractTournament {

    AFLTournament() {
        sport = "football";
        name = "Amateur Football League";
        quantityOfStaff = 150;
        year = 2014;
        teams = Arrays.asList("Cafeto FL", "Patriots B", "Sea hawks B", "Pros FL");
        finalMatch = Arrays.asList("Cafeto FL", "Pros FL");
        scoreBoard = Arrays.asList(27, 33);
    }
}
