package CaseStudy.Controller.ServiceController;

import CaseStudy.Commons.ServiceCommons.FileHouse;
import CaseStudy.Models.ServiceModels.House;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
public class HouseController {
    private static final String MA_HOUSE = "^HO-[0-9]{4}$";

    private static ArrayList<House> listHouse = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addHouse() {
        listHouse = FileHouse.getFileHouse();
        System.out.println("Please enter the correct code according to the form (HO-YYYY) with Y being the specified code");
        Pattern pattern = Pattern.compile(MA_HOUSE);

        String codeHouse;

        while (true) {
            codeHouse = scanner.nextLine();
            if (pattern.matcher(codeHouse).find()) {
                boolean a = checkNameHouse(codeHouse);
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

        System.out.println("Please enter cost(cost > 400)");
        String chiPhi;
        while (true) {
            chiPhi = scanner.nextLine();
            float chiPhiFloat = Float.parseFloat(chiPhi);
            if (chiPhiFloat > 400) {
                break;
            } else
                System.out.println("You entered the wrong cost, please re-enter it");
        }

        System.out.println("Please enter the number of chaperones (>0 && <15)");
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
        System.out.println("Please enter room standard");
        String tieuChuan;
        while (true) {
            tieuChuan = scanner.nextLine();
            if (tieuChuan != null) {
                break;
            } else
                System.out.println("you have not entered the room standard");
        }
        System.out.println("Please enter room description");
        String mota;
        while (true) {
            mota = scanner.nextLine();
            if (mota != null) {
                break;
            } else
                System.out.println("you have not entered the room description");
        }
        System.out.println("Please enter floor number(> 0 && <4");
        String floor;
        while (true) {
            floor = scanner.nextLine();
            int floorInt = Integer.parseInt(floor);

            if (floorInt > 0 && floorInt < 4) {
                break;
            } else
                System.out.println("you have not entered the floor number");
        }


        House house = new House(codeHouse, areaUse, chiPhi, numberPerson, type, tieuChuan, mota, floor);
        listHouse.add(house);
        FileHouse.WriteFileHouse(listHouse);
        System.out.println("successfully added new service");
    }

    public void showHouse() {
        listHouse = FileHouse.getFileHouse();
        for (House house : listHouse
        ) {
            System.out.println("-------------------------------------");
            System.out.println("service name                    :  " + house.getServiceName());
            System.out.println("Usable area                     : " + house.getUsableArea());
            System.out.println("Rental cost                     : " + house.getRentalCost());
            System.out.println("Number of people included       : " + house.getNumberPreson());
            System.out.println("Rent type                       : " + house.getRentalType());
            System.out.println("Room standard                   : " + house.getRoomStandardHouse());
            System.out.println("Description of other amenities  : " + house.getDescriptionHouse());
            System.out.println("Number of floors                : " + house.getFloorHouse());
        }
    }
    public boolean checkNameHouse(String code) {
        for (int i = 0; i < listHouse.size(); i++) {
            if (code.equals(listHouse.get(i).getServiceName())) {
                return false;
            }
        }
        return true;
    }
}
