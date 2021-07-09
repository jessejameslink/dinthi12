package BaiThi.Models;

public class ImportedProducts extends Production {
    private String priceImport;
    private String provinceImport;
    private String taxImport;

    public ImportedProducts() {

    }

    public ImportedProducts(String id, String idProduction, String nameProduction, String price, String number, String producer, String priceImport, String provinceImport, String taxImport) {
        super(id, idProduction, nameProduction, price, number, producer);
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.taxImport = taxImport;
    }

    public String getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(String priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public String getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(String taxImport) {
        this.taxImport = taxImport;
    }

    @Override
    public void showInfor() {
        System.out.println("id=" + id +
                ", idProduction='" + idProduction + '\'' +
                ", nameProduction='" + nameProduction + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", producer='" + producer + '\'' +
                "priceImport=" + priceImport +
                ", provinceImport='" + provinceImport + '\'' +
                ", taxImport='" + taxImport + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", idProduction='" + idProduction + '\'' +
                ", nameProduction='" + nameProduction + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", producer='" + producer + '\'' +
                "priceImport=" + priceImport +
                ", provinceImport='" + provinceImport + '\'' +
                ", taxImport='" + taxImport + '\'' +
                '}';
    }
}
//Đối với sản phẩm nhập khẩu sẽ có thêm các thông tin:
// Giá nhập khẩu, Tỉnh thành nhập, Thuế nhập khẩu.