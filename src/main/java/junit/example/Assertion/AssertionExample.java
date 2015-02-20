package junit.example.Assertion;

import junit.common.Tournament;
import junit.common.TournamentFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class AssertionExample {
    
    TournamentFactory tournamentFactory = new TournamentFactory();
    
    //Who won the tournament?
    public String getWinnerOfTournament(String tournament){
        Tournament aTournament = tournamentFactory.getTournament(tournament);
        String winner;
                
        if(aTournament.getScoreBoard().get(0) > aTournament.getScoreBoard().get(1)){
            winner = aTournament.getFinalMatch().get(0);
        }else {
            winner = aTournament.getFinalMatch().get(1);
        }
        
        return winner;
    }
    
    // How much did the winner score?
    public int getScoreOfWinner(String tournament){
        Tournament aTournament = tournamentFactory.getTournament(tournament);
        int winnersScore;
        
        if(aTournament.getScoreBoard().get(0) > aTournament.getScoreBoard().get(1)){
            winnersScore = aTournament.getScoreBoard().get(0);
        }else{
            winnersScore = aTournament.getScoreBoard().get(1);
        }
        return winnersScore;
    }
    
    //Which tournament is this?
    public Tournament getTournament(String tournament){
        Tournament aTournament = tournamentFactory.getTournament(tournament);
        
        return aTournament;
    }
    
    //Which tournaments belong to a given sport?
    public Tournament[] getTournamentOfGivenSport(String[] arrayOfTournaments, String sport){
        ArrayList<Tournament> listOfTournamentsOfSameSport = new ArrayList();
        Tournament[] arrayOfTournamentOfSameSport;
        
        for(String tournament: arrayOfTournaments){
            Tournament currentTournament = tournamentFactory.getTournament(tournament);
            
            if(currentTournament.getSport().equals(sport)){
                listOfTournamentsOfSameSport.add(currentTournament);
            }
        }
        
        arrayOfTournamentOfSameSport = new Tournament[listOfTournamentsOfSameSport.size()];
        
        int counter = 0;
        for(Tournament tournament: listOfTournamentsOfSameSport){
            arrayOfTournamentOfSameSport[counter] = tournament;
            counter++;
        }
        return arrayOfTournamentOfSameSport;
    }
}
