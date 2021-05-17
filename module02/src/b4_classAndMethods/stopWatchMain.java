package b4_classAndMethods;
import java.lang.reflect.Array;
import java.util.Arrays;
public class stopWatchMain {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int) (Math.random() * 100000);
        }
        stopWatch stopWatch = new stopWatch();
        Arrays.sort(arr);
        stopWatch.stop();
        System.out.println("thoi gian tra ve "+ stopWatch.getTime());

    }
}
