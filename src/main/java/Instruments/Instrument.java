package Instruments;


import Interfaces.IPlayable;
import Interfaces.ISellable;

public abstract class Instrument implements ISellable, IPlayable {

    private String make;
    private String model;
    private MaterialType material;
    private FamilyType family;
    private String colour;
    private double purchasePrice;
    private double sellPrice;

    public Instrument(String make, String model, MaterialType material, FamilyType family, String colour, double purchasePrice, double sellPrice) {
        this.make = make;
        this.model = model;
        this.material = material;
        this.family = family;
        this.colour = colour;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public FamilyType getFamily() {
        return family;
    }

    public String getColour() {
        return colour;
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
