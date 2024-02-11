public class Homework20Program {
    public static void main(String[] args) {
        Client alice = new Client("Alice", "White", 11, "February", 1996,
                "alice@gmail.com", 532125365L, 53, "60/120", 500);
        Client bob = new Client("Bob", "Johnnes", 02, "February", 1992,
                "bob@gmail.com", 534445365L, 72, "70/122", 900);
        Client mary = new Client("Mary", "Holmes", 05, "February", 1982,
                "mary@gmail.com", 545465888L, 65, "70/122", 400);

        alice.printAccount();
        bob.printAccount();
        mary.printAccount();

        System.out.println("_______________________________");

        alice.setSurname("Black");
        alice.setSteps(1200);
        alice.setPressure("82/140");
        alice.setWeight(50);

        mary.setSurname("Smith");
        alice.setSteps(800);
        alice.setPressure("82/140");
        alice.setWeight(59);

        alice.printAccount();
        mary.printAccount();
    }
}
