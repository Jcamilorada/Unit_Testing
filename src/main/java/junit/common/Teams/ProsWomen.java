package junit.common.Teams;

import junit.common.Player;
import junit.common.Team;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class ProsWomen implements Team {

    private String name_, teamSport_;
    private List<Player> listOfPlayers_;

    public ProsWomen(String name, String teamSport, List<Player> listOfPlayers) {
        name_ = name;
        teamSport_ = teamSport;
        listOfPlayers_ = listOfPlayers;
    }

    @Override
    public String getName() {
        return name_;
    }

    @Override
    public void setName(String name) {
        name_ = name;
    }

    @Override
    public List<Player> getListOfPLayers() {
        return listOfPlayers_;
    }

    @Override
    public void setListOfPlayers(List<Player> listOfPlayers) {
        listOfPlayers_ = listOfPlayers;
    }

    @Override
    public String getTeamSport() {
        return teamSport_;
    }

    @Override
    public void setTeamSport(String teamSport) {
        teamSport_ = teamSport;
    }
}
