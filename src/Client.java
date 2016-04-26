public class Client {

    public static void main(String[] args) {

        CharacterBuilder heroBuilder = new HeroBuilderImpl();
        CharacterDirector heroDirector = new HeroDirectorImpl(heroBuilder);

        // Build knight
        heroDirector.constructCharacter("Raymond the Guard", Profession.KNIGHT, Weapon.SWORD, Armor.CHAINMAIL);
        System.out.println(heroDirector.getCharacter());

        heroDirector.constructCharacter("Gurlack the Ugly", Profession.BARBARIAN, Weapon.AXE, Armor.LEATHER);
        System.out.println(heroDirector.getCharacter());

        heroDirector.constructCharacter("Ofezahr the Wise", Profession.WIZARD, Weapon.STAFF, Armor.CLOTH);
        System.out.println(heroDirector.getCharacter());
    }
}
