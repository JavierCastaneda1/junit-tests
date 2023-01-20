import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIfIsEmptyWorks(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testIfSizeWorks(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertEquals(4, kitchenWithMany.size());
    }

    @Test
    public void testIfAddWorks(){
        emptyKitchen.add("blue corn");
        assertEquals(1, emptyKitchen.size());

        kitchenWithMany.add("red corn");
        assertEquals(5, kitchenWithMany.size());
    }

    @Test
    public void testIfPopWorks(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
        kitchenWithMany.pop();
        assertEquals(3, kitchenWithMany.size());
    }

    @Test
    public void testIfContainsWorks(){
        assertFalse(emptyKitchen.contains("white corn"));

        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertFalse(kitchenWithOne.contains("white corn"));

        assertTrue(kitchenWithMany.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("white corn"));
        assertFalse(kitchenWithMany.contains("red corn"));
    }

}