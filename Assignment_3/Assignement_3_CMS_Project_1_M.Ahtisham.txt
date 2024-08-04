import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------------   Welcome to Cricket Management System   ------------------");

        Scanner scanner = new Scanner(System.in);

        // Initializations for first team's
        String teamName1=" ";
        String[] teamOnePlayers = new String[11];
        int[] teamOnescore = new int[10];
        double[] teamOneStrikeRate = new double[10];
        int[] teamOneballs = new int[10];




        // Initializations for second team's
        String teamName2=" ";
        String[] teamTwoPlayers = new String[11];
        int[] teamTwoscore = new int[10];
        double[] teamTwoStrikeRate = new double[10];
        int[] teamTwoballs = new int[10];

        // Initializations for both Teams Individuals
        int playerScore = 0;
        int playerFacedBalls = 0;
        int playerStrike = 0;

        // Initializations for both Teams Result
        int totalTeamOneScore = 0;
        int totalTeamTwoScore = 0;
        int winningScore = 0;


        // Input Teams Name:
        System.out.println();
        System.out.print("Enter the name for the first team: ");
        teamName1 = scanner.nextLine();
        // Input First Team members
        System.out.println(":::::: First Team " + teamName1 + " Player Name ::::: ");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            teamOnePlayers[i] = scanner.nextLine();
        }
        System.out.println();


        // Input Second Team
        System.out.print("Enter the name for the Second team: ");
        teamName2 = scanner.nextLine();
        // Input Second Team Members
        System.out.println(":::::: Second Team " + teamName2 + " Player Name ::::: ");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            teamTwoPlayers[i] = scanner.nextLine();
        }
        System.out.println();

        System.out.println(" Lets Play Match:) ");

        // Toss
        Random random = new Random();
        boolean toss = random.nextBoolean();
        // True For First Team Bat First
        // False For First Team Bat First


// True For First Team Bat First
        if (toss) {
            System.out.println(teamName1 + " Will Bat First ");
            System.out.println();
            System.out.println(">>>> First Innings <<<<");
            int totalBalls = 0;
            for (int i = 0; i < 10 && totalBalls <= 120; i++) {
                System.out.print("Enter player " + teamOnePlayers[i] + " score: ");
                playerScore = scanner.nextInt();
                teamOnescore[i] = playerScore;

                System.out.print("Enter player " + teamOnePlayers[i] + " balls faced: ");
                playerFacedBalls  = scanner.nextInt();
                teamOneballs [i] =playerFacedBalls ;

                if (   playerFacedBalls  > 0) {
                    teamOneStrikeRate[i] = (double) playerScore / playerFacedBalls * 100;
                } else {
                    teamOneStrikeRate[i] = 0;
                }
                totalBalls += playerFacedBalls ;
                if(totalBalls>=120)
                {
                    System.out.println("Overs are Completed so Inning is Ended");
                    break;
                }

            }
            System.out.println();
            totalBalls = 0;
            System.out.println(" >>>> Second Innings <<<< ");
            for (int i = 0; i < 10 && totalBalls <= 120; i++) {
                System.out.print("Enter player " + teamTwoPlayers[i] + " score: ");
                playerScore = scanner.nextInt();
                teamTwoscore[i] = playerScore;

                System.out.print("Enter player " + teamTwoPlayers[i] + " balls faced: ");
                playerFacedBalls = scanner.nextInt();
                teamTwoballs[i]=playerFacedBalls;

                if ( playerFacedBalls > 0) {
                    teamTwoStrikeRate[i] = (double) playerScore /  playerFacedBalls  * 100;
                } else {
                    teamTwoStrikeRate[i] = 0;
                }
                totalBalls += playerFacedBalls ;
                if(totalBalls>=120)
                {
                    System.out.println("Overs are Completed so Inning is Ended");
                    break;
                }
            }
        }

        else {
            System.out.println(teamName2 + " Will Bat First ");
            System.out.println();
            System.out.println(" >>>> First Innings <<<< ");
            int totalBalls = 0;
            for (int i = 0; i < 10 && totalBalls <= 120; i++) {
                System.out.print("Enter player " + teamTwoPlayers[i] + " score: ");
                playerScore = scanner.nextInt();
                teamTwoscore[i] = playerScore;

                System.out.print("Enter player " + teamTwoPlayers[i] + " balls faced: ");
                playerFacedBalls = scanner.nextInt();
                teamOneballs[i]=playerFacedBalls;

                if (playerFacedBalls > 0) {
                    teamTwoStrikeRate[i] = (double) playerScore / playerFacedBalls * 100;
                } else {
                    teamTwoStrikeRate[i] = 0;
                }
                totalBalls += playerFacedBalls;
                if(totalBalls>=120)
                {
                    System.out.println("Overs are Completed so Inning is Ended");
                    break;
                }

            }

            System.out.println();
            System.out.println(" >>>> Second Innings <<<< ");
            totalBalls = 0;
            for (int i = 0; i < 10 && totalBalls <= 120; i++) {
                System.out.print("Enter player " + teamOnePlayers[i] + " score: ");
                playerScore = scanner.nextInt();
                teamOnescore[i] = playerScore;

                System.out.print("Enter player " + teamOnePlayers[i] + " balls faced: ");
                playerFacedBalls = scanner.nextInt();
                teamTwoballs[i]=playerFacedBalls;

                if (playerFacedBalls > 0) {
                    teamOneStrikeRate[i] = (double) playerScore / playerFacedBalls * 100;
                } else {
                    teamOneStrikeRate[i] = 0;
                }
                totalBalls += playerFacedBalls;
                if(totalBalls>=120)
                {
                    System.out.println("Overs are Completed so Inning is Ended ");
                    break;
                }
            }

        }

        // Winner Decision:
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            totalTeamOneScore += teamOnescore[i];
        }
        System.out.println(teamName1 + " Score: " + totalTeamOneScore);
        for (int i = 0; i < 10; i++) {
            totalTeamTwoScore += teamTwoscore[i];
        }
        System.out.println(teamName2 + " Score: " + totalTeamTwoScore);
        System.out.println("------------------------------------------------------------------------");

        winningScore = totalTeamTwoScore - totalTeamOneScore;

        if (totalTeamTwoScore > totalTeamOneScore) {
            System.out.println("Congratulation! " + teamName2 + " Wins the match by " + (totalTeamTwoScore - totalTeamOneScore) + " Runs ");
        } else if (totalTeamTwoScore < totalTeamOneScore) {
            System.out.println("Congratulation! " + teamName1 + " Wins the match by " + (totalTeamOneScore - totalTeamTwoScore ) + " Runs ");
        } else {
            System.out.println(" Match Is Draw ");
        }
        System.out.println("------------------------------------------------------------------------");


        System.out.println();
        System.out.println();
        int details = 0;
        System.out.println("Press 1. If you want Check details Like Player's Score and Strike Rate ");
        System.out.println("Press 0. If you want to Exit ");
        details = scanner.nextInt();
        if(details == 1)
        {
            System.out.println();
            System.out.println("::::::::::::: " + teamName1 + " Details :::::::::::::");
            System.out.println();
            for (int i = 0; i < 10 ; i++) {
                System.out.println( i+1 + ".  " + teamOnePlayers[i]  + "Score:" + teamOnescore[i] + " Balls:"  +   teamOneballs[i] + " Strike Rate:"  +   teamOneStrikeRate[i] );
            }
            System.out.println();
            System.out.println("::::::::::::: " + teamName2 + " Details :::::::::::::");
            System.out.println();
            for (int i = 0; i < 10 ; i++) {
                System.out.println( i+1 + ".  " + teamTwoPlayers[i]  + "Score:" + teamTwoscore[i] + " Balls:"  +   teamTwoballs[i] + " Strike Rate:"  +   teamTwoStrikeRate[i] );
            }
        }
        else
        {
            return;
        }







        // Why I Use Arrays For Team Player Score?
        /* I can solve it without array by using compound assignment operators. but it will not keep the data for each team members like his score and strike Rate.
        Through Array of Score of each team we can perform extra operations like check Score and strike rate of each member, and perform different validations' operation on array.
         */


    }
}