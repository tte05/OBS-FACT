import java.util.Random;

class FootballTeamFactory {
    public static SportsTeam createFootballTeam(String name) {
        Random random=new Random();
        int score= random.nextInt(10);
        return new FootballTeam(name, score);
    }
}

