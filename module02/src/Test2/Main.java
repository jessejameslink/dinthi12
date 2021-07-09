package Test2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  Exception {
        OverRide overRide = new OverRide("Poster", "HN");
        //    System.out.println(overRide.tong2so(10,20,3));
        Scanner sc = new Scanner(System.in);

        OverLoad overLoad = new OverLoad();
        overLoad.name = "Harry";

        overLoad.display();
        overRide.display();

        a f = new b();
        b w = new c();
        d b = new d();

        if (f instanceof b) System.out.println("f-p");
        if (w instanceof a) System.out.println("w-f");
        if (b instanceof a) System.out.println("b-f");
        java.io.PrintWriter out = new  java.io.PrintWriter(System.out,true);
        out.println("Hello");
        String [] a = {"1"};
        int p [] = {1,2,3};


        d.y y = new d.y();
        d q = (d)y;
        System.out.println(q.s1 +" "+ q.s2+" "+q.getS1());
    }
}
