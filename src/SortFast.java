import java.util.Arrays;
import java.util.Random;


public class SortFast {

    public static void main(String[] args) {

        int[] mas = new int [20];

        long start = System.currentTimeMillis();

        for (int i=0; i<mas.length; i++){
            Random rand = new Random();
            mas[i] = rand.nextInt(5);
        }
        System.out.println(Arrays.toString(mas));

        Arrays.sort(mas);

        long end = System.currentTimeMillis();

        //System.out.println();
        System.out.println(Arrays.toString(mas));
        System.out.println("time to sort: " + (end - start));
    }
}
