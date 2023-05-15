import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterbottle {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    };

    @Test
    public void testVolume(){
        assertEquals(100, waterbottle.getVolume());

    }
    @Test
    public void testVolumeReduced(){
        assertEquals(90, waterbottle.reduceVolume(10));
    }

    @Test
    public void testVolumeZero(){
        assertEquals(0,waterbottle.reduceZero());
    }

    @Test
    public void testFill(){
        assertEquals(100, waterbottle.fillUp());
    }

}
