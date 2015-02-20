package junit.common.Players;

import junit.common.Player;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class Camilo  implements Player{
    String name_;
    int age_;
    List<String> playerSport_;

    public Camilo(String name, int age, List<String> playerSport){

        name_ = name;
        age_ = age;
        playerSport_ = playerSport;
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
    public int getAge() {
        return age_;
    }

    @Override
    public void setAge(int age) {
        age_ = age;
    }

    @Override
    public List<String> getPlayerSport() {
        return playerSport_;
    }

    @Override
    public void setPlayerSport(List<String> playerSport) {
        playerSport_ = playerSport;
    }
}
