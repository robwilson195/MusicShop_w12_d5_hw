import Instruments.FamilyType;
import Instruments.Guitar;
import Instruments.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Zenhouser", "X300", MaterialType.PLASTIC, FamilyType.STRING, "Red", 230.00, 345.00, 110, 6);
    }

    @Test
    public void hasMake() {
         assertEquals("Zenhouser", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("X300", guitar.getModel());
    }

    @Test
    public void hasMaterial() {
        assertEquals(MaterialType.PLASTIC, guitar.getMaterial());
    }

    @Test
    public void hasInstrumentFamily() {
        assertEquals(FamilyType.STRING, guitar.getFamily());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(230, guitar.getPurchasePrice(), 0.001);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(345, guitar.getSellPrice(), 0.001);
    }

    @Test
    public void hasLength() {
        assertEquals(110, guitar.getLengthCM());
    }

    @Test
    public void hasNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void canDetermineMarkup() {
        assertEquals(0.50, guitar.calculateMarkup(), 0.001);
    }

    @Test
    public void canForecastProfit() {
        assertEquals(115.0, guitar.calculateProfit(), 0.001);
    }

    @Test
    public void canBePlayed() {
        assertEquals("Strum strum!", guitar.play());
    }
}
