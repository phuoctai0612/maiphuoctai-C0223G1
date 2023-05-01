package furama_management.util;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Room;
import furama_management.model.resorts.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteFacility {
    public static LinkedHashMap<Facility, Integer> readFile(String fileFacility) {
        LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
        File file = new File(fileFacility);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] arr;

            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                arr = temp.split(",");
                if (arr[0].contains("HO")) {
                    House house = new House(arr[0], arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                            arr[5], arr[6], Integer.parseInt(arr[7]));
                    facilityIntegerLinkedHashMap.put(house, 0);
                } else if (arr[0].contains("RO")) {
                    Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
                    facilityIntegerLinkedHashMap.put(room, 0);
                } else if (arr[0].contains("VL")) {
                    Villa villa = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]
                            , Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                    facilityIntegerLinkedHashMap.put(villa, 0);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityIntegerLinkedHashMap;
    }

    public static void writeFile(String fileFacility, LinkedHashMap<Facility, Integer> facilityLinkedHashMap, boolean a) {
        File file = new File(fileFacility);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility f : facilityLinkedHashMap.keySet()) {
                if (f instanceof House) {
                    bufferedWriter.write(((House) f).fileHouse());
                    bufferedWriter.newLine();
                } else if (f instanceof Villa) {
                    bufferedWriter.write(((Villa) f).fileVilla());
                    bufferedWriter.newLine();
                } else if (f instanceof Room) {
                    bufferedWriter.write(((Room) f).fileRoom());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
