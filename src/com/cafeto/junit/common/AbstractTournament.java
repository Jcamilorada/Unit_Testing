package com.cafeto.junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/23/2015.
 */
public abstract class AbstractTournament implements ITournament {

    protected String sport, name;
    protected int quantityOfStaff, year;
    protected List<String> teams, finalMatch;
    protected List<Integer> scoreBoard;
    
    @Override
    public String getSport() {
        return sport;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantityOfStaff() {
        return quantityOfStaff;
    }

    @Override
    public List<String> getTeams() {
        return teams;
    }

    @Override
    public List<String> getFinalMatch() {
        return finalMatch;
    }

    @Override
    public List<Integer> getScoreBoard() {
        return scoreBoard;
    }

    @Override
    public int getYear() {
        return year;
    }
}
