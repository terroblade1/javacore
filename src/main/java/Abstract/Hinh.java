package Abstract;

public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }
    public abstract double tinhDienTich();
}
