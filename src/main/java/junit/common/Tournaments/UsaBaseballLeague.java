package junit.common.Tournaments;

import junit.common.Team;
import junit.common.Tournament;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class UsaBaseballLeague implements Tournament {
    private String type_, name_;
    private int quantityOfStaff_, year_;
    private List<Team> teams_;
    private List<String> equipmentList_, leaderboard_;
    private List<Integer> listOfQuantities_;

    public UsaBaseballLeague(String type, String name, int quantityOfStaff, int year, List<Team> teams, List<String> equipmentList, List<String> leaderboard, List<Integer> listOfQuantities) {
        type_ = type;
        name_ = name;
        quantityOfStaff_ = quantityOfStaff;
        year_ = year;
        teams_ = teams;
        equipmentList_ = equipmentList;
        leaderboard_ = leaderboard;
        listOfQuantities_ = listOfQuantities;
    }

    @Override
    public String getType() {
        return type_;
    }

    @Override
    public void setType(String type) {
        type_ = type;
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
    public List<Team> getTeams() {
        return teams_;
    }

    @Override
    public void setTeams(List<Team> teams) {
        teams_ = teams;
    }

    @Override
    public int getQuantityOfStaff() {
        return quantityOfStaff_;
    }

    @Override
    public void setQuantityOfStaff(int quantityOfStaff) {
        quantityOfStaff_ = quantityOfStaff;
    }

    @Override
    public List<String> getEquipment() {
        return equipmentList_;
    }

    @Override
    public void setEquipment(List<String> equipment) {
        equipmentList_ = equipment;
    }

    @Override
    public List<Integer> getQuantityOfEquipment() {
        return listOfQuantities_;
    }

    @Override
    public void setQuantityOfEquipment(List<Integer> listOfQuantities) {
        listOfQuantities_ = listOfQuantities;
    }

    @Override
    public List<String> getLeaderBoard() {
        return leaderboard_;
    }

    @Override
    public void setLeaderBoard(List<String> leaderBoard) {
        leaderboard_ = leaderBoard;
    }

    @Override
    public int getYear() {
        return year_;
    }

    @Override
    public void setYear(int year) {
        year_ = year;
    }
}
