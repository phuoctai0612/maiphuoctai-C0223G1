package ss16_doc_ghi_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class ReadAndWriterFile {
        public List<Integer> readFile(String filePath){
            String  a ="asdasd";
            char[] b=new char[a.length()];
            a.getChars(0, b.length, b,0);
            System.out.println(Arrays.toString(b));
            List<Integer> numbers = new ArrayList<>();
            try {
                File file = new File(filePath);

                if (!file.exists()) {
                    throw new FileNotFoundException();
                }

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine()) != null) {
                    numbers.add(Integer.parseInt(line));
                }
                br.close();
            } catch (Exception e) {
                System.err.println("Fie không tồn tại or nội dung có lỗi!");
            }
            return numbers;
        }

        public void writeFile(String filePath, int max){
            try {
                FileWriter writer = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("Giá trị lớn nhất là: " + max);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
