
public enum Weapon {

    SWORD, AXE, STAFF;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
