package junit.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class AFL implements Tournament{

    private String sport_, name_;
    private int quantityOfStaff_, year_;
    private List<String> teams_, finalMatch_;
    private List<Integer> scoreBoard_;

    private static AFL instance;

    private AFL() {
        sport_ = "football";
        name_ = "Amateur Football League";
        quantityOfStaff_ = 150;
        year_ = 2014;
        teams_ = new ArrayList<String>(){{add("Cafeto FL"); add("Patriots B"); add("Sea hawks B"); add("Pros FL");}};
        finalMatch_ = new ArrayList<String>(){{add("Cafeto FL"); add("Pros FL");}};
        scoreBoard_ = new ArrayList<Integer>(){{add(27); add(33);}};
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

    public static AFL getInstance (){
        if(instance == null){
            instance = new AFL();
        }
        return instance;
    }
}
