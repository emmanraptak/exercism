import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HighScores {

    List<Integer> highScores;
    ArrayList<Integer> highScoresSorted;
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
        this.highScoresSorted = new ArrayList(highScores);
        Collections.sort(highScoresSorted, Collections.reverseOrder());
        
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        return highScoresSorted.get(0);
    }

    List<Integer> personalTopThree() {
        int numScoresToShow = (int) Math.min(3, highScores.size());
        return highScoresSorted.subList(0, numScoresToShow);
    }

}
