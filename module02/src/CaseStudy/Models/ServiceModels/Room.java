package CaseStudy.Models.ServiceModels;

public class Room extends Service {
    //Dịch vụ miễn phí đi kèm.
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, String usableArea, String rentalCost, String numberPreson, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCost, numberPreson, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}

