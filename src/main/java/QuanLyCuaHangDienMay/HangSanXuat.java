package QuanLyCuaHangDienMay;

public class HangSanXuat {
    private String tenHangSanXuat;
    private QuocGia quocGiaSangXuat;

    public HangSanXuat(String tenHangSanXuat, QuocGia quocGiaSangXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGiaSangXuat = quocGiaSangXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public QuocGia getQuocGiaSangXuat() {
        return quocGiaSangXuat;
    }

    public void setQuocGiaSangXuat(QuocGia quocGiaSangXuat) {
        this.quocGiaSangXuat = quocGiaSangXuat;
    }
}
