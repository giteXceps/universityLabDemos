public class MarathonManager {

    public int first(Marathon marathon){
        int[] scores = marathon.getScores();
        int max = scores[0];
        for(int score:scores){
            if(score > max)
                max = score;
        }

        for (int i=0 ; i<16 ; i++){
            if(scores[i]==max){
                return i;
            }
        }
        return -1;
    }
}
