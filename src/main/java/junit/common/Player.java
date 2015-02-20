package junit.common;

import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */

//Interface for the creation of players independant of the tournament he/she while participate.
public interface Player {

    //Getter and Setter for name of the Player. Data Type is String
    public String getName();
    public void setName(String name);

    //Getter and Setter for age of the player. Data type is short.
    public int getAge();
    public void setAge(int age);

    //Getter and Setter for Sports the Player plays. Data type is a list of strings, where each string represents a sport.
    public List<String> getPlayerSport();
    public void setPlayerSport(List<String> playerSport);
}
