import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagicEightBallTest {

    MagicEightBall magicBall ;

    @Before
    public void Before(){
        magicBall = new MagicEightBall();
        magicBall.addAnswer("Berlin");
        magicBall.addAnswer("Nassau");
        magicBall.addAnswer("Rome");
    }

    @Test
    public void hasAnswers(){
        assertEquals(true, magicBall.getAnswersList().getClass().isInstance(new ArrayList()));
    }

    @Test
    public void getNbAnswers(){

        assertEquals(3, magicBall.getNbAnswers());
    }

    @Test
    public void getRandomAnswer_1(){
        String random_answer = magicBall.getRandomAnswer_1();
        Boolean random_answer_validity = random_answer == "Berlin" || random_answer == "Nassau" || random_answer == "Rome";
        assertEquals(true, random_answer_validity);
    }

    @Test
    public void getRandomAnswer_2(){
        String random_answer = magicBall.getRandomAnswer_2();
        Boolean random_answer_validity = random_answer == "Berlin" || random_answer == "Nassau" || random_answer == "Rome";
        assertEquals(true, random_answer_validity);
    }

    @Test
    public void addAnswer(){
        magicBall.addAnswer("Cambera");
        assertEquals(4, magicBall.getNbAnswers());
    }
}
