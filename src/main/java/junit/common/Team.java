package junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */

// Instance for the creation of each individual team.
public interface Team {

    //Getter and Setter for the name of the team. Data type is String.
    public String getName();
    public void setName(String name);

    //Getter and Setter for the list of players in the team. Data Type is a list of Player Objects.
    public List<Player> getListOfPLayers();
    public void setListOfPlayers(List<Player> listOfPlayers);

    //Getter and Setter for the sport the team participates in. Data type is a String that corresponds to the sport it participates in.
    public String getTeamSport();
    public void setTeamSport(String teamSport);

}
