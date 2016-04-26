
public enum Armor {

    LEATHER, CHAINMAIL, CLOTH;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
