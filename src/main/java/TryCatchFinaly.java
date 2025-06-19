import java.util.Scanner;

public class TryCatchFinaly {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        try {
            System.out.println("nhap so nguyen");
            n=scanner.nextInt();
        }
        catch (Exception e ){ //Exception là class chứa tất cả các lỗi có thể xử lý
            System.out.println("nhap sai");
        }

        System.out.println(n+ "endl");
    }
}
