import StockItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic music;

    @Before
    public void setUp() {
        music = new SheetMusic("Beethoven's Symphony Number 4", 9.00, 12.00, 32, "Ludwig von Beethoven");
    }

    @Test
    public void hasName() {
        assertEquals("Beethoven's Symphony Number 4", music.getName());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(9.00, music.getPurchasePrice(), 0.001);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(12.00, music.getSellPrice(),0.01);
    }

    @Test
    public void hasNumPages() {
        assertEquals(32, music.getNumPages());
    }

    @Test
    public void hasComposer() {
        assertEquals("Ludwig von Beethoven", music.getComposer());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.333333, music.calculateMarkup(), 0.001);
    }

    @Test
    public void canForecastProfit() {
        assertEquals(3.00, music.calculateProfit(), 0.001);
    }
}
