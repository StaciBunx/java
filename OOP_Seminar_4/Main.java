public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro", 150, new Staff());

        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("John", 100, new Bow(), 10));
        red.add(new Archer("Ramzi", 100, new Bow(), 15));

        Team<Warrior> blue = new Team<>(hero1);
        blue.add(new Mage("Deineres", 90, new Staff(), 30, 100));
        blue.add(new Archer("Djorah", 120, new Bow(), 15));

        // for (Warrior item : red) {
        //     System.out.println(item);
        // }

        // System.out.println(hero1);

        System.out.println(red);
        System.out.println(blue);


    }
}
