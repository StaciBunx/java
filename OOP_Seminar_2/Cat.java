public class Cat extends Animal implements SpeakAble, Runable {

    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String run() {
        return "50 km/h";
    }

    @Override
    public String speak() {
        return "mau";
    }

}
