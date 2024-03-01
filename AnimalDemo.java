package Lab6_Animal;

public class AnimalDemo {
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        System.out.println("Cat says: \n"+cat.say());
        System.out.println("\nDog says: \n"+dog.say());
        System.out.println("\nDuck says: \n"+duck.say());
    }
}
