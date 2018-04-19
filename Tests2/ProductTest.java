import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    private Product p1;
    private Product p2;


    @Before
    public void setUp() throws Exception {

        p1 = new Product(1, "Table");
        p2 = new Product(1, "Chair");



    }

    @Test
    public void getProductId() {

        assertEquals(1, p1.getProductId());
    }

    @Test
    public void setProductId() {


        p1.setProductId(-233);
        assertEquals(1, p1.getProductId());

    }

    @Test
    public void getProductName() {

        assertEquals("Table", p1.getProductName());
    }

    @Test
    public void setProductName() {

        p1.setProductName("Banana");
        assertNotEquals("Banana", p1.getProductName());
    }

    @After
    public void tearDown() throws Exception {

    }
}