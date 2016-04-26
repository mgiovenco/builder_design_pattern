
public class HeroBuilderImpl implements CharacterBuilder {
    private Character hero;

    public HeroBuilderImpl() {
        hero = new Hero();
    }

    @Override
    public void buildName(String name) {
        this.hero.setName(name);
    }

    @Override
    public void buildProfession(Profession profession) {
        this.hero.setProfession(profession);
    }

    @Override
    public void buildWeapon(Weapon weapon) {
        this.hero.setWeapon(weapon);
    }

    @Override
    public void buildArmor(Armor armor) {
        this.hero.setArmor(armor);
    }

    @Override
    public Character getHero() {
        return hero;
    }
}
