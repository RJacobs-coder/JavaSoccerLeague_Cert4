package summersoccerleague;

import java.util.*;

public class Team {

    // Private Variables for Team Class.
    private String teamName;
    private int win, loss, draw, goal, goalMax;
    
    // Array list for Temperature.
    private ArrayList<Integer> temperatureArray = new ArrayList<>();
    
    // Default constructor. The "this.data" syntax allows it to be used more than others.
    // All the integer values are constructed here and if a team name is not supplied the default name will appear.
    public Team(){
        this.win =0;
        this.loss = 0;
        this.draw = 0;
        this.goal = 0;
        this.teamName = "Soccer League Team";   
    }
    
    //When the team name is provided in the main class this constructor will be used.
   public Team(String names){
       
       teamName = names;
       win = 0;
       loss =0;
       draw =0;
       goal = 0;
       goalMax = 0;      
   }
   
   // Allows other classes to Display stats for each team.
   public void displayTeam(){
      System.out.println("Number of wins - " + getTeamName() + " Number of losses - " + getLoss()+ " Number of Draws - " + getDraw());
      System.out.println();
   }
   
   
   // Prints the results of the team after the league is finised.
   public void printResults(String names, int week){
       System.out.println("Today's Temp - " + temperatureArray.get(week));
       System.out.println("Team Name - " +getTeamName());
       System.out.println("Wins - " +getWin() + "Draws - " + getDraw() + "Losses - " + getLoss());
       System.out.println("Goals Scored - " + getGoal() + "Goal Limit - " + getGoalMax());
   }

    
   
   // Setters and getters for Team Class.
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    } 
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLoss() {
        return loss;
    }
    public void setLoss(int loss) {
        this.loss = loss;
    }
    public int getDraw() {
        return win;
    }
    public void setDraw(int win) {
        this.win = win;
    }
    public int getGoal() {
        return goal;
    }
    public void setGoal(int goal) {
        this.goal = goal;
    }
    public int getGoalMax() {
        return goalMax;
    }
    public void setGoalMax(int goalMax) {
        this.goalMax = goalMax;
    }
}
