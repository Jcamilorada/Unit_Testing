package junit.common;

import junit.common.Teams.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class TeamFactory {

    private List<Team> teams = new ArrayList<Team>();
    private PlayerFactory playerFactory = new PlayerFactory();

    public TeamFactory(){
        teams.add(new CafetoTeam("Cafeto Team", "Soccer", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(0));
            add(playerFactory.getMalePlayers().get(1));
        }}));
        teams.add(new CafetoWomansTeam("Cafeto Woman's Team", "baseball", new ArrayList<Player>(){{
            add(playerFactory.getFemalePlayers().get(0));
            add(playerFactory.getFemalePlayers().get(2));
        }}));
        teams.add(new NewEngland("New England", "Football", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(1));
            add(playerFactory.getMalePlayers().get(2));
        }}));
        teams.add(new Packers("Packers", "Football", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(4));
            add(playerFactory.getMalePlayers().get(5));
        }}));
        teams.add(new ProsMen("Pros Men Team", "Soccer", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(5));
            add(playerFactory.getMalePlayers().get(6));
        }}));
        teams.add(new ProsWomen("Pros Women Team", "baseball", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(1));
            add(playerFactory.getMalePlayers().get(3));
        }}));
        teams.add(new Tapitas("Tapitas F.C.", "Soccer", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(2));
            add(playerFactory.getMalePlayers().get(3));
        }}));
        teams.add(new Yankees("N.Y. Yankees", "baseball", new ArrayList<Player>(){{
            add(playerFactory.getMalePlayers().get(0));
            add(playerFactory.getMalePlayers().get(3));
        }}));
    }

    public List<Team> getTeams(){
        return teams;
    }
}
