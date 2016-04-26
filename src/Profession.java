
public enum Profession {

    KNIGHT, BARBARIAN, WIZARD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
