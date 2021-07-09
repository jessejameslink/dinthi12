package BaiThi.Models;

public abstract class Production {

    String id;
    String idProduction;
    String nameProduction;
    String price;
    String number;
    String producer;

    public Production() {
    }

    public Production(String id, String idProduction, String nameProduction, String price, String number, String producer) {
        this.id = id;
        this.idProduction = idProduction;
        this.nameProduction = nameProduction;
        this.price = price;
        this.number = number;
        this.producer = producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProduction() {
        return idProduction;
    }

    public void setIdProduction(String idProduction) {
        this.idProduction = idProduction;
    }

    public String getNameProduction() {
        return nameProduction;
    }

    public void setNameProduction(String nameProduction) {
        this.nameProduction = nameProduction;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    abstract void showInfor();
}


//Sản phẩm bao gồm các thông tin: Id sản phẩm,
// Mã sản phẩm, Tên sản phẩm, Giá bán, Số lượng, Nhà sản xuất.