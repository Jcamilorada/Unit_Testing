package junit.common;

import junit.common.Tournaments.NationalFootballLeague;
import junit.common.Tournaments.SoccerWorldCup;
import junit.common.Tournaments.UsaBaseballLeague;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jolaya on 2/19/2015.
 */
public class TournamentFactory {

    private List<Tournament> tournaments = new ArrayList<Tournament>();
    private TeamFactory teamFactory = new TeamFactory();

    public TournamentFactory(){
        tournaments.add(new UsaBaseballLeague("baseball", "USA Baseball League", 20, 2008, new ArrayList<Team>(){{add(teamFactory.getTeams().get(1)); add(teamFactory.getTeams().get(5)); add(teamFactory.getTeams().get(7));}}, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Integer>()));
        tournaments.add(new SoccerWorldCup("soccer", "Soccer World Cup", 500, 1998, new ArrayList<Team>(){{add(teamFactory.getTeams().get(0)); add(teamFactory.getTeams().get(4)); add(teamFactory.getTeams().get(6));}}, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Integer>()));
        tournaments.add(new NationalFootballLeague("football", "National Football League", 400, 2015, new ArrayList<Team>(){{add(teamFactory.getTeams().get(2)); add(teamFactory.getTeams().get(3));}}, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Integer>()));
    }

    public List<Tournament> getTournaments(){
        return tournaments;
    }
}
