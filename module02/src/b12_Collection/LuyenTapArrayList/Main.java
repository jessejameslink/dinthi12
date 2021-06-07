package b12_Collection.LuyenTapArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerProduct method = new ManagerProduct();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter 1: insert product");
            System.out.println("enter 2: show product");
            System.out.println("enter 3: delete product");
            System.out.println("enter 4: search product by name");
            System.out.println("enter 0: exit");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("enter id of product");
                    long id = scanner.nextLong();
                    System.out.println("enter name of product");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("enter price of product");
                    String price = scanner.nextLine();

                    Product product = new Product(id,name,price);
                    method.add(product);
                    System.out.println("insert successful");
                    break;
                case 2:
                    System.out.println("information of product");
                    method.show();
                    break;
                case 3:
                    System.out.println("enter id of product");
                    long idProduct = scanner.nextLong();
                    method.removed(idProduct);
                    break;
                case 4:
                    System.out.println("enter id of product");
                    long idOfProduct = scanner.nextInt();
                    method.searchOfName(idOfProduct);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
