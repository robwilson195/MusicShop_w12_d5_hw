package Instruments;

public enum FamilyType {

    BRASS("Brass"),
    PERCUSSION("Percussion"),
    WOODWIND("Woodwind"),
    STRING("String");

    private String stringName;

    FamilyType(String stringName) {
        this.stringName = stringName;
    }

    public String getStringName() {
        return stringName;
    }
}
