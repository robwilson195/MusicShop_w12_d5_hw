package Entities;

import Interfaces.ISellable;

import java.util.ArrayList;

public class Shop {


    private final String name;
    private double cash;
    private ArrayList<ISellable> stock;

    public Shop(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public ArrayList<ISellable> getStock() {
        return stock;
    }

    public Boolean canAfford(ISellable item) {
        return item.getPurchasePrice() <= this.cash;
    }

    public void buyStock(ISellable newItem) {
        if (canAfford(newItem)) {
            this.cash -= newItem.getPurchasePrice();
            stock.add(newItem);
        }
    }

    public double totalProfit() {
        double totProf = 0;
        for (ISellable item : stock) {
            totProf += item.calculateProfit();
        }
        return totProf;
    }
}
