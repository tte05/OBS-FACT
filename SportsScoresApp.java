import java.util.Scanner;

public class SportsScoresApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first team");
        String team1Name=scanner.nextLine();

        System.out.println("Enter the second team");
        String team2Name=scanner.nextLine();

        ScoreBoard scoreboard1 = new ScoreBoard("Scoreboard 1");

        ScoreProvider scoreProvider = new ScoreProvider();

        scoreProvider.registerObserver(scoreboard1);

        scoreProvider.simulateScoreUpdate(team1Name,team2Name);
        scanner.close();
    }
}





