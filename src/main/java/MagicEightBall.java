import java.util.ArrayList;

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
}
