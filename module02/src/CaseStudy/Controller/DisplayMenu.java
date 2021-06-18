package CaseStudy.Controller;


import CaseStudy.Controller.CustomerController.CustomerController;
import CaseStudy.Controller.EmployeeController.EmployeeController;
import CaseStudy.Controller.ServiceController.HouseController;
import CaseStudy.Controller.ServiceController.RoomController;
import CaseStudy.Controller.ServiceController.VillaController;

import java.util.Scanner;

public class DisplayMenu {
    private static EmployeeController employeeController = new EmployeeController();
    private static CustomerController customerController = new CustomerController();
    public static Scanner scanner = new Scanner(System.in);

    public static void Menu() {
        System.out.println(
                "1.\tAdd New Services\n" +
                        "2.\tShow Information of Services\n" +
                        "3.\tAdd New Customer\n" +
                        "4.\tShow Information of Customer\n" +
                        "5.\tDelete Customer\n" +
                        "6.\tEdit Customer\n" +
                        "7.\tAdd New Employee\n" +
                        "8.\tShow Information of Employee\n" +
                        "9.\tDelete Employee\n" +
                        "10.\tAdd New Booking\n" +
                        "11.\tExit\n");
        System.out.println("enter number you want");
        String number = scanner.nextLine();

        switch (number) {
            case "1":
                System.out.println("1.\tAdd New Villa\n" +
                        "2.\tAdd New House\n" +
                        "3.\tAdd New Room\n");

                System.out.println("enter number you want");

                String numberService = scanner.nextLine();
                switch (numberService) {
                    case "1":
                        VillaController villa = new VillaController();
                        villa.addVilla();

                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;
                    case "2":
                        HouseController house = new HouseController();
                        house.addHouse();

                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;
                    case "3":
                        RoomController room = new RoomController();
                        room.addRoom();

                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;
                }
                break;
            case "2":
                System.out.println("1.\tShow information of Villa\n" +
                        "2.\tShow information of House\n" +
                        "3.\tShow information of Room\n");
                String numberShow = scanner.nextLine();
                switch (numberShow) {
                    case "1":
                        VillaController villa = new VillaController();
                        villa.showVilla();

                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;
                    case "2":
                        HouseController house = new HouseController();
                        house.showHouse();

                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;
                    case "3":
                        RoomController room = new RoomController();
                        room.showRoom();

                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;

                }

                break;
            case "3":

                customerController.addCustomer();
                System.out.println("press enter to return to the menu");
                scanner.nextLine();
                Menu();

                break;
            case "4":

                customerController.showCustomer();
                System.out.println("press enter to return to the menu");
                scanner.nextLine();
                Menu();

                break;
            case "5":

                customerController.deleteCustomer();
                System.out.println("press enter to return to the menu");
                scanner.nextLine();
                Menu();

                break;
            case "6":

                customerController.editCustomer();
                System.out.println("press enter to return to the menu");
                scanner.nextLine();
                Menu();

                break;
            case "7":
                System.out.println("1.\tSale-Marketing\n" +
                        "2.\t Management\n" +
                        "3.\tAdministration\n" +
                        "4.\tService\n");
                System.out.println("enter number you want");
                String chose = scanner.next();
                switch (chose) {
                    case "1":
                        employeeController.addEmployee();
                        System.out.println("press enter to return to the menu");
                        scanner.nextLine();
                        Menu();
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                }
                break;
            case "8":
                employeeController.showEmployee();
                System.out.println("press enter to return to the menu");
                scanner.nextLine();
                Menu();
                break;
            case "9":
                break;
            case "10":
                break;
            case "11":
                break;

        }
    }


}
