package KeThua;

public class Horse extends Animal{
    String color;
    public Horse(String name, String color) {
        super(name);
        this.color = color;
    }
    @Override
    void eat() {
        System.out.println("an co");
    }
}
