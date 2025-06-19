package QuanLyCuaHangDienMay;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Ngay ngaySX;
    private double giaBan;
    private int thoiGianBaoHanh;

    public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySX, double giaBan, int thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySX = ngaySX;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public String layTenQuocGiaSanXuat() {
        return this.hangSanXuat.getQuocGiaSangXuat().getTenQuocGia();
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Ngay getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Ngay ngaySX) {
        this.ngaySX = ngaySX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public boolean kiemTraGiaBanReHon(MayTinh mayTinhKhac) {
        return this.giaBan <= mayTinhKhac.giaBan;
    }

}
