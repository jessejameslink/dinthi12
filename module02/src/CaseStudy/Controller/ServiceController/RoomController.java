package CaseStudy.Controller.ServiceController;
import CaseStudy.Commons.ServiceCommons.FileRoom;
import CaseStudy.Models.ServiceModels.Room;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

enum Service {
        KARAOKE("kara"),
        MASSAGE("mass"),
        FOOD("food"),
        DRINK("drink"),
        NOCHOSE("khong"),
        CAR("car");
private String line;


private Service(String line) {
        this.line = line;
        }

public String getService() {
        return line;
        }
        }

public class RoomController {
    private static final String MA_HOUSE = "^RO-[0-9]{4}$";

    private static ArrayList<Room> listRoom = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addRoom() {
        listRoom = FileRoom.getFileRoom();
        System.out.println("Please enter the correct code according to the form (RO-YYYY) with Y being the specified code");
        Pattern pattern = Pattern.compile(MA_HOUSE);

        String codeHouse;

        while (true) {
            codeHouse = scanner.nextLine();
            if (pattern.matcher(codeHouse).find()) {
                boolean a = checkNameRoom(codeHouse);
                if (a == true) {
                    break;
                }
            } else
                System.out.println("You have entered the wrong form, please re-enter it");
        }

        System.out.println("Please enter the usable area you want to use (> 30m2)");
        String areaUse;
        while (true) {
            areaUse = scanner.nextLine();
            int areUse = Integer.parseInt(areaUse);
            if (areUse > 30) {
                break;
            } else
                System.out.println("You entered the wrong area, please re-enter it ");
        }

        System.out.println("Please enter cost(cost > 300)");
        String chiPhi;
        while (true) {
            chiPhi = scanner.nextLine();
            float chiPhiFloat = Float.parseFloat(chiPhi);
            if (chiPhiFloat > 300) {
                break;
            } else
                System.out.println("You entered the wrong cost, please re-enter it");
        }

        System.out.println("Please enter the number of chaperones (>0 && <10)");
        String numberPerson;
        while (true) {
            numberPerson = scanner.nextLine();
            int numberPersonInt = Integer.parseInt(numberPerson);
            if (numberPersonInt > 0 && numberPersonInt < 20) {
                break;
            } else
                System.out.println("You entered the wrong number of chaperones, please re-enter it");
        }
        System.out.println("Please enter rental type");
        String type;
        while (true) {
            type = scanner.nextLine();
            if (type != null) {
                break;
            } else
                System.out.println("you have not entered the rental type");
        }
        System.out.println("Please enter free service");
        Service karaoke = Service.KARAOKE;
        Service massage = Service.MASSAGE;
        Service food = Service.FOOD;
        Service drink = Service.DRINK;
        Service car = Service.CAR;
        Service nochose = Service.NOCHOSE;
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            line = scanner.nextLine();
            if (karaoke.getService().equalsIgnoreCase(line)) {
                break;
            } else if (massage.getService().equalsIgnoreCase(line)) {
                break;
            } else if (food.getService().equalsIgnoreCase(line)) {
                break;
            } else if (drink.getService().equalsIgnoreCase(line)) {
                break;
            } else if (car.getService().equalsIgnoreCase(line)) {
                break;
            } else if (nochose.getService().equalsIgnoreCase(line)) {
                System.out.println("you do not use the bundled service");
                break;
            } else
                System.out.println("you entered wrong");

        }


        Room room = new Room(codeHouse, areaUse, chiPhi, numberPerson, type, line);
        listRoom.add(room);
        FileRoom.WriteFileRoom(listRoom);
        System.out.println("successfully added new service");
    }

    public void showRoom() {
        listRoom = FileRoom.getFileRoom();
        for (Room room : listRoom
        ) {
            System.out.println("-------------------------------------");
            System.out.println("service name                    :  " + room.getServiceName());
            System.out.println("Usable area                     : " + room.getUsableArea());
            System.out.println("Rental cost                     : " + room.getRentalCost());
            System.out.println("Number of people included       : " + room.getNumberPreson());
            System.out.println("Rent type                       : " + room.getRentalType());
            System.out.println("Room standard                   : " + room.getFreeServiceIncluded());

        }
    }
    public boolean checkNameRoom(String code) {
        for (int i = 0; i < listRoom.size(); i++) {
            if (code.equals(listRoom.get(i).getServiceName())) {
                return false;
            }
        }
        return true;
    }
}
