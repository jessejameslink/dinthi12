package Test3.View;


import Test3.Controllers.KawasakiController;
import Test3.Controllers.VinfastController;


import java.util.Scanner;

public class DisplayMenu {
    static final Scanner sc = new Scanner(System.in);
    private static KawasakiController kawasakiController = new KawasakiController();
    private static VinfastController vinfastController = new VinfastController();

    public static void menu() {
        System.out.println("1.add vehicle \n" +
                "2.show vehicle \n" +
                "3.edit vehicle \n" +
                "4.delete vehicle \n" +
                "5.search vehicle \n");
        System.out.println("enter number you want");
        String chose = sc.nextLine();
        switch (chose) {
            case "1":
                System.out.println("1.kawasaki \n" +
                        "2.vinfast");
                System.out.println("enter number you want");
                String chosecase1 = sc.nextLine();
                switch (chosecase1) {
                    case "1":

                        kawasakiController.addKawa();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":
                        vinfastController.addVinfast();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;

                }
            case "2":
                System.out.println("1.kawasaki \n" +
                        "2.vinfast");
                System.out.println("enter number you want");
                String chosecase2 = sc.nextLine();
                switch (chosecase2) {
                    case "1":

                        kawasakiController.printKawa();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        vinfastController.printVinfast();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;

                }

            case "3":
                System.out.println("1.kawasaki \n" +
                        "2.vinfast");
                System.out.println("enter number you want");
                String chosecase3 = sc.nextLine();
                switch (chosecase3) {
                    case "1":

                        kawasakiController.eidtKawa();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        vinfastController.editVinfast();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                }
            case "4":
                System.out.println("1.kawasaki \n" +
                        "2.vinfast");
                System.out.println("enter number you want");
                String chosecase4 = sc.nextLine();
                switch (chosecase4) {
                    case "1":

                        kawasakiController.deleteKawa();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        vinfastController.deleteVinfast();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                }
            case "5":
                System.out.println("1.kawasaki \n" +
                        "2.vinfast");
                System.out.println("enter number you want");
                String chosecase5 = sc.nextLine();
                switch (chosecase5) {
                    case "1":

                        kawasakiController.searchKawa();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                    case "2":

                        vinfastController.searchVinfast();
                        System.out.println("press enter to return to the menu");
                        sc.nextLine();
                        menu();
                        break;
                }
        }
    }
}
