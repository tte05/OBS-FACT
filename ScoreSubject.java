public interface ScoreSubject {
    void registerObserver(ScoreObserver observer);

     void removeObserver(ScoreObserver observer);

    void notifyObservers(String team, int score);
}
