
package summersoccerleague;

import java.util.*;

public class Game {
    
    private Random r = new Random();
    
    private int gameID = 0;
    private Team home, away;
    private int homeGoals, awayGoals;
    private int temp;
    private ArrayList<Game> gameArray = new ArrayList();
    
    public Game(){
        
        this.temp = 10;
        this.home = home;
        this.away = away;
        this.homeGoals = 0;
        this.awayGoals = 0;
    }
    public Game(int temp, Team home, Team away){
        
        this.temp = temp;
        this.home = home;
        this.away = away;
    }
    
    public void play(int temp){
        
        int r1 = getR().nextInt(5) + (2 *(temp /10));
        int r2 = getR().nextInt(5) + (2 *(temp /10));
        setHomeGoals(r1);
        setAwayGoals(r2);
        
        if (getAwayGoals() == getHomeGoals()){
            getAway().setDraw(getAway().getDraw() + 1);
            System.out.println("Its a draw - " + getHome().getTeamName() +" "+ getHomeGoals() +" : " + getAwayGoals() + " "+ getAway().getTeamName());
        }
        else if (getHomeGoals() > getAwayGoals()){
            getHome().setWin(getHome().getWin() + 1);
            getAway().setLoss(getAway().getLoss() + 1);
            System.out.println("Its a win for the home team! - " + getHome().getTeamName() +" "+ getHomeGoals() +" : " + getAwayGoals() + " "+ getAway().getTeamName());
        }
        else if (getHomeGoals() < getAwayGoals()){
            getAway().setWin(getAway().getWin() + 1);
            getHome().setLoss(getHome().getLoss() + 1);
            System.out.println("Its a win for the away team! - " + getHome().getTeamName() +" "+ getHomeGoals() +" : " + getAwayGoals() + " "+ getAway().getTeamName());
            
        }
        else{
            System.out.println("Error Message in play method - Game class.");
        }
        
        getHome().setGoal(getHome().getGoal()+ getHomeGoals());
        getAway().setGoal(getAway().getGoal() + getAwayGoals());
        getHome().setGoalMax(getHome().getGoalMax() + getHomeGoals());
        getAway().setGoalMax(getAway().getGoalMax() + getAwayGoals());
    }
    
    public void printGameStats(){
        for (int i = 0; 1 < getGameID(); i++)
            {
            }
    }
    public void display(){
        System.out.println("Match - " + getGameID() + "  Current Temp - " + getTemp());
        System.out.println(getHome().getTeamName() + " vs " + getAway().getTeamName());
    }

    
    //Getters and setters for Game Class.
    /**
     * @return the r
     */
    public Random getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Random r) {
        this.r = r;
    }

    /**
     * @return the gameID
     */
    public int getGameID() {
        return gameID;
    }

    /**
     * @param gameID the gameID to set
     */
    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    /**
     * @return the home
     */
    public Team getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(Team home) {
        this.home = home;
    }

    /**
     * @return the away
     */
    public Team getAway() {
        return away;
    }

    /**
     * @param away the away to set
     */
    public void setAway(Team away) {
        this.away = away;
    }

    /**
     * @return the homeGoals
     */
    public int getHomeGoals() {
        return homeGoals;
    }

    /**
     * @param homeGoals the homeGoals to set
     */
    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    /**
     * @return the awayGoals
     */
    public int getAwayGoals() {
        return awayGoals;
    }

    /**
     * @param awayGoals the awayGoals to set
     */
    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    /**
     * @return the temp
     */
    public int getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(int temp) {
        this.temp = temp;
    }

    /**
     * @return the games
     */
    public ArrayList<Game> getGames() {
        return gameArray;
    }

    /**
     * @param games the games to set
     */
    public void setGames(ArrayList<Game> games) {
        this.gameArray = games;
    }

    
   
}
