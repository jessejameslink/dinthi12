package BaiThi.Controllers;

import BaiThi.Commons.FileExportProducts;
import BaiThi.Models.ExportProducts;

import java.util.ArrayList;

import java.util.Scanner;

public class ExportController {
    private ArrayList<ExportProducts> exportProducts = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);


    public void addexProducts() {
        exportProducts = FileExportProducts.ReadExproducts();
        System.out.println("enter id");
        String id = sc.nextLine();

        System.out.println("enter idProduction");
        String idProduction = sc.nextLine();

        System.out.println("enter nameProduction");
        String name = sc.nextLine();

        System.out.println("enter price");
        String price = sc.nextLine();

        System.out.println("enter number");
        String number = sc.nextLine();

        System.out.println("enter producer");
        String producter = sc.nextLine();

        System.out.println("enter ExportPrice");
        String ExportPrice = sc.nextLine();

        System.out.println("enter countryEntry");
        String countryEntry = sc.nextLine();

        ExportProducts kawasaki = new ExportProducts(id, name, idProduction, price, number, producter, ExportPrice, countryEntry);
        exportProducts.add(kawasaki);
        FileExportProducts.WriteExProducts(exportProducts);
        System.out.println("add success");
    }

    public void printExProduct() {
        exportProducts = FileExportProducts.ReadExproducts();
        for (ExportProducts exportProducts : exportProducts
        ) {


            exportProducts.showInfor();

        }
    }

    ////id, idProduction, nameProduction, price, number, producer);
////        ExportPrice = exportPrice;
////        this.countryEntry = countryEntry;
    public void eidtExProduct() {
        printExProduct();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < exportProducts.size(); i++) {
            if (exportProducts.get(i).getIdProduction().equals(id)) {
                System.out.println("1. " + exportProducts.get(i).getId());
                System.out.println("2. " + exportProducts.get(i).getIdProduction());
                System.out.println("3. " + exportProducts.get(i).getNameProduction());
                System.out.println("4. " + exportProducts.get(i).getPrice());
                System.out.println("5. " + exportProducts.get(i).getNumber());
                System.out.println("6. " + exportProducts.get(i).getProducer());
                System.out.println("7. " + exportProducts.get(i).getExportPrice());
                System.out.println("8. " + exportProducts.get(i).getCountryEntry());

                String choose = sc.nextLine();
                System.out.println("enter u want change");
                String value = sc.nextLine();
                switch (choose) {
                    case "1":
                        exportProducts.get(i).setId((value));
                        break;
                    case "2":
                        exportProducts.get(i).setIdProduction(value);
                        break;
                    case "3":
                        exportProducts.get(i).setNameProduction(value);
                        break;
                    case "4":
                        exportProducts.get(i).setPrice((value));
                        break;
                    case "5":
                        exportProducts.get(i).setNumber(((value)));
                        break;
                    case "6":
                        exportProducts.get(i).setProducer(value);
                        break;
                    case "7":
                        exportProducts.get(i).setExportPrice((value));
                        break;
                    case "8":
                        exportProducts.get(i).setCountryEntry(value);
                        break;
                }
                FileExportProducts.WriteExProducts(exportProducts);
                System.out.println("eidit success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void deleteExProduct() {
        printExProduct();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < exportProducts.size(); i++) {


            if (exportProducts.get(i).getIdProduction().equals(id)) {
                exportProducts.remove(i);
                FileExportProducts.WriteExProducts(exportProducts);
                System.out.println("delete success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void searchExProduct() {
        exportProducts = FileExportProducts.ReadExproducts();
        System.out.println("enter id");
        String id = sc.nextLine();
        for (int i = 0; i < exportProducts.size(); i++) {
            this.exportProducts.stream().filter(o -> o.getIdProduction().equals(id)).forEach(o -> System.out.println(o.toString()));
            return;
        }
        System.out.println("not found");
    }

    //sắp xếp
//    public class CompareNameYear implements Comparator<Kawasaki> {
//        @Override
//        public int compare(Kawasaki o1, Kawasaki o2) {
//            int nameCompare = o1.getName().compareTo(o2.getColorKawa());
//            int yearCustomerFirst = Integer.parseInt(o1.getYear().split("/")[2]);
//            int yearCustomerSecond = Integer.parseInt(o2.getYear().split("/")[2]);
//            int result = yearCustomerFirst - yearCustomerSecond;
//            return (nameCompare == 0) ? result : nameCompare;
//        }
//    }
}
