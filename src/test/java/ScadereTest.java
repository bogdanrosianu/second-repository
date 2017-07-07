import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bogdan on 7/7/2017.
 */
public class ScadereTest {
    @Test
    public void test(){
        Scadere scade = new Scadere();
        //arrange
        int a=5, b=2;

        //act
        int rez = scade.scade(a,b);

        //assert
        Assert.assertTrue(rez==2);
    }
}
