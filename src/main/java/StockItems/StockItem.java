package StockItems;

import Interfaces.ISellable;

public abstract class StockItem implements ISellable {

    private String name;
    private double purchasePrice;
    private double sellPrice;

    public StockItem(String name, double purchasePrice, double sellPrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return (sellPrice - purchasePrice) / purchasePrice;
    }

    public double calculateProfit() {
        return sellPrice - purchasePrice;
    }
}
