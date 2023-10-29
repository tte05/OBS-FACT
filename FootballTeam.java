public class FootballTeam implements SportsTeam{
    private String name;
   private int score;

  public FootballTeam(String name, int score) {
       this.name = name;
       this.score = score;
}

@Override
    public String getName() {
        return name;
}

@Override
    public int getScore() {
        return score;
 }
}
