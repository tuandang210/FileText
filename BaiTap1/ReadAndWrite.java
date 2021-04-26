package BaiTap1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public void readFile() {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File("FileText\\data\\numbers.txt");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileText\\data\\test.txt"));
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String[] s;
            while ((line = br.readLine()) != null) {
                s = line.split(",");
                for (int i = 0; i < s.length; i++) {
                    System.out.println(s);
                    bufferedWriter.write(s[i]);
                }
            }
            bufferedWriter.close();
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
//        return numbers;
    }
}
