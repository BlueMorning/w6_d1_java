import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagicEightBallTest {

    MagicEightBall magicBall ;
    int nbAnswers;

    @Before
    public void Before(){
        magicBall = new MagicEightBall();

        magicBall.addAnswer("Berlin");
        magicBall.addAnswer("Nassau");
        magicBall.addAnswer("Rome");
        magicBall.addAnswer("Paris");
        magicBall.addAnswer("Mexico");
        magicBall.addAnswer("Montreal");

        nbAnswers = magicBall.getNbAnswers();
    }

    @Test
    public void hasAnswers(){
        assertEquals(true, magicBall.getAnswersList().getClass().isInstance(new ArrayList()));
    }

    @Test
    public void getNbAnswers(){
        assertEquals(nbAnswers, magicBall.getNbAnswers());
    }

    @Test
    public void getRandomAnswer_1(){
        String random_answer = magicBall.getRandomAnswer_1();
        assertEquals(true, magicBall.hasAnswer(random_answer));
    }

    @Test
    public void getRandomAnswer_2(){
        String random_answer = magicBall.getRandomAnswer_2();
        assertEquals(true, magicBall.hasAnswer(random_answer));
    }

    @Test
    public void addAnswer(){
        magicBall.addAnswer("Cambera");
        assertEquals(nbAnswers+1, magicBall.getNbAnswers());
    }

    @Test
     public void removeAnswer(){
        magicBall.removeAnswer("Berlin");
        assertEquals(nbAnswers-1, magicBall.getNbAnswers());
        assertEquals(false, magicBall.hasAnswer("Berlin"));
    }

    @Test
    public void removeAnswerRandomly(){
        magicBall.removeAnswerRandomly();
        assertEquals(nbAnswers-1, magicBall.getNbAnswers());
    }

    @Test
    public void getAnswersCopy(){
        ArrayList<String> copy = magicBall.getAnswersCopy();
        assertEquals(true, copy.equals(magicBall.getAnswersCopy()));
    }
}
