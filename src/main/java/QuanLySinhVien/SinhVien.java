package QuanLySinhVien;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private Ngay ngaySinh;
    private double diemTB;
    private Lop lopSV;

    public SinhVien(int maSV, String hoTen, Ngay ngaySinh, double diemTB, Lop lopSV) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.lopSV = lopSV;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLopSV() {
        return lopSV;
    }

    public void setLopSV(Lop lopSV) {
        this.lopSV = lopSV;
    }

    public String inTenKhoa(){
        return this.lopSV.getTenKhoa();
    }
    public boolean kiemTraHocLuc(){
        return this.diemTB>=5.0;
    }
    public boolean kiemTraNgaySinh(SinhVien sinhVienKhac){
        return this.ngaySinh.equals(sinhVienKhac.ngaySinh);
    }
}
