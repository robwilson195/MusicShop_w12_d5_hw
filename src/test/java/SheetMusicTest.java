import StockItems.SheetMusic;
import org.junit.Before;

public class SheetMusicTest {

    private SheetMusic music;

    @Before
    public void setUp() {
        music = new SheetMusic("Beethoven's Symphony Number 4", 9.00, 12.00);
    }
}
