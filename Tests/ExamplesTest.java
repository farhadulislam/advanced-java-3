import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExamplesTest {
    private Examples exmp1;
    private Examples exmp2;

    @Before
    public void setUp() throws Exception {

        exmp1 = new Examples(1, "Example 1");
        exmp2 = new Examples(2, "Example 2");
    }

    @Test
    public void getExampleNameTest() {


        assertEquals("Example 1", exmp1.getExampleName());
    }



    @Test
    public void getExampleIdTest(){

        assertEquals(2, exmp2.getExampleId());
    }

    @Test
    public void setExampleIdTest() {

        exmp1.setExampleName("Apple");
        assertEquals("Apple", exmp1.getExampleName());
    }


    @After
    public void tearDown() throws Exception {
        exmp1 = null;
        exmp2 = null;
    }


}