package Test3.Controllers;

import Test3.Commons.FileKawa;
import Test3.Models.Kawasaki;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class KawasakiController {

    private ArrayList<Kawasaki> kawasakiList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);


    public void addKawa() {
        kawasakiList = FileKawa.ReadKawa();
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
        System.out.println("enter color");
        String color = sc.nextLine();
        Kawasaki kawasaki = new Kawasaki(id, name, firm, year, price, color);
        kawasakiList.add(kawasaki);
        FileKawa.WriteKawa(kawasakiList);
        System.out.println("add success");
    }

    public void printKawa() {
        kawasakiList = FileKawa.ReadKawa();
        for (Kawasaki kawa : kawasakiList
        ) {
            Collections.sort(kawasakiList, new CompareNameYear());

            kawa.print();

        }
    }

    public void eidtKawa() {
        printKawa();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < kawasakiList.size(); i++) {
            if (kawasakiList.get(i).getId().equals(id)) {
                System.out.println("1. " + kawasakiList.get(i).getId());
                System.out.println("2. " + kawasakiList.get(i).getName());
                System.out.println("3. " + kawasakiList.get(i).getFirm());
                System.out.println("4. " + kawasakiList.get(i).getYear());
                System.out.println("5. " + kawasakiList.get(i).getPrice());
                System.out.println("6. " + kawasakiList.get(i).getColorKawa());
                String choose = sc.nextLine();
                System.out.println("enter u want change");
                String value = sc.nextLine();
                switch (choose) {
                    case "1":
                        kawasakiList.get(i).setId(value);
                        break;
                    case "2":
                        kawasakiList.get(i).setName(value);
                        break;
                    case "3":
                        kawasakiList.get(i).setFirm(value);
                        break;
                    case "4":
                        kawasakiList.get(i).setYear(value);
                        break;
                    case "5":
                        kawasakiList.get(i).setPrice(Double.parseDouble((value)));
                        break;
                    case "6":
                        kawasakiList.get(i).setColorKawa(value);
                        break;
                }
                FileKawa.WriteKawa(kawasakiList);
                System.out.println("eidit success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void deleteKawa() {
        printKawa();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < kawasakiList.size(); i++) {


            if (kawasakiList.get(i).getId().equals(id)) {
                kawasakiList.remove(i);
                FileKawa.WriteKawa(kawasakiList);
                System.out.println("delete success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void searchKawa() {
        kawasakiList = FileKawa.ReadKawa();
        System.out.println("enter id");
        String id = sc.nextLine();
        for (int i = 0; i < kawasakiList.size(); i++) {
            this.kawasakiList.stream().filter(o -> o.getId().equals(id)).forEach(o -> System.out.println(o.toString()));
            return;
        }
        System.out.println("not found");
    }

//sắp xếp
public class CompareNameYear implements Comparator<Kawasaki> {
    @Override
    public int compare(Kawasaki o1, Kawasaki o2) {
        int nameCompare = o1.getName().compareTo(o2.getColorKawa());
        int yearCustomerFirst = Integer.parseInt(o1.getYear().split("/")[2]);
        int yearCustomerSecond = Integer.parseInt(o2.getYear().split("/")[2]);
        int result = yearCustomerFirst - yearCustomerSecond;
        return (nameCompare == 0) ? result : nameCompare;
    }
}
}