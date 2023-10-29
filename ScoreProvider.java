import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ScoreProvider implements ScoreSubject{
    private List<ScoreObserver> observers = new ArrayList<>();

   @Override
   public void registerObserver(ScoreObserver observer) {
       observers.add(observer);
   }

   @Override
   public void removeObserver(ScoreObserver observer) {
       observers.remove(observer);
  }

   @Override
    public void notifyObservers(String team, int score) {
       for (ScoreObserver observer : observers) {
           observer.update(team, score);
       }
   }

   public void simulateScoreUpdate(String team1,String team2) {
      Random random = new Random();
       int score1= random.nextInt(10);
       int score2= random.nextInt(10);

       notifyObservers(team1,score1);
       notifyObservers(team2,score2);
  }
}
