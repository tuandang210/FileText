package BaiTap2;

import java.io.*;

public class ReadAndWriteCsv {
    public static void main(String[] args) throws Exception {
        String a;
        String[] arr;
        File file = new File("FileText\\data\\nothing.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileText\\data\\file.csv"));
        while ((a = bufferedReader.readLine()) != null){
            arr = a.split(",");
            for(String s : arr){
                System.out.println(s+" ");
                bufferedWriter.write(s+" ");
            }
            bufferedWriter.newLine();
            System.out.println();
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
