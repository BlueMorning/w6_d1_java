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


}
