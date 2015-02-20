package junit.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/20/2015.
 */
public class NFL implements Tournament {
    
    private String sport_, name_;
    private int quantityOfStaff_, year_;
    private List<String> teams_, finalMatch_;
    private List<Integer> scoreBoard_;
    
    private static NFL instance;

    private NFL() {
        sport_ = "football";
        name_ = "National Football League";
        quantityOfStaff_ = 800;
        year_ = 2015;
        teams_ = new ArrayList<String>(){{add("Packers"); add("Patriots"); add("Sea hawks"); add("Broncos"); add("Steelers");}};
        finalMatch_ = new ArrayList<String>(){{add("Patriots"); add("Sea Hawks");}};
        scoreBoard_ = new ArrayList<Integer>(){{add(28); add(22);}};
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
    
    public static NFL getInstance (){
        if(instance == null){
            instance = new NFL();
        }
        return instance;
    }

}
