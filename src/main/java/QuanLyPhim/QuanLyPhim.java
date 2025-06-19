package QuanLyPhim;

public class QuanLyPhim {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(1, 1, 2003);
        HangSanXuat hs = new HangSanXuat("Netflix", "USA");
        Phim phim = new Phim("Hoan lac tung", 2003, hs, 10000, ngay1);
        Phim phim2 = new Phim("Mai mai la bao lau", 2003, hs, 10000, ngay1);

        System.out.println(phim.kiemTraGiaVeReHon(phim2));
        System.out.println(phim.giaSauKhuyenMai(50));
        System.out.println(phim.layTenHangSanXuat());
    }
}
