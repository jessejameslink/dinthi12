package CaseStudy.Models.ServiceModels;

public class Villa extends Service {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    private String roomStandardVilla;
    private String descriptionVilla;
    private String poolArea;
    private String floorVilla;

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String rentalCost, String numberPreson, String rentalType, String roomStandardVilla, String descriptionVilla, String poolArea, String floorVilla) {
        super(serviceName, usableArea, rentalCost, numberPreson, rentalType);
        this.roomStandardVilla = roomStandardVilla;
        this.descriptionVilla = descriptionVilla;
        this.poolArea = poolArea;
        this.floorVilla = floorVilla;
    }


    public String getRoomStandardVilla() {
        return roomStandardVilla;
    }

    public void setRoomStandardVilla(String roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public String getDescriptionVilla() {
        return descriptionVilla;
    }

    public void setDescriptionVilla(String descriptionVilla) {
        this.descriptionVilla = descriptionVilla;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(String floorVilla) {
        this.floorVilla = floorVilla;
    }
}
