import Entities.Shop;
import Instruments.FamilyType;
import Instruments.Guitar;
import Instruments.MaterialType;
import StockItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    private Guitar guitar;
    private SheetMusic music;
    private Shop shop;

    @Before
    public void setUp() {
        guitar = new Guitar("Zenhouser", "X300", MaterialType.PLASTIC, FamilyType.STRING, "Red", 230.00, 345.00, 110, 6);
        music = new SheetMusic("Beethoven's Symphony Number 4", 9.00, 12.00, 32, "Ludwig von Beethoven");
        shop = new Shop("Ray's Records", 300.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Records", shop.getName());
    }

    @Test
    public void hasCash() {
        assertEquals(300.00, shop.getCash(), 0.001);
    }

    @Test
    public void hasStock() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canBuyStock() {
        shop.buyStock(guitar);
        shop.buyStock(music);
        assertEquals(2, shop.getStock().size());
        assertEquals(61.00, shop.getCash(), 0.001);
    }

    @Test
    public void wontBuyUnaffordableStock() {
        shop.buyStock(guitar);
        shop.buyStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canDetermineTotalProfitExpected() {
        shop.buyStock(guitar);
        shop.buyStock(music);
        assertEquals(118.00, shop.totalProfit(), 0.001);
    }
}
