import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleCalculatorTest {

    @Test
    public void testadd1(){
        SampleCalculator cal = new SampleCalculator();

        assertEquals(4,cal.add(2,2));

    }

    @Test
    public void testadd2(){
        SampleCalculator cal = new SampleCalculator();

        assertEquals(5,cal.add(2,3));

    }

    @Test
    public void testadd3(){
        SampleCalculator cal = new SampleCalculator();

        assertEquals(4,cal.add(2,2));

    }
    @Test
    public void testadd4(){
        SampleCalculator cal = new SampleCalculator();

        assertEquals(4,cal.add(2,2));

    }



}