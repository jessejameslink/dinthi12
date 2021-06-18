package CaseStudy.Models.ServiceModels;

abstract class Service {
    //  Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    private String serviceName;
    private String usableArea;
    private String rentalCost;
    private String numberPreson;
    private String rentalType;

    public Service() {
    }

    public Service(String serviceName, String usableArea, String rentalCost, String numberPreson, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.numberPreson = numberPreson;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getNumberPreson() {
        return numberPreson;
    }

    public void setNumberPreson(String numberPreson) {
        this.numberPreson = numberPreson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
