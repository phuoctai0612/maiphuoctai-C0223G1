package furama_management.util;

import furama_management.model.resorts.House;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadAndWriteHouse {
    public static LinkedHashMap<House,Integer> readFile(String source){
        LinkedHashMap<House,Integer> houseList=new LinkedHashMap<>();
        File file=new File(source);
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String temp="";
            while ((temp=bufferedReader.readLine())!=null&&!temp.equals("")){
               String arr[]=temp.split(",");
              House house=new House(arr[0],arr[1],Double.parseDouble(arr[2]),
                       Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7]));
              houseList.put(house,0);
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
    public static void writeFile(String fileHouse, LinkedHashMap<House,Integer> list , boolean a){
         File file=new File(fileHouse);
        try {
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (House h: list.keySet()) {
                bufferedWriter.write(h.fileHouse());
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
