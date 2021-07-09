package BaiThi.View;

import BaiThi.Controllers.ExportController;
import BaiThi.Controllers.ImportController;


import java.util.Scanner;

public class DisplayMenu {
    private static ExportController exportController = new ExportController();
    private static ImportController importController = new ImportController();
    static final Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("1.add product \n" +
                "2.show product \n" +
                "3.edit product \n" +
                "4.delete product \n" +
                "5.search product \n" +
                "6.quit \n");
        System.out.println("enter number you want");
        String chose = sc.nextLine();
        switch (chose) {
            case "1":
                System.out.println("1.Export \n" +
                        "2.import");
                System.out.println("enter number you want");
                String chosecase1 = sc.nextLine();
                switch (chosecase1) {
                    case "1":

                        exportController.addexProducts();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":
                        importController.addexImproduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;

                }
            case "2":
                System.out.println("1.Export \n" +
                        "2.import");
                System.out.println("enter number you want");
                String chosecase2 = sc.nextLine();
                switch (chosecase2) {
                    case "1":

                        exportController.printExProduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        importController.printImproduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;

                }

            case "3":
                System.out.println("1.Export \n" +
                        "2.import");
                System.out.println("enter number you want");
                String chosecase3 = sc.nextLine();
                switch (chosecase3) {
                    case "1":

                        exportController.eidtExProduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        importController.eidtImproduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                }
            case "4":
                System.out.println("1.Export \n" +
                        "2.import");
                System.out.println("enter number you want");
                String chosecase4 = sc.nextLine();
                switch (chosecase4) {
                    case "1":

                        exportController.deleteExProduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        importController.deleteImproduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                }
            case "5":
                System.out.println("1.Export \n" +
                        "2.import");
                System.out.println("enter number you want");
                String chosecase5 = sc.nextLine();
                switch (chosecase5) {
                    case "1":

                        exportController.searchExProduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        importController.searchImproduct();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                }
            case "6":
                break;
        }
    }
}
