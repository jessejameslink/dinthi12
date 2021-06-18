package CaseStudy.Controller.ServiceController;

import CaseStudy.Commons.ServiceCommons.FileVilla;
import CaseStudy.Models.ServiceModels.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VillaController {
    private static final String MA_VILLA = "^VL-[0-9]{4}$";

    private static ArrayList<Villa> listVilla = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addVilla() {
        listVilla = FileVilla.getFileVilla();
        System.out.println("Please enter the correct code according to the form (VL-YYYY) with Y being the specified code");
        Pattern pattern = Pattern.compile(MA_VILLA);

        String codeService;


        while (true) {
            codeService = scanner.nextLine();
            if (pattern.matcher(codeService).find()) {
                boolean a = checkNameVilla(codeService);
                if (a == true) {
                    break;
                }
            } else
                System.out.println("You have entered the wrong form, please re-enter it");
        }

        System.out.println("Please enter the pool area you want to use (> 30m2)");
        String areaUse;
        while (true) {
            areaUse = scanner.nextLine();
            int areUse = Integer.parseInt(areaUse);
            if (areUse > 30) {
                break;
            } else
                System.out.println("You entered the wrong area, please re-enter it ");
        }

        System.out.println("Please enter cost(cost > 500)");
        String chiPhi;
        while (true) {
            chiPhi = scanner.nextLine();
            float chiPhiFloat = Float.parseFloat(chiPhi);
            if (chiPhiFloat > 500) {
                break;
            } else
                System.out.println("You entered the wrong cost, please re-enter it");
        }

        System.out.println("Please enter the number of chaperones (>0 && <20)");
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
        System.out.println("Please enter pool area(> 20m2)");
        String pool;
        while (true) {
            pool = scanner.nextLine();
            float poolFloat = Float.parseFloat(pool);

            if (poolFloat > 20) {
                break;
            } else
                System.out.println("you entered the wrong pool area, please re-enter it");
        }
        System.out.println("Please enter floor number");
        String floor;
        while (true) {
            floor = scanner.nextLine();
            int floorInt = Integer.parseInt(floor);

            if (floorInt > 0) {
                break;
            } else
                System.out.println("you have not entered the floor number");
        }


        Villa villa = new Villa(codeService, areaUse, chiPhi, numberPerson, type, tieuChuan, mota, pool, floor);
        listVilla.add(villa);
        FileVilla.WriteFileVilla(listVilla);
        System.out.println("successfully added new service");
    }

    public void showVilla() {
        listVilla = FileVilla.getFileVilla();
        for (Villa villa : listVilla
        ) {
            System.out.println("-------------------------------------");
            System.out.println("service name                    :  " + villa.getServiceName());
            System.out.println("Usable area                     : " + villa.getUsableArea());
            System.out.println("Rental cost                     : " + villa.getRentalCost());
            System.out.println("Number of people included       : " + villa.getNumberPreson());
            System.out.println("Rent type                       : " + villa.getRentalType());
            System.out.println("Room standard                   : " + villa.getRoomStandardVilla());
            System.out.println("Description of other amenities  : " + villa.getDescriptionVilla());
            System.out.println("Pool area                       : " + villa.getPoolArea());
            System.out.println("Number of floors                : " + villa.getFloorVilla());
        }
    }

    public boolean checkNameVilla(String code) {
        for (int i = 0; i < listVilla.size(); i++) {
            if (code.equals(listVilla.get(i).getServiceName())) {
                return false;
            }
        }
        return true;
    }
}


