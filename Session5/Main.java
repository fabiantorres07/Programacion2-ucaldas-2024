public class Main {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Batman", 2, new String[] { "Be richest", "Intelligent" }, true, 1);
        Superhero hero2 = new Superhero("Superman", 2, new String[] { "Eyes laser", "Fly" }, true, 1);
        System.out.println(hero.superhero_name);
        hero.showPowers();
        System.out.println(hero2.superhero_name);
        hero2.showPowers();
    }
}