import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery1 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Write 7 numbers from 0 to 9: ");

        int[] playerNumbers = new int[7];
        for (int i = 0; i < playerNumbers.length; i++) {
            playerNumbers[i] = Integer.parseInt(READER.readLine());
        }

        int[] casinoNumbers = new int[7];
        for (int c = 0; c < casinoNumbers.length; c++) {
            casinoNumbers[c] = (int) (Math.random() * 10);
        }
        Arrays.sort(playerNumbers);
        Arrays.sort(casinoNumbers);
        System.out.println("Your numbers: " + Arrays.toString(playerNumbers));
        System.out.println("Casino numbers: " + Arrays.toString(casinoNumbers));
        int j = 0;
        for (int m = 0; m < 7; m++) {
            if (playerNumbers[m] == casinoNumbers[m]) {
                System.out.println("Matched number: " + (m+1) );
                j++;
            }
        }
        System.out.println("Total matched: " + j + " numbers.");
    }
}
