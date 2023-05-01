package furama_management.util;

import furama_management.model.resorts.Room;
import furama_management.model.resorts.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadAndWriteRoom {
    public static LinkedHashMap<Room, Integer> readFile(String source) {
        LinkedHashMap<Room, Integer> roomList = new LinkedHashMap<>();
        File file = new File(source);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String arr[] = temp.split(",");
                Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]),
                        Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
                roomList.put(room, 0);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public static void writeFile(String fileRoom, LinkedHashMap<Room, Integer> list, boolean a) {
        File file = new File(fileRoom);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room h : list.keySet()) {
                bufferedWriter.write(h.fileRoom());
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
