
public interface CharacterBuilder {
    void buildName(String name);

    void buildProfession(Profession profession);

    void buildWeapon(Weapon weapon);

    void buildArmor(Armor armor);

    Character getHero();
}
