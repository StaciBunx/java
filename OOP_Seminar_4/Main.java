public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro", 150, new Staff(), new Kite());

        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("John", 100, new Bow(), 10, new Kite()));
        red.add(new Archer("Ramzi", 100, new Bow(), 15, new Kite()));

        Team<Warrior> blue = new Team<>(hero1);
        blue.add(new Mage("Deineres", 90, new Staff(), 30, 100, new Heater()));
        blue.add(new Archer("Djorah", 120, new Bow(), 15, new Kite()));

        System.out.println(red);
        System.out.println(blue);

        // System.out.println(red.getTeamHP());

    }
}
