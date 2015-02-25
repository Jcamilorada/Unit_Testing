package com.cafeto.junit.common;

import java.util.Arrays;

/**
 * Created by jolaya on 2/20/2015.
 */
public class NFLTournament extends AbstractTournament {

    NFLTournament() 
    {
        sport = "football";
        name = "National Football League";
        quantityOfStaff = 800;
        year = 2015;
        teams = Arrays.asList("Packers", "Patriots", "Sea hawks", "Broncos", "Steelers");
        finalMatch = Arrays.asList("Patriots", "Sea hawks");
        scoreBoard = Arrays.asList(28,22);
    }
}
