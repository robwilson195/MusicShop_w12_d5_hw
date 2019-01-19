package Instruments;

public class Guitar extends Instrument{

    private final int lengthCM;
    private final int numStrings;

    public Guitar(String make, String model, MaterialType material, FamilyType family, String colour, double purchasePrice, double sellPrice, int lengthCM, int numStrings) {
        super(make, model, material, family, colour, purchasePrice, sellPrice);
        this.lengthCM = lengthCM;
        this.numStrings = numStrings;
    }

    public int getLengthCM() {
        return lengthCM;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String play() {
        return "Strum strum!";
    }


}
