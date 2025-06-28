package Abstract;

public class Main {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo(1, 5);
        ToaDo toaDo2 = new ToaDo(6, 12);
//        Hinh hinh1 = new Hinh(toaDo1);
        Hinh hinh2 = new HinhChuNhat(toaDo2, 10, 20);
        Hinh hinh3 = new HinhTron(toaDo1, 10);
        Hinh hinh4 = new Diem(toaDo2);

        System.out.println(hinh2.tinhDienTich());
    }
}
