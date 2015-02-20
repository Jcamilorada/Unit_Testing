package junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */

//Factory interface Tournament. Tournaments are all "done" at the moment of creation.
public interface Tournament{


    //Getter and Setter for the type of tournament. Their can only be 3 tournament types. Data type is String.
    public String getType();
    public void setType(String type);

    //Getter and Setter for name of tournament. Data type is a String.
    public String getName();
    public void setName(String name);

    //Getter and Setter for List of Teams. Each tournament has teams, each team has a name and Players. Data type is a Team Object.
    public List<Team> getTeams();
    public void setTeams(List<Team> teams);

    //Getter and Setter for the amount of staff that was present in the tournament. Data type is an integer.
    public int getQuantityOfStaff();
    public void setQuantityOfStaff(int quantityOfStaff);

    //Getter and Setter for the names of equipment. Data type is a List of String.
    public List<String> getEquipment();
    public void setEquipment(List<String> equipmentList);

    //Getter and Setter for the names of equipment. Data type is a List of String.
    public List<Integer> getQuantityOfEquipment();
    public void setQuantityOfEquipment(List<Integer> listOfQuantities);

    //Getter and Setter for Scoreboard at the end of the tournament. Data type is a List of String. Eash String is the name of the team.
    public List<String> getLeaderBoard();
    public void setLeaderBoard(List<String> leaderBoard);

    //Getter and Setter for the year of realization of the event. Data type is integer.
    public int getYear();
    public void setYear(int year);
}
