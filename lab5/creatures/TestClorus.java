package creatures;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Tests the clorus class
 *
 * @author davidhsieh
 */

public class TestClorus {
    @Test
    public void testBasics() {
        Clorus c = new Clorus(2);
        assertEquals(2, c.energy(), 0.01);
        assertEquals(new Color(34, 0, 231), c.color());
        c.move();
        assertEquals(1.97, c.energy(), 0.01);
        c.move();
        assertEquals(1.94, c.energy(), 0.01);
        c.stay();
        assertEquals(1.93, c.energy(), 0.01);
        c.stay();
        assertEquals(1.92, c.energy(), 0.01);
    }

    @Test
    public void testReplicate() {
        Clorus c = new Clorus(2);
        assertEquals(2, c.energy(), 0.01);
        Clorus babyC = c.replicate();
        assertEquals(1, c.energy(), 0.01);
        assertEquals(1, babyC.energy(), 0.01);
        assertFalse(c.equals(babyC));   //Check if they are same object or not.
    }

    @Test
    public void testChoose() {
        // TODO
    }
}
