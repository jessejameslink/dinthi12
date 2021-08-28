package bean;

public class DichVu {
   private int id_DichVu ;
   private String TenDichVu ;
    private String DonGia ;

    public DichVu(){}

    public DichVu(int id_DichVu, String tenDichVu, String donGia) {
        this.id_DichVu = id_DichVu;
        TenDichVu = tenDichVu;
        DonGia = donGia;
    }
    public DichVu(int id_DichVu, String tenDichVu) {
        this.id_DichVu = id_DichVu;
        TenDichVu = tenDichVu;
    }
    public DichVu( String tenDichVu, String donGia) {
        TenDichVu = tenDichVu;
        DonGia = donGia;
    }

    public int getId_DichVu() {
        return id_DichVu;
    }

    public void setId_DichVu(int id_DichVu) {
        this.id_DichVu = id_DichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        TenDichVu = tenDichVu;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String donGia) {
        DonGia = donGia;
    }
}
