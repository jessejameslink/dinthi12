package Test3.Controllers;

import Test3.Commons.FileVinfast;
import Test3.Models.Vinfast;

import java.util.ArrayList;
import java.util.Scanner;

public class VinfastController {
    private ArrayList<Vinfast> vinfasts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addVinfast() {
        vinfasts = FileVinfast.ReadVinfast();
        System.out.println("enter id ");
        String id = sc.nextLine();
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter firm");
        String firm = sc.nextLine();
        System.out.println("enter year");
        String year = sc.nextLine();
        System.out.println("enter price");
        double price = sc.nextDouble();
        System.out.println("enter engine");
        String engine = sc.nextLine();
        System.out.println("enter address");
        String address = sc.nextLine();
        Vinfast vinfast = new Vinfast(id, name, firm, year, price, engine, address);
        vinfasts.add(vinfast);
        FileVinfast.WriteVinfast(vinfasts);
        System.out.println("add success");
    }

    public void printVinfast() {
        vinfasts = FileVinfast.ReadVinfast();
        for (Vinfast vinfast : vinfasts
        ) {
            System.out.println(vinfast.toString());

        }
    }

    public void editVinfast() {
        printVinfast();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < vinfasts.size(); i++) {

            if (vinfasts.get(i).getId().equals(id)) {
                System.out.println("1. " + vinfasts.get(i).getId());
                System.out.println("2. " + vinfasts.get(i).getName());
                System.out.println("3. " + vinfasts.get(i).getFirm());
                System.out.println("4. " + vinfasts.get(i).getYear());
                System.out.println("5. " + vinfasts.get(i).getPrice());
                System.out.println("6. " + vinfasts.get(i).getEngine());
                System.out.println("6. " + vinfasts.get(i).getAddress());

                String choose = sc.nextLine();
                System.out.println("enter u want change");
                String value = sc.nextLine();
                switch (choose) {
                    case "1":
                        vinfasts.get(i).setId(value);
                        break;
                    case "2":
                        vinfasts.get(i).setName(value);
                        break;
                    case "3":
                        vinfasts.get(i).setFirm(value);
                        break;
                    case "4":
                        vinfasts.get(i).setYear(value);
                        break;
                    case "5":
                        vinfasts.get(i).setPrice(Double.parseDouble(value));
                        break;
                    case "6":
                        vinfasts.get(i).setEngine(value);
                        break;
                    case "7":
                        vinfasts.get(i).setAddress(value);
                        break;
                }
                FileVinfast.WriteVinfast(vinfasts);
                System.out.println("edit success");
                return;
            }

        }
        System.out.println("not found");
    }

    public void deleteVinfast() {
        printVinfast();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < vinfasts.size(); i++) {
            if (vinfasts.get(i).getId().equals(id)) {
                vinfasts.remove(i);
                FileVinfast.WriteVinfast(vinfasts);
                System.out.println("delete success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void searchVinfast() {
        vinfasts = FileVinfast.ReadVinfast();
        System.out.println("enter id");
        String id = sc.nextLine();
        for (int i = 0; i < vinfasts.size(); i++) {
            this.vinfasts.stream().filter(o -> o.getId().equals(id)).forEach(o-> System.out.println(o.toString()));
            return;
        }
        System.out.println("not found");
    }

}
