package com.cafeto.junit.common;

import java.util.Optional;

/**
 * Created by jolaya on 2/20/2015.
 */

public class TournamentFactory {
    private static AFLTournament aflTournament;
    private static ASBLTournament asblTournament;
    private static FIFAFWCTournament fifafwcTournament;
    private static FIFAWCTournament fifawcTournament;
    private static NBATournament nbaTournament;
    private static NFLTournament nflTournament;
    
    static {
        aflTournament = new AFLTournament();
        asblTournament = new ASBLTournament();
        fifafwcTournament = new FIFAFWCTournament();
        fifawcTournament = new FIFAWCTournament();
        nbaTournament = new NBATournament();
        nflTournament = new NFLTournament();
    }

    /**
     * Factory method to retrieve the desired tournament to be created *
     * @param tournament a string value for a tournament. The expected values are afl/asbl/fifafwc/fifawc/nba/nfl.
     * @return Optional value is returned containing an instanced value of an ITournament or empty.
     */
    public Optional<ITournament> getTournament(String tournament){
        
        //ITournament createdTournament;
        Optional<ITournament> createdTournament = Optional.empty();
        
        switch (tournament.toLowerCase()){
            case "afl": 
                createdTournament = Optional.of(aflTournament);
                break;
            case "asbl":
                createdTournament = Optional.of(asblTournament);
                break;
            case "fifafwc":
                createdTournament = Optional.of(fifafwcTournament);
                break;
            case "fifawc":
                createdTournament = Optional.of(fifawcTournament);
                break;
            case "nba":
                createdTournament = Optional.of(nbaTournament);
                break;
            case "nfl":
                createdTournament = Optional.of(nflTournament);
                break;
            default:
                System.out.println();
        }
        
        return createdTournament;
    }
}
