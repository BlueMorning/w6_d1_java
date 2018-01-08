import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MagicEightBall {

    private ArrayList<String> answersList;


    public MagicEightBall(){
        this.answersList = new ArrayList<>();
    }

    public ArrayList<String> getAnswersList() {
        return answersList;
    }

    public void addAnswer(String _answer) {
        this.answersList.add(_answer);
    }

    public int getNbAnswers() {
        return this.answersList.size();
    }

    public String getRandomAnswer_1(){
        return this.answersList.get(new Random().nextInt(this.answersList.size()));
    }

    public String getRandomAnswer_2(){
        Collections.shuffle(this.answersList);
        return answersList.get(0);
    }
}
