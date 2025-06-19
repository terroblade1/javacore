package QuanLyCuaHangDienMay;


public class QuanLyCuaHangDienMay {
    public static void main(String[] args) {
        Ngay ngaySX = new Ngay(1, 1, 2003);

        QuocGia quocGia =new QuocGia("VNI001", "Vietnam");

        HangSanXuat hang1 = new HangSanXuat("VinGR", quocGia);

        MayTinh maytinh1 = new MayTinh(hang1, ngaySX,10000.0,12);
        MayTinh maytinh2 = new MayTinh(hang1, ngaySX,15000.0,12);
        System.out.println(maytinh1.kiemTraGiaBanReHon(maytinh2));
        System.out.println(maytinh1.layTenQuocGiaSanXuat());
    }
}
