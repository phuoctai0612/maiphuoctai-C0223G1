package ss16_doc_ghi_file.bai_tap.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        String PRINT = "src/ss16_doc_ghi_file/bai_tap/bai_1/codegym";
        File file = new File(PRINT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Lô Các Bạn");
            bufferedWriter.newLine();
            bufferedWriter.write("Lô Các Bạn");
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println("Tệp không tồn tại");
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file1 = new File(PRINT);
        FileReader fileReader = null;
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file1);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
                list.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }






        String PRINTLN = "src/ss16_doc_ghi_file/bai_tap/bai_1/codegymother";
        File file2 = new File(PRINTLN);
        FileWriter fileWriter1 = null;
        BufferedWriter bufferedWriter1 = null;
        int count = 0;
        try {
            fileWriter1 = new FileWriter(file2);
            bufferedWriter1 = new BufferedWriter(fileWriter1);
            for (String s : list) {
                bufferedWriter1.write(s);
                bufferedWriter1.newLine();
                count += s.length();
            }
            bufferedWriter1.write("Số phần tử là: "+count);
            bufferedWriter1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
