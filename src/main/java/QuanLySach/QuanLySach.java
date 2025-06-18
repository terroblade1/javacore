package QuanLySach;

import java.time.LocalDate;

public class QuanLySach {
    public static void main(String[] args) {
        Ngay ngay = new Ngay(1,1, LocalDate.now().getYear());
        Ngay ngay2 = new Ngay(2,1, LocalDate.now().getYear());
        Ngay ngay3 = new Ngay(3,1, LocalDate.now().getYear());

        TacGia tacGia = new TacGia("Tuan", ngay);
        TacGia tacGia2 = new TacGia("Tuan", ngay2);
        TacGia tacGia3 = new TacGia("Tuan", ngay3);

        Sach sach = new Sach("Hoan lac tung", tacGia, 1000,
                LocalDate.now().getYear());
        Sach sach1=new Sach("Mai mai la bao lau",tacGia2,10000,2003);
        Sach sach2=new Sach("Hello word",tacGia3,10000,2003);
        sach.inTenSach();
        boolean s=sach.kiemTraCungNam(sach1);
        System.out.println(s);
        System.out.println(sach.giaSauKhiBan(0.5));

    }
}
