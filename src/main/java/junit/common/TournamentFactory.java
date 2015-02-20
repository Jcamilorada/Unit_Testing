package junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class TournamentFactory {
    
    public Tournament getTournament(String tournament){
        
        Tournament createdTournament = new Tournament() {
            @Override
            public String getSport() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getQuantityOfStaff() {
                return 0;
            }

            @Override
            public List<String> getTeams() {
                return null;
            }

            @Override
            public List<String> getFinalMatch() {
                return null;
            }

            @Override
            public List<Integer> getScoreBoard() {
                return null;
            }

            @Override
            public int getYear() {
                return 0;
            }
        };
        
        switch (tournament.toLowerCase()){
            case "afl": 
                createdTournament = AFL.getInstance();
                break;
            case "asbl":
                createdTournament = ASBL.getInstance();
                break;
            case "fifafwc":
                createdTournament = FIFAFWC.getInstance();
                break;
            case "fifawc":
                createdTournament = FIFAWC.getInstance();
                break;
            case "nba":
                createdTournament = NBA.getInstance();
                break;
            case "nfl":
                createdTournament = NFL.getInstance();
                break;
            default:
                System.out.println();
        }
        
        return createdTournament;
    }
}
