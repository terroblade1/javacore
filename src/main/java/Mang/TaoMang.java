package Mang;

import java.util.Scanner;

public class TaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //khai báo
        double[] mang1;
        double mang2[];
        //đặt số lượng phần tử cho mảng
        mang1=new double[5];
        mang2 =new double[5];
        //cách gán phần từ cho mảng
        int[] nums;
        nums = new int[] {1, 2, 3, 4};
        //nhập phần tử mảng từ bàn phím
        for(int i = 0; i < mang1.length; i++) {
            System.out.println("nhap phan tu mang"+i+":");
            mang1[i]=scanner.nextDouble();
        }
        int Tong=0;
        //in ra mảng vừa nhập
        for(int i = 0; i < mang1.length; i++) {
            System.out.print((int)mang1[i]);
            Tong+=mang1[i];
        }
        System.out.print("\n"+Tong);
    }
}
