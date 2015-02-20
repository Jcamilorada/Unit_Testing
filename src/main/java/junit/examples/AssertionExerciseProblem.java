package junit.examples;

import junit.common.Player;
import junit.common.Players.Carolina;
import junit.common.Players.Karla;
import junit.common.Players.Maria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jolaya on 2/19/2015.
 */
public class AssertionExerciseProblem {
    private ArrayList <Player> listOfPlayers = new ArrayList<Player>();
    private ArrayList<Integer> listOfIntegers = new ArrayList<Integer>() {{
        add(2);
        add(3);
        add(7);
        add(15);
        add(27);
        add(54);
        add(87);
        add(102);}};
    private String[] arrayOfStrings = {"Hello", "World", "my", "name", "is"};

    public AssertionExerciseProblem(){
        //List of Objects
        listOfPlayers.add(new Carolina("Carolina", 28, new ArrayList<String>() {{
            add("soccer");
        }}));
        listOfPlayers.add(new Karla("Karla", 25, new ArrayList<String>() {{
            add("soccer");
            add("baseball");
        }}));
    }

    //You have a current list of players and you want to change the name of one of the players and return the
    /*public Player[] changePlayerForMaria(String currentName){
        for(Player player: listOfPlayers){
            if(player.getName().toLowerCase().equals(currentName.toLowerCase())){
                listOfPlayers.remove(player);
                listOfPlayers.add(new Maria("Maria", 18, new ArrayList(){{
                    add("baseball");
                }}));
                break;
            }
        }
        Player[] arrayOfPlayers= new Player[2];
        arrayOfPlayers[0] = listOfPlayers.get(0);
        arrayOfPlayers[1] = listOfPlayers.get(1);

        return arrayOfPlayers;
    }*/

    //Check the numbers that divided by 5 have a residue of 2.
    public int[] determineNumbersWithResidueOfTwo(){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int number: listOfIntegers){
            if(number % 5 == 2){
                answer.add(number);
            }
        }

        int[] arrayOfIntegers = new int[answer.size()];
        int i = 0;
        for(int intAnswer: answer){
            arrayOfIntegers[i] = answer.get(i);
            i++;
        }

        return arrayOfIntegers;
    }

    //Add a name to the current array of Strings.
    public String[] addYourName(String myName){
        String[] arrayWithMyName = new String[arrayOfStrings.length + 1];

        int i = 0;
        for(String word: arrayOfStrings){
            arrayWithMyName[i] = word;
            i++;
        }
        arrayWithMyName[i] = myName;

        return arrayWithMyName;
    }

    //Get a player by its attribute name.
    /*public Player getPlayerByName(String name) {
        for (Player player : listOfPlayers) {
            if (player.getName().toLowerCase().equals(name.toLowerCase())) {
                return player;
            }
        }
        return null;
    }*/

    //Get the age of a player receiving the name of the player.
    public int getAgeByName(String name){
        for(Player player: listOfPlayers){
            if(player.getName().toLowerCase().equals(name.toLowerCase())){
                return player.getAge();
            }
        }
        return -1;
    }
}
