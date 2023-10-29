public class ScoreBoard implements ScoreObserver {
    private String name;

    public ScoreBoard(String name) {
        this.name = name;
    }

    @Override
    public void update(String team, int score) {
        System.out.println(name + ": " + team + " - " + score);
    }
}
