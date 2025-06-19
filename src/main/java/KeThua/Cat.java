package KeThua;

public class Cat extends Animal{
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow(){
        System.out.println("meow meow");
    }
}
