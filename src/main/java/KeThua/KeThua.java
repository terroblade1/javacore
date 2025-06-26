package KeThua;

public class KeThua {
    public static void main(String[] args) {
        Birth birth = new Birth("Bo Cau", "trang");
        birth.eat();
        Horse horse = new Horse("Xich Tho", "nau");
        horse.eat();
        ToanHoc toanHoc = new ToanHoc();

        System.out.println(toanHoc.timMin(10, 20));
        System.out.println((float) toanHoc.timMin(10.3, 3.2));

    }


}
