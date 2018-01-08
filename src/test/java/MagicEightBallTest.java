import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagicEightBallTest {

    MagicEightBall magicBall ;

    @Before
    public void Before(){
        magicBall = new MagicEightBall();
    }

    @Test
    public void hasAnswers(){
        assertEquals(true, magicBall.getAnswersList().getClass().isInstance(new ArrayList()));
    }

    @Test
    public void getNbAnswers(){
        magicBall.addAnswer("Berlin");
        magicBall.addAnswer("Nassau");
        magicBall.addAnswer("Rome");
        assertEquals(3, magicBall.getNbAnswers());
    }


}
