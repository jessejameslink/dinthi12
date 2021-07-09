package Test;

import java.util.Scanner;

public class DemoClass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println(Animal.Age);
        //Animal animal =new Animal("A","12");
        //System.out.println(animal.Age);
        //System.out.println(animal.name);

        //Animal.B();
        //animal.A();
//        System.out.println("enter number need ");
//        int number = scanner.nextInt();
//
//        Animal[] animals = new Animal[number];
//
//        for (int i = 0; i < animals.length; i++) {
//            System.out.println("enter name");
//            scanner.nextLine();
//            String name = scanner.nextLine();
//            System.out.println("enter age");
//            int age = scanner.nextInt();
//            animals[i] = new Animal(name, age);
//        }
//
//        for (Animal animal:animals
//             ) {
//            System.out.println(animal.getName()+" "+ animal.getAge());
//
//        }
        Vinfast vinfast = new Vinfast();
        Vehice vehice = new Vinfast();


        Animal animal2 = new Vinfast();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.name = "Harry";
        cat.name = "burh";
        System.out.println("enter first name of dog");
        dog.setFirstName(scanner.nextLine());

        dog.tiengKeu(10, 20);

        Animal animal = new Dog("Nâu");


        animal.name = "Black";
        animal.tiengKeu(30, 20);
        System.out.println("-----------");
        System.out.println(
                cat.run("ahihi","ahuhu")
        );
        System.out.println( cat.run(10.23f,20,30));
        System.out.println("-----------");
        System.out.println("enter chuoi a");
        vinfast.noiChuoi("meo meo" , "hu hu");
        System.out.println(cat.tinhthong(20,30));
        System.out.println(vinfast.tinhthong(30,10));

        

    }
}

