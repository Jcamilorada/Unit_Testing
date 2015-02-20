package junit.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class NBA implements Tournament{

    private String sport_, name_;
    private int quantityOfStaff_, year_;
    private List<String> teams_, finalMatch_;
    private List<Integer> scoreBoard_;

    private static NBA instance;

    private NBA() {
        sport_ = "basketball";
        name_ = "National Basketball Association";
        quantityOfStaff_ = 444;
        year_ = 2010;
        teams_ = new ArrayList<String>(){{add("Heats"); add("Spurs"); add("Bulls"); add("Wizards");}};
        finalMatch_ = new ArrayList<String>(){{add("Heats"); add("Spurs");}};
        scoreBoard_ = new ArrayList<Integer>(){{add(120); add(119);}};
    }

    @Override
    public String getSport() {
        return sport_;
    }

    @Override
    public String getName() {
        return name_;
    }

    @Override
    public List<String> getTeams() {
        return teams_;
    }

    @Override
    public int getQuantityOfStaff() {
        return quantityOfStaff_;
    }

    @Override
    public List<String> getFinalMatch() {
        return finalMatch_;
    }

    @Override
    public List<Integer> getScoreBoard() {
        return scoreBoard_;
    }

    @Override
    public int getYear() {
        return year_;
    }

    public static NBA getInstance (){
        if(instance == null){
            instance = new NBA();
        }
        return instance;
    }
}
