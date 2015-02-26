package com.cafeto.junit.common;

import java.util.Arrays;

/**
 * Created by jolaya on 2/20/2015.
 */
public class FIFAWCTournament extends AbstractTournament {
    
    FIFAWCTournament()
    {
        sport = "soccer";
        name = "FIFA World Cup";
        quantityOfStaff = 1200;
        year = 2014;
        teams = Arrays.asList("Germany", "Brazil", "Netherlands", "Argentina");
        finalMatch = Arrays.asList("Germany", "Argentina");
        scoreBoard = Arrays.asList(1,0);
    }
}
