package Abstract;

public class HinhChuNhat extends Hinh{
    private double rong,cao;

    public HinhChuNhat(ToaDo toaDo, double rong, double cao) {
        super(toaDo);
        this.rong = rong;
        this.cao = cao;
    }

    @Override
    public double tinhDienTich() {
        return this.rong * this.cao;
    }
}
