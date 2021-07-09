package BaiThi;

import BaiThi.Models.ExportProducts;

import java.util.Comparator;


public class a implements Comparable, Comparator {

    public static void main(String[] args) {
        ExportProducts exception = new ExportProducts();
        String []car = {"1","2","3"};
        System.out.println(car[1]);
        String []car1 = new String[2] ;
        car1[0] = "a";
        car1[1] = "a";
        System.out.println(car1[0]);
        int v = 10;
        int []v1 = new int[3];

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }




}
