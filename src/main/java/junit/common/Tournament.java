package junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */

//Factory interface Tournament. Tournaments are all "done" at the moment of creation.
public interface Tournament{


    //Getter and Setter for the type sport played in the tournament. Their can only be 3 tournament types. Data type is String.
    public String getSport();
    /*public void setSport(String sport);*/

    //Getter and Setter for name of tournament. Data type is a String.
    public String getName();
    /*public void setName(String name);*/

    //Getter and Setter for the amount of staff that was present in the tournament. Data type is an integer.
    public int getQuantityOfStaff();
    /*public void setQuantityOfStaff(int quantityOfStaff);*/

    //Getter and Setter for List of Teams. Each tournament has the names of the teams that participated in the tournament. Data type is a List of Strings.
    public List<String> getTeams();
    /*public void setTeams(List<String> teams);*/

    //Getter and Setter for Final Match at the end of the tournament. Data type is a List of String. Each String is the name of the team.
    public List<String> getFinalMatch();
    /*public void setFinalMatch(List<String> finalMatch);*/

    //Getter and Setter for Scoreboard at the end of the tournament. Data type is a List of String. Eash String is the name of the team.
    public List<Integer> getScoreBoard();
    /*public void setScoreBoard(List<Integer> scoreBoard);*/

    //Getter and Setter for the year of realization of the event. Data type is integer.
    public int getYear();
    /*public void setYear(int year);*/
}
