package QuanLySach;

public class Sach {
    private String tenSach;
    private TacGia tacGia;
    private double giaBan;
    private int namXuatBan;

    void inTenSach() {
        System.out.println(tenSach);
    }

    boolean kiemTraCungNam(Sach sachKhac) {
        return this.namXuatBan == sachKhac.namXuatBan;
    }

    double giaSauKhiBan(double x) {
        return this.giaBan * x;
    }

    public Sach(String tenSach, TacGia tacGia, double giaBan, int namXuatBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

}
