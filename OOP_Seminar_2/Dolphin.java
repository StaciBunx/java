public class Dolphin extends Animal implements SwimAble{

    public Dolphin(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String swim() {
        return "50 km/h";
    }

}
