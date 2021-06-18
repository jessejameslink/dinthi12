package CaseStudy.Commons.ServiceCommons;


import CaseStudy.Models.ServiceModels.Room;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_ROOM = "src/CaseStudy/Data/Room.csv";
    //header
    private static final String FILE_HEADER = "service name, Usable area, Rental cost, Number of people included, Rent type,Free service included";

    public static void WriteFileRoom(ArrayList<Room> roomArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_ROOM);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);
            for (Room room : roomArrayList) {
                {
                    fileWriter.append(room.getServiceName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(room.getUsableArea());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(room.getRentalCost());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append((room.getNumberPreson()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(room.getRentalType());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(room.getFreeServiceIncluded());
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

    public static ArrayList<Room> getFileRoom() {
        BufferedReader br = null;
        ArrayList<Room> roomList = new ArrayList<>();
        Path path = Paths.get(FILE_ROOM);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_ROOM);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_ROOM));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("service name")) {

                    continue;
                }
                Room room = new Room();
                room.setServiceName(splitdata[0]);
                room.setUsableArea(splitdata[1]);
                room.setRentalCost(splitdata[2]);
                room.setNumberPreson(splitdata[3]);
                room.setRentalType(splitdata[4]);
                room.setFreeServiceIncluded(splitdata[5]);

                roomList.add(room);


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return roomList;
    }
}
