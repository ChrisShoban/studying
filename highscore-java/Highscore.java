import java.util.ArrayList;
import java.util.Collections;

public class Highscore {

	public int getRank(int[] scores, int newscore, int places) {
		ArrayList<Integer> allScores = new ArrayList<Integer>();
		allScores.add(newscore);
		for(int i = 0; i < scores.length; i++) {
			allScores.add(scores[i]);
		}
		Collections.sort(allScores);
		Collections.reverse(allScores);
		int rank = 1;
		int rankAdder = 1;
		for(int i = 0; i < allScores.size(); i++) {
			if(i > 0 && allScores.get(i) != allScores.get(i - 1)) {
				rank += rankAdder;
				rankAdder = 1;
			}
			else if(i > 0){
				rankAdder++;
			}
			if(allScores.get(i) == newscore) {
				while(i < allScores.size() && allScores.get(i) == newscore) {
					i++;
				}
				i--;
				if(i < places) {				
					return rank;
				}
			}
		}
		return -1;
	}
}
