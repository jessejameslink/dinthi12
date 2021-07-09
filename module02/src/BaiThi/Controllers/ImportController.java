package BaiThi.Controllers;


import BaiThi.Commons.FileImprot;
import BaiThi.Models.ImportedProducts;

import java.util.ArrayList;
import java.util.Scanner;

public class ImportController {
    private ArrayList<ImportedProducts> importedProducts = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
//super(id, idProduction, nameProduction, price, number, producer);
//        this.priceImport = priceImport;
//        this.provinceImport = provinceImport;
//        this.taxImport = taxImport;

    public void addexImproduct() {
        importedProducts = FileImprot.ReadImproducts();
        System.out.println("enter id");
        String id = sc.nextLine();

        String idProduction;
        System.out.println("enter idProduction");
        while (true) {
            idProduction = sc.nextLine();
            if (idProduction != null) {
                break;
            } else System.out.println("You entered the wrong, please re-enter it ");
        }

        System.out.println("enter nameProduction");
        String name = sc.nextLine();

        System.out.println("enter price");
        String price;
        while (true) {
            price = sc.nextLine();
            int price1 = Integer.parseInt(price);

            if (price1 > 0) {
                break;
            } else System.out.println("You entered the wrong, please re-enter it ");

        }

        System.out.println("enter number");
        String number = sc.nextLine();

        System.out.println("enter producer");
        String producter = sc.nextLine();

        System.out.println("enter priceImport");
        String priceImport = sc.nextLine();

        System.out.println("enter provinceImport");
        String provinceImport = sc.nextLine();
        System.out.println("enter tax");
        String tax = sc.nextLine();
        ImportedProducts im = new ImportedProducts(id, name, idProduction, price, number, producter, priceImport, provinceImport, tax);
        importedProducts.add(im);
        FileImprot.WriteImproducts(importedProducts);
        System.out.println("add success");
    }

    public void printImproduct() {
        importedProducts = FileImprot.ReadImproducts();
        for (ImportedProducts importedProducts : importedProducts
        ) {


            importedProducts.showInfor();

        }
    }

    ////id, idProduction, nameProduction, price, number, producer);
////        ExportPrice = exportPrice;
////        this.countryEntry = countryEntry;
    public void eidtImproduct() {
        printImproduct();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < importedProducts.size(); i++) {
            if (importedProducts.get(i).getIdProduction().equals(id)) {
                System.out.println("1. " + importedProducts.get(i).getId());
                System.out.println("2. " + importedProducts.get(i).getIdProduction());
                System.out.println("3. " + importedProducts.get(i).getNameProduction());
                System.out.println("4. " + importedProducts.get(i).getPrice());
                System.out.println("5. " + importedProducts.get(i).getNumber());
                System.out.println("6. " + importedProducts.get(i).getProducer());
                System.out.println("7. " + importedProducts.get(i).getPriceImport());
                System.out.println("8. " + importedProducts.get(i).getProvinceImport());
                System.out.println("9. " + importedProducts.get(i).getTaxImport());
                String choose = sc.nextLine();
                System.out.println("enter u want change");
                String value = sc.nextLine();
                switch (choose) {
                    case "1":
                        importedProducts.get(i).setId((value));
                        break;
                    case "2":
                        importedProducts.get(i).setIdProduction(value);
                        break;
                    case "3":
                        importedProducts.get(i).setNameProduction(value);
                        break;
                    case "4":
                        importedProducts.get(i).setPrice((value));
                        break;
                    case "5":
                        importedProducts.get(i).setNumber(((value)));
                        break;
                    case "6":
                        importedProducts.get(i).setProducer(value);
                        break;
                    case "7":
                        importedProducts.get(i).setPriceImport((value));
                        break;
                    case "8":
                        importedProducts.get(i).setProvinceImport(value);
                        break;
                    case "9":
                        importedProducts.get(i).setTaxImport(value);
                        break;
                }
                FileImprot.WriteImproducts(importedProducts);
                System.out.println("eidit success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void deleteImproduct() {
        printImproduct();
        System.out.println("enter id you want");
        String id = sc.nextLine();
        for (int i = 0; i < importedProducts.size(); i++) {


            if (importedProducts.get(i).getIdProduction().equals(id)) {
                importedProducts.remove(i);
                FileImprot.WriteImproducts(importedProducts);
                System.out.println("delete success");
                return;
            }
        }
        System.out.println("not found");
    }

    public void searchImproduct() {
        importedProducts = FileImprot.ReadImproducts();
        System.out.println("enter id");
        String id = sc.nextLine();
        for (int i = 0; i < importedProducts.size(); i++) {
            this.importedProducts.stream().filter(o -> o.getIdProduction().equals(id)).forEach(o -> System.out.println(o.toString()));
            return;
        }
        System.out.println("not found");
    }
}
