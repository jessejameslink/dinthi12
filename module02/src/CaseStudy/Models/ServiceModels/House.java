package CaseStudy.Models.ServiceModels;

public class House extends Service {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private String roomStandardHouse;
    private String descriptionHouse;
    private String floorHouse;

    public House() {
    }

    public House(String serviceName, String usableArea, String rentalCost, String numberPreson, String rentalType, String roomStandardHouse, String descriptionHouse, String floorHouse) {
        super(serviceName, usableArea, rentalCost, numberPreson, rentalType);
        this.roomStandardHouse = roomStandardHouse;
        this.descriptionHouse = descriptionHouse;
        this.floorHouse = floorHouse;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public String getDescriptionHouse() {
        return descriptionHouse;
    }

    public void setDescriptionHouse(String descriptionHouse) {
        this.descriptionHouse = descriptionHouse;
    }

    public String getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(String floorHouse) {
        this.floorHouse = floorHouse;
    }

}
