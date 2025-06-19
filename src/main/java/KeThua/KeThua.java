package KeThua;

public class KeThua {
    public static void main(String[] args) {
        Dog dog = new Dog("Kiki");
        dog.eat();
        dog.sua();
        Babydog babyDog = new Babydog("Baby");
        babyDog.eat();
        babyDog.ngu();
        Cat cat = new Cat("Tom", "white");
        cat.meow();
    }


}
