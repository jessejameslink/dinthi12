package CaseStudy.Commons.ServiceCommons;

import CaseStudy.Models.ServiceModels.House;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.

public class FileHouse {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HOUSE = "src/CaseStudy/Data/House.csv";
    //header
    private static final String FILE_HEADER = "service name, Usable area, Rental cost, Number of people included, Rent type,Room standard, Description of other amenities,Number of floors";

    public static void WriteFileHouse(ArrayList<House> houseArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_HOUSE);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);
            for (House house : houseArrayList) {
                {
                    fileWriter.append(house.getServiceName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getUsableArea());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getRentalCost());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append((house.getNumberPreson()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getRentalType());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getRoomStandardHouse());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getDescriptionHouse());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getFloorHouse());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(NEW_LINE);
                }

            }

        } catch (Exception ex) {
            System.out.println("Error in file CSV writer");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("error flush or close");
            }
        }
    }

    public static ArrayList<House> getFileHouse() {
        BufferedReader br = null;
        ArrayList<House> houseList = new ArrayList<>();
        Path path = Paths.get(FILE_HOUSE);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_HOUSE);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_HOUSE));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("service name")) {
                    continue;
                }
                House house = new House();
                house.setServiceName(splitdata[0]);
                house.setUsableArea(splitdata[1]);
                house.setRentalCost(splitdata[2]);
                house.setNumberPreson(splitdata[3]);
                house.setRentalType(splitdata[4]);
                house.setRoomStandardHouse(splitdata[5]);
                house.setDescriptionHouse(splitdata[6]);
                house.setFloorHouse(splitdata[7]);
                houseList.add(house);


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return houseList;
    }
}
