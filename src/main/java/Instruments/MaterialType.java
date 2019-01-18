package Instruments;

public enum MaterialType {

    BRASS("Brass"),
    PLASTIC("Plastic"),
    WOOD("Wood"),
    STEEL("Steel");

    private String stringName;

    MaterialType(String stringName) {
        this.stringName = stringName;
    }

    public String getStringName() {
        return stringName;
    }
}
