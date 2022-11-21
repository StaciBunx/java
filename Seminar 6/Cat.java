public class Cat {
    Integer id;
    String name;
    String breed;
    String address;

    public Cat(Integer id, String name, String breed, String address) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.address = address;
    }

    public void sayMeow() {
        System.out.println(this.name + " сказал: Мяу!");

    }

    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nBreed: %s\nAddress: %s\n",
                id, name, breed, address);
    }



}
