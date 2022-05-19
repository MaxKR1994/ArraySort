import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class ZeroSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(5);
        }
        System.out.println(Arrays.toString(array));
        array = IntStream.of(array).boxed()
                .sorted(Comparator.comparing(i -> i == 0 ? -1 : i > 0 ? 1 : 0))
                .mapToInt(Integer::intValue).toArray();
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println("time to sort: " + (end - start));
    }
}
