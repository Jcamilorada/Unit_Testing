package junit.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class NBATournament extends AbstractTournament {

    /*String sport, name;
    int quantityOfStaff, year;
    List<String> teams, finalMatch;
    List<Integer> scoreBoard;*/
    
    NBATournament() {
        sport = "basketball";
        name = "National Basketball Association";
        quantityOfStaff = 444;
        year = 2010;
        teams = Arrays.asList("Heats", "Spurs", "Bulls", "Wizards");
        finalMatch = Arrays.asList("Heats", "Spurs");
        scoreBoard = Arrays.asList(120,119);
    }
}
