package KeThua;

public class Birth extends Animal{
    String color;

    public Birth(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    void eat() {
        System.out.println("an thoc");
    }
}
