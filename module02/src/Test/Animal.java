package Test;

public abstract class Animal implements Person {

    public String name;
    public String age;

    public Animal() {
    }

    public Animal( String name, String age) {

        this.name = name;
        this.age = age;
    }



    abstract void tiengKeu(int a, int b);

    abstract String noiChuoi(String a, String b);

//
//    public Animal(String name,String age){
//        this.name = name;
//        this.Age = age;
//    }
//public void A(){
//    System.out.println("hello");
//}
//public static void B(){
//    System.out.println("xin chao");
//}

//    private String name;
//    private int age;
//
//    public Animal() {
//    }
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                '}';
//    }

}

