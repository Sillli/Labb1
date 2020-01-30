import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class Testing {

    private Volvo240 volvo;
    private Saab95 saab;

    @Before
    public void init(){
        volvo = new Volvo240();
        saab = new Saab95();

    }

    @Test
    public void testSpeedFactor(){
        assertTrue(volvo.speedFactor()==1.25);
    }

    @Test
    public void testincrementSpeedVolvo(){
        volvo.setCurrentSpeed(10);
        volvo.incrementSpeed(10);
        assertTrue(volvo.getCurrentSpeed()==22.5);

    }

    @Test
    public void testDecrementSpeedVolvo (){
        volvo.setCurrentSpeed(10);
        volvo.decrementSpeed(10);
        assertTrue(volvo.getCurrentSpeed()== 0);

    }




}
