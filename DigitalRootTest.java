import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    @Test
    public void testSolution(){
        assertEquals(7,DigitalRoot.digital_root(16),"DigitalRootFailed");
    }

    @Test
    public void testSolution1(){
        assertEquals(9,DigitalRoot.digital_root(9),"Single digit not returned successfully");
    }

    @Test
    public void largeNumber(){
        assertEquals(2,DigitalRoot.digital_root(493193), "Failed!!!");
    }

}