package junit.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class FIFAWC implements Tournament {
    private String sport_, name_;
    private int quantityOfStaff_, year_;
    private List<String> teams_, finalMatch_;
    private List<Integer> scoreBoard_;

    private static FIFAWC instance;

    private FIFAWC() {
        sport_ = "soccer";
        name_ = "FIFA World Cup";
        quantityOfStaff_ = 1200;
        year_ = 2014;
        teams_ = new ArrayList<String>() {{
            add("Germany");
            add("Brazil");
            add("Netherlands");
            add("Argentina");
        }};
        finalMatch_ = new ArrayList<String>() {{
            add("Germany");
            add("Argentina");
        }};
        scoreBoard_ = new ArrayList<Integer>() {{
            add(1);
            add(0);
        }};
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

    public static FIFAWC getInstance (){
        if(instance == null){
            instance = new FIFAWC();
        }
        return instance;
    }
}
