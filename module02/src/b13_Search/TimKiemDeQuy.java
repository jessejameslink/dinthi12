package b13_Search;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemDeQuy {
    public static void main(String[] args) {
        int arr[] = new int[9];
        arr[0] = 110;
        arr[1] = 32;
        arr[2] = 4;
        arr[3] = 66;
        arr[4] = 1170;
        arr[5] = 432;
        arr[6] = 545;
        arr[7] = 4366;
        arr[8] = 52;

        Arrays.sort(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int x = scanner.nextInt();
        int result = Interpolation(arr, 0, arr.length - 1, x);
        if (result == -1) {
            System.out.println("Element is not present in array " + x);
        } else
            System.out.println("Element is present at index " + result);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int Interpolation(int arr[], int start, int end, int x) {
        while (start<= end && x >= arr[start]&& x <= arr[end]) {
            int  pos = start + (( (end - start) / (arr[end] - arr[start])) * (x - arr[start]));
            if (arr[pos] == x) {
                return pos;
            } else if (arr[pos] < x) {
                start = pos+1;
            } else if (arr[pos] > x) {
                end = pos-1;
            }

        }
        return -1;
    }
}
