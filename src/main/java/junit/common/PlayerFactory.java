package junit.common;

import junit.common.Players.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class PlayerFactory {
    private List<Player> FemalePlayers = new ArrayList<Player>();
    private List<Player> MalePlayers = new ArrayList<Player>();

    public PlayerFactory(){
        //Creating Female Players
        FemalePlayers.add(new Carolina("Carolina", 28, new ArrayList<String>(){{add("soccer"); add("baseball"); add("football");}}));
        FemalePlayers.add(new Karla("Karla", 25, new ArrayList<String>(){{add("soccer"); add("football"); add("baseball");}}));
        FemalePlayers.add(new Karol("Karol", 22, new ArrayList<String>(){{add("football"); add("baseball"); add("soccer");}}));
        FemalePlayers.add(new Maria("Maria", 30, new ArrayList<String>(){{add("soccer"); add("baseball"); add("football");}}));

        MalePlayers.add(new Alberto("Alberto", 32, new ArrayList<String>(){{add("soccer"); add("baseball");}}));
        MalePlayers.add(new Alejandro("Alejandro", 22, new ArrayList<String>(){{add("soccer");}}));
        MalePlayers.add(new Camilo("Camilo", 25, new ArrayList<String>(){{add("football"); add("soccer");}}));
        MalePlayers.add(new Carlos("Carlos", 28, new ArrayList<String>(){{add("baseball"); add("soccer");}}));
        MalePlayers.add(new Jason("Jason", 35, new ArrayList<String>(){{add("football"); add("baseball");}}));
        MalePlayers.add(new John("John", 21, new ArrayList<String>(){{add("soccer"); add("football");}}));
        MalePlayers.add(new Juan("Juan", 22, new ArrayList<String>(){{add("soccer"); add("baseball");}}));

    }

    public List<Player> getMalePlayers(){
        return MalePlayers;
    }

    public List<Player> getFemalePlayers(){
        return FemalePlayers;
    }

}
