package furama_management.util;
import furama_management.model.resorts.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadAndWriteVilla {
    public static LinkedHashMap<Villa,Integer> readFile(String source){
        LinkedHashMap<Villa,Integer> houseList=new LinkedHashMap<>();
        File file=new File(source);
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String temp="";
            while ((temp=bufferedReader.readLine())!=null&&!temp.equals("")){
                String arr[]=temp.split(",");
               Villa villa= new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),
                        Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6]
                       ,Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
               houseList.put(villa,0);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
    public static void writeFile(String fileHouse,LinkedHashMap<Villa,Integer> list ,boolean a){
        File file=new File(fileHouse);
        try {
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (Villa h: list.keySet()) {
                bufferedWriter.write(h.fileVilla());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
