
public class HeroDirectorImpl implements CharacterDirector {

    CharacterBuilder characterBuilder;

    public HeroDirectorImpl(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    @Override
    public Character getCharacter() {
        return this.characterBuilder.getHero();
    }

    @Override
    public void constructCharacter(String name, Profession profession, Weapon weapon, Armor armor) {
        this.characterBuilder.buildName(name);
        this.characterBuilder.buildProfession(profession);
        this.characterBuilder.buildWeapon(weapon);
        this.characterBuilder.buildArmor(armor);
    }
}
