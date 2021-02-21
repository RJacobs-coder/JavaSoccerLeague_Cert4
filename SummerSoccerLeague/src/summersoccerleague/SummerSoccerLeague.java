package summersoccerleague;

import java.util.*;


/*
Name: Robert Jacobs 30018755
Date: 04/11/2020
Project: Summer Soccer League
Description: A program to create 4 teams for a soccer league.
Games cannot be played in winter, when its too cold the league ends.
Temp must be calculated and wins, losses, draws and total games played must all be recorded
and printed once the league ends after 3 cold days in a row.
*/

public class SummerSoccerLeague {

    public static void main(String[] args) {

        // Teams created for the league.
        Team cats = new Team("The Mighty Meows");
        Team dogs = new Team("Boner Killers");
        Team birds = new Team("Talon-ted");
        Team rabbits = new Team("Arrest Warren-t");
        // Class array allows easy manipulation of different teams.
        Team[] allteams = {cats, dogs, birds, rabbits};

        // Counter to keep a tally of how many games are played.
        int counter = 0;
        boolean seasonOn = true;

        Scheduler schGame = new Scheduler(allteams);

        //While loop keeps the league going. The user enters in the temp of each day.
        while (seasonOn == true) 
        {
            System.out.println("Please enter the temperature in Celcius");
            Scanner scan = new Scanner(System.in);
            int userinput = scan.nextInt();

            // The Scheduler takes the user input and calculates the temp
            // This determines wether the league continues.
            schGame.scheduler(userinput);
            seasonOn = schGame.seasonOver();
            counter++;
        } 
        
        // After the league is completed after 3 days all the results are printed out.
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Season is over, temp stats");
        schGame.tempCalculation();
        System.out.println("Number of games played - " + counter);
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        for (int i = 0; i < 1; i++) 
        {
            schGame.printGameStats();
            System.out.println("");
        }
        Team team = new Team();
        for (int j = 0; j < allteams.length; j++) 
        {
            // All the teams have their scores read out.
            System.out.println("================================================");
            System.out.println(allteams[j].getTeamName() + " Wins:  " + allteams[j].getWin() + " Losses: " + allteams[j].getLoss() + " Draws: " + allteams[j].getDraw() + " GoalsScored: " + allteams[j].getGoalMax() + " GoalsAllowed: " + allteams[j].getGoalMax());
            System.out.println("================================================");
        }
    }
}
  