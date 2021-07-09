package BaiThi.Models;

public class ExportProducts extends Production {
    private String ExportPrice;
    private String countryEntry;

    public ExportProducts() {
        System.out.println("hello");

    }

    public ExportProducts(String id, String idProduction, String nameProduction, String price, String number, String producer, String exportPrice, String countryEntry) {
        super(id, idProduction, nameProduction, price, number, producer);
        ExportPrice = exportPrice;
        this.countryEntry = countryEntry;
    }

    public String getExportPrice() {
        return ExportPrice;
    }

    public void setExportPrice(String exportPrice) {
        ExportPrice = exportPrice;
    }

    public String getCountryEntry() {
        return countryEntry;
    }

    public void setCountryEntry(String countryEntry) {
        this.countryEntry = countryEntry;
    }


    @Override
    public void showInfor() {
        System.out.println(
                " id=" + id +
                        ", idProduction='" + idProduction + '\'' +
                        ", nameProduction='" + nameProduction + '\'' +
                        ", price=" + price +
                        ", number=" + number +
                        ", producer='" + producer + '\'' +
                        "ExportPrice=" + ExportPrice +
                        ", countryEntry='" + countryEntry + '\'' +
                        '}');
    }

    @Override
    public String toString() {
        return  " id=" + id +
                ", idProduction='" + idProduction + '\'' +
                ", nameProduction='" + nameProduction + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", producer='" + producer + '\'' +
                "ExportPrice=" + ExportPrice +
                ", countryEntry='" + countryEntry + '\'' +
                '}';
    }
}
