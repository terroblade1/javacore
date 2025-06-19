package QuanLySinhVien;

public class QuanLySinhVien {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(1, "Tuan",
                new Ngay(1, 1, 2003), 6.0, new Lop("105K1", "K105"));
        SinhVien sinhVien1 = new SinhVien(2, "Tuan",
                new Ngay(1, 1, 2003), 4.0, new Lop("105K1", "K105"));
        System.out.println(sinhVien.inTenKhoa());
        System.out.println(sinhVien.kiemTraHocLuc());
        System.out.println(sinhVien.kiemTraNgaySinh(sinhVien1));
    }
}
