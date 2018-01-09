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

    public void removeAnswer(String answer) {
        if(hasAnswer(answer))
        {
            answersList.remove(answer);
        }
    }

    public boolean hasAnswer(String answer) {
        return answersList.contains(answer);
    }

    public void removeAnswerRandomly() {
        this.answersList.remove(new Random().nextInt(this.answersList.size()));
    }

    public ArrayList<String> getAnswersCopy(){
        return (ArrayList<String>)this.answersList.clone();
    }
}
