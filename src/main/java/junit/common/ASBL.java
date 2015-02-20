package junit.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class ASBL implements Tournament{

    private String sport_, name_;
    private int quantityOfStaff_, year_;
    private List<String> teams_, finalMatch_;
    private List<Integer> scoreBoard_;

    private static ASBL instance;

    private ASBL() {
        sport_ = "basketball";
        name_ = "All Star Basketball League";
        quantityOfStaff_ = 756;
        year_ = 1998;
        teams_ = new ArrayList<String>(){{add("West"); add("East");}};
        finalMatch_ = new ArrayList<String>(){{add("West"); add("East");}};
        scoreBoard_ = new ArrayList<Integer>(){{add(154); add(119);}};
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
    
    public static ASBL getInstance (){
        if(instance == null){
            instance = new ASBL();
        }
        return instance;
    }
    
}
