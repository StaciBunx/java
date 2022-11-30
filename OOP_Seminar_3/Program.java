public class Program {
    public static void main(String[] args) {

        Personal<User> users = new Personal<>();


        users.add(new User("Vasiliy", "Ivanov", 50));
        users.add(new User("Petr", "Petrov", 22));
        users.add(new User("Herman", "Sidorov", 45));
        users.add(new User("Petr", "Ivanov", 56));
        users.add(new User("Ivan", "Smirnov", 80));

        for (Node node: users) {
            System.out.println(node.getData());
        }

    }
}