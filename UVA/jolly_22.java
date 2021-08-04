
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class jolly2 {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            String[] numbersString = line.split("\\s+");
            int[] numbers = new int[numbersString.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
            System.out.println(isJolly(numbers) ? "Jolly" : "Not jolly");
        }
        reader.close();
    }

    public static boolean isJolly(int[] array) {
        int[] result = new int[array[0]];
        for (int i = 0; i < array[0]; i++) {
            result[i] = i;
        }
        for (int i = 1; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (result.length > diff && result[diff] != 0) {
                array[0]--;
                result[diff] = 0;
            }
        }
        return array[0] == 1;
    }

}
