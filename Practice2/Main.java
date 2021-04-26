package Practice2;

import java.util.List;

public class Main {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<Integer> numbers = readAndWrite.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWrite.writeFile("FileText\\data\\result.txt", maxValue);
    }
}
