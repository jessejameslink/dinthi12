package CaseStudy.Commons.ServiceCommons;

import CaseStudy.Models.ServiceModels.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileVilla {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    //  Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_VILLA = "src/CaseStudy/Data/Villa.csv";
    //header
    private static final String FILE_HEADER = "service name, Usable area, Rental cost, Number of people included, Rent type,Room standard, Description of other amenities, Pool area,Number of floors";

    public static void WriteFileVilla(ArrayList<Villa> villaArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_VILLA);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);
            for (Villa villa : villaArrayList) {
                {
                    fileWriter.append(villa.getServiceName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getUsableArea());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getRentalCost());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append((villa.getNumberPreson()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getRentalType());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getRoomStandardVilla());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getDescriptionVilla());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getPoolArea());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(villa.getFloorVilla());
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

    public static ArrayList<Villa> getFileVilla() {
        BufferedReader br = null;
        ArrayList<Villa> villaList = new ArrayList<>();
        Path path = Paths.get(FILE_VILLA);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_VILLA);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_VILLA));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("service name")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setServiceName(splitdata[0]);
                villa.setUsableArea(splitdata[1]);
                villa.setRentalCost(splitdata[2]);
                villa.setNumberPreson(splitdata[3]);
                villa.setRentalType(splitdata[4]);
                villa.setRoomStandardVilla(splitdata[5]);
                villa.setDescriptionVilla(splitdata[6]);
                villa.setPoolArea(splitdata[7]);
                villa.setFloorVilla(splitdata[8]);
                villaList.add(villa);


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return villaList;
    }
}
