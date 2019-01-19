package StockItems;

public class SheetMusic extends StockItem{

    private int numPages;
    private String composer;

    public SheetMusic(String name, double purchasePrice, double sellPrice, int numPages, String composer) {
        super(name, purchasePrice, sellPrice);
        this.numPages = numPages;
        this.composer = composer;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getComposer() {
        return composer;
    }
}
