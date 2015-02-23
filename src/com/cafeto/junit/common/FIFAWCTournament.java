package junit.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class FIFAWCTournament extends AbstractTournament {
    /*String sport, name;
    int quantityOfStaff, year;
    List<String> teams, finalMatch;
    List<Integer> scoreBoard;*/
    
    FIFAWCTournament() {
        sport = "soccer";
        name = "FIFA World Cup";
        quantityOfStaff = 1200;
        year = 2014;
        teams = Arrays.asList("Germany", "Brazil", "Netherlands", "Argentina");
        finalMatch = Arrays.asList("Germany", "Argentina");
        scoreBoard = Arrays.asList(1,0);
    }
}
