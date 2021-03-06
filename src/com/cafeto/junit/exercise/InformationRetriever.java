package com.cafeto.junit.exercise;

import com.cafeto.junit.common.ITournament;
import com.cafeto.junit.common.TournamentFactory;
import com.google.common.base.Preconditions;

import java.util.*;

/**
 * Created by jolaya on 2/24/2015.
 */
public class InformationRetriever
{
    TournamentFactory tournamentFactory = new TournamentFactory();
    String[] allTournaments = {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"};
    String[] currentRegisteredSports = {"football", "soccer", "basketball"};
    /**
     *Seeks to answer who, for a given tournament, has already won the competition.*
     * *  
     * @param tournament a string value for a tournament. The expected values are afl/asbl/fifafwc/fifawc/nba/nfl.
     * *                   
     * @return returns a string value of the winner of the given tournament.
     */
    public String getWinnerOfTournament(String tournament)
    {
        Preconditions.checkArgument(!tournament.isEmpty());
        Optional<ITournament> optionalTournament = tournamentFactory.getTournament(tournament);
        Preconditions.checkArgument(optionalTournament.isPresent());
        
        ITournament aTournament;
        String winner;

        aTournament = optionalTournament.get();
        
        if(aTournament.getScoreBoard().get(0) > aTournament.getScoreBoard().get(1))
        {
            winner = aTournament.getFinalMatch().get(0).toLowerCase();
        }
        else
        {
            winner = aTournament.getFinalMatch().get(1).toLowerCase();
        }

        return winner;
    }

    /**
     * This method intends to check which are the winners of the tournaments that practice a specific sport.*
     * * 
     * @param sport string parameter that defines which what winners we desire to retrieve.
     * *              
     * @return an array of string containing the winners of the tournaments that practice the given sport.
     */
    
    public String[] getWinnersBySport(String sport)
    {
        Preconditions.checkArgument(!sport.isEmpty());
        List<String> listOfWinners = new ArrayList(2);
        for(String tournament: allTournaments){
            ITournament aTournament = tournamentFactory.getTournament(tournament).get();
            
            if(sport.equals(aTournament.getSport()))
            {
                listOfWinners.add(getWinnerOfTournament(tournament));
            }
        }
        return listToStringArray(listOfWinners);
    }

    /**
     * This method checks which were the winners of all the registered Tournaments. Each sport has a separated array of winners.*
     * * 
     * @return an array of arrays that contains the winners of one of the sports registered.
     */
    public String[][] getWinnersOfSystem()
    {
        List<String[]> winnerList = new ArrayList(3);
        
        for(String sport: currentRegisteredSports)
        {
            winnerList.add(getWinnersBySport(sport));
        }
        return listToArrayOfArrays(winnerList);
    }

    /**
     * Utility method to convert a List of string to an array of strings.*
     * * 
     * @param stringList a list of Strings.
     * *                   
     * @return an array of Strings. Same values that were given in stringList.
     */
    public String[] listToStringArray(List<String> stringList)
    {
        Preconditions.checkArgument(!stringList.isEmpty());
        String[] answer = new String[stringList.size()];
        
        int counter = 0;
        for(String element: stringList)
        {
            answer[counter] = element;
            counter++;
        }
        return answer;
    }

    /**
     * Utility method to convert a List of string arrays to an array of strings arrays.*
     * * 
     * @param listOfStringArray a list of String arrays.
     * *                          
     * @return an array of String arrays. Same values that were given in listOfStringArray.
     */

    public String[][] listToArrayOfArrays(List<String[]> listOfStringArray)
    {
        Preconditions.checkArgument(!listOfStringArray.isEmpty());
        String[][] answer = new String[listOfStringArray.size()][];

        int counter = 0;
        for(String[] element: listOfStringArray)
        {
            answer[counter] = element;
            counter++;
        }
        return answer;
    }

    /**
     * Utility method to convert a Set of strings to an array of strings.*
     * * 
     * @param stringSet a set containing strings.
     * *                  
     * @return an array of Strings. Same values that were given in stringSet.
     */
    
    public String[] setToStringArray(Set<String> stringSet)
    {
        Preconditions.checkArgument(!stringSet.isEmpty());
        String[] answer = new String[stringSet.size()];

        int counter = 0;
        for(String element: stringSet)
        {
            answer[counter] = element;
            counter++;
        }
        return answer;
        
    }

    /**
     * Method that extracts the sports in the system without repetitions.*
     * * 
     * @return array of sports in system without repetition
     */

    public String[] getArrayOfSports()
    {
        Set<String> setOfSports = new HashSet(3);
        for (String  tournament: allTournaments)
        {
            setOfSports.add(tournamentFactory.getTournament(tournament).get().getSport());
        }
        return setToStringArray(setOfSports);
    }

    /**
     * This method checks if the teams on the final match were registered in the teams of the competition for a particular *
     * tournament.*
     * * 
     * @param tournament string tournament to process the verification.
     * *
     * @return boolean answer that indicates if the teams in the final match are registered or not.
     */
    
    public boolean checkForRegisteredTeamsInFinalsForTournament(String tournament)
    {
        Preconditions.checkArgument(!tournament.isEmpty());
        ITournament aTournament = tournamentFactory.getTournament(tournament).get();
        boolean validated = false;
        
        if (aTournament.getTeams().contains(aTournament.getFinalMatch().get(0)))
        {
            if (aTournament.getTeams().contains(aTournament.getFinalMatch().get(1)))
            {
                validated = true;
            }
        }
        
        return validated;
    }
}
