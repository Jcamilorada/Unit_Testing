package junit.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class FIFAFWC implements Tournament {
    private String sport_, name_;
    private int quantityOfStaff_, year_;
    private List<String> teams_, finalMatch_;
    private List<Integer> scoreBoard_;

    private static FIFAFWC instance;

    private FIFAFWC() {
        sport_ = "soccer";
        name_ = "FIFA World Cup";
        quantityOfStaff_ = 1200;
        year_ = 2014;
        teams_ = new ArrayList<String>(){{add("Ivory Coast"); add("Brazil"); add("Colombia"); add("USA");}};
        finalMatch_ = new ArrayList<String>(){{add("USA"); add("Colombia");}};
        scoreBoard_ = new ArrayList<Integer>(){{add(0); add(2);}};
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

    public static FIFAFWC getInstance (){
        if(instance == null){
            instance = new FIFAFWC();
        }
        return instance;
    }
}
