
package summersoccerleague;

import java.util.*;


public class Scheduler {
    
    //Private variables for Scheduler Class.
    private Team[] teams;
    private int week, total, average, counter = 0;
    private int [] temp;
    
    // Scheduler ArrayLists. They are arrays that can change in length as needed.
    //They are similar to Jagged Arrays in C#.
    private ArrayList<Integer> tempArray = new ArrayList<>();
    ArrayList<Game> gameArray = new ArrayList<>();
    
    // Constructor to allow teams to recieve data.
    public Scheduler(Team[] team){
        temp = new int[]{50, 50, 50};
        week = 0;
        teams = team;
    }
 
    /*Scheduler takes the temp calculations and determines wether the season can continue.
    Once 3 cold games have been played in a row the Season ends.
    
    */
     public void scheduler(int temp) {

        tempArray.add(temp);
        if (temp > 13) {
            
            //Once the season ends the ArrayList becomes final (cannot change) in order to print the results.
            final ArrayList<Integer> teamArrayList = new ArrayList<>();
            for (int i = 0; i < teams.length; i++) {
                teamArrayList.add(i);
            }
            
            //While loop performs the games that are played.
            while (teamArrayList.size() > 1) {
                
                int randNum = (int) (Math.random() * teamArrayList.size());
                
                //Two new teams are generated and given random scores and stats.
                Team team1 = teams[teamArrayList.get(randNum)];
                teamArrayList.remove(randNum);
                randNum = (int) (Math.random() * teamArrayList.size());
                Team team2 = this.teams[teamArrayList.get(randNum)];
                teamArrayList.remove(randNum);
                
                //New games are created and given temp assignments.
                Game nextGame = new Game(temp, team1, team2);
                gameArray.add(nextGame);
                nextGame.play(temp);
                //Each time a new game is played the counter goes up and gives the game a new ID.
                counter++;
                nextGame.setGameID(counter);
                break;
            }
        } else {
            System.out.println("Game cancled due to cold conditions!");

        }
        this.temp[week] = temp;
        week = (week + 1) % 3;

    }
     //Calculation for the temperature.
    public void tempCalculation(){
        
        //Collections.max allows the highest value to be returned.
        int highTemp = Collections.max(tempArray);
        
        for (int i = 0; i < tempArray.size(); i++)
        {
            total = total + tempArray.get(i);
        }
        
        average = total / tempArray.size();
        
        //Average and hottest day printed.
        System.out.println("Season's Average Temp = " + average);
        System.out.println("Season's Hottest Day = " + highTemp);
    }

     //Once 3 cold games have happened this method will trigger and end the season.
    public boolean seasonOver() {
        for (int i : temp) {
            if (i >= 13) {
                return true;
            }
        }
        return false;
    }

    //Once the Season is over the stats will be printed.
    public void printGameStats() {
        Team teams = new Team();
        for (Game game : gameArray) {
            game.display();
            System.out.println("");

        }

    }
    
    
}
