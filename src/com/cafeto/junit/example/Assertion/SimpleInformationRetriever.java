package com.cafeto.junit.example.Assertion;

import com.cafeto.junit.common.ITournament;
import com.cafeto.junit.common.TournamentFactory;
import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class SimpleInformationRetriever
{
    
    TournamentFactory tournamentFactory = new TournamentFactory();

    /**
     * Seeks to answer who, for a given tournament, has already won the competition.*
     * * 
     * @param tournament a string value for a tournament. The expected values are afl/asbl/fifafwc/fifawc/nba/nfl.*
     * *             
     * @return returns a string value of the winner of the given tournament.*
     * * 
     */
    public String getWinnerOfTournament(String tournament)
    {
        Preconditions.checkArgument(!tournament.isEmpty());
        ITournament aTournament = tournamentFactory.getTournament(tournament).get();
        String winner;
                
        if(aTournament.getScoreBoard().get(0) > aTournament.getScoreBoard().get(1))
        {
            winner = aTournament.getFinalMatch().get(0);
        }
        else 
        {
            winner = aTournament.getFinalMatch().get(1);
        }
        
        return winner;
    }

    /**
     * Seeks to answer how much did the winner of a given tournament score.*
     * * 
     * @param tournament a string value for a tournament. The expected values are afl/asbl/fifafwc/fifawc/nba/nfl.
     * *                   
     * @return returns an integer referring the score obtained by the winner of the given tournament.
     */
    public int getScoreOfWinner(String tournament)
    {
        Preconditions.checkArgument(!tournament.isEmpty());
        ITournament aTournament = tournamentFactory.getTournament(tournament).get();
        int winnersScore, scoreOfTeam1, scoreOfTeam2;
        
        scoreOfTeam1 = aTournament.getScoreBoard().get(0);
        scoreOfTeam2 = aTournament.getScoreBoard().get(1);
        
        if(scoreOfTeam1 > scoreOfTeam2)
        {
            winnersScore = scoreOfTeam1;
        }
        else
        {
            winnersScore = scoreOfTeam2;
        }
        return winnersScore;
    }

    /**
     * Seek to retireve an object with all the information of the given tournament*
     * * 
     * @param tournament a string value for a tournament. The expected values are afl/asbl/fifafwc/fifawc/nba/nfl.
     * *                   
     * @return an Object ITournament with all the information of the tournament.
     */
    public ITournament getTournament(String tournament)
    {
        Preconditions.checkArgument(!tournament.isEmpty());
        ITournament aTournament = tournamentFactory.getTournament(tournament).get();
        
        return aTournament;
    }

    /**
     * The objective of this method is to retrieve an array containing all the tournaments that practice a specific sport. *
     * Thus an array with all the acronyms of the tournaments is required and also the sport which is the desired to be associated *
     * with.*
     * * 
     * @param arrayOfTournaments array of strings containing a full a diminutive of all the registered tournaments.
     * *                        
     * @param sport string value for a sport. The expected values are soccer/basketball/football.
     * *              
     * @return An array of ITournaments with all the tournaments that practice the given sport.
     */
    public ITournament[] getTournamentOfGivenSport(String[] arrayOfTournaments, String sport)
    {
        Preconditions.checkArgument(!arrayOfTournaments.equals(null));
        Preconditions.checkArgument(!sport.isEmpty());
        List<ITournament> listOfTournamentsOfSameSport = new ArrayList(2);
        ITournament[] arrayOfTournamentOfSameSport;
        
        for(String tournament: arrayOfTournaments)
        {
            ITournament currentTournament = tournamentFactory.getTournament(tournament).get();
            
            if(currentTournament.getSport().equals(sport))
            {
                listOfTournamentsOfSameSport.add(currentTournament);
            }
        }
        
        arrayOfTournamentOfSameSport = new ITournament[listOfTournamentsOfSameSport.size()];
        
        int counter = 0;
        for(ITournament tournament: listOfTournamentsOfSameSport)
        {
            arrayOfTournamentOfSameSport[counter] = tournament;
            counter++;
        }
        return arrayOfTournamentOfSameSport;
    }

    /**
     * Calculates the sum of the quantities of staff of each tournament to find what is the total amount in the whole system. *
     * * 
     * @param arrayOfTournaments array of strings containing a full a diminutive of all the registered tournaments
     * *
     * @return sum of the quantity of staff from each registered tournament.
     */
    
    public int sumAmountOfStaffUsedInSystem(String[] arrayOfTournaments)
    {
        Preconditions.checkArgument(!arrayOfTournaments.equals(null));
        int sumOfStaff = 0;
        for(String tournament: arrayOfTournaments)
        {
            sumOfStaff += tournamentFactory.getTournament(tournament).get().getQuantityOfStaff();
        }
        
        return sumOfStaff;
    } 
}
