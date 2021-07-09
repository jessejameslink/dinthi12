package Test3.Commons;

import Test3.Models.Vinfast;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileVinfast {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_VINFAST = "src/test3/Data/Vinfast.csv";
    //header
    private static final String HEADER = "ID,NAME,THE FIRM,YEAR,PRICE,ENGINE,ADDRESS";

    public static void WriteVinfast(ArrayList<Vinfast> vinfasts) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_VINFAST);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE);
            for (Vinfast vinfast : vinfasts
            ) {
                fileWriter.append(vinfast.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(vinfast.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(vinfast.getFirm());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(vinfast.getYear());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) vinfast.getPrice());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(vinfast.getEngine());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(vinfast.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(NEW_LINE);

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
    public static ArrayList<Vinfast> ReadVinfast() {
        BufferedReader br = null;
        ArrayList<Vinfast> vinfasts = new ArrayList<>();
        Path path = Paths.get(FILE_VINFAST);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_VINFAST);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_VINFAST));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("ID")) {
                    continue;
                }
                Vinfast vinfast = new Vinfast();
                vinfast.setId(splitdata[0]);
                vinfast.setName(splitdata[1]);
                vinfast.setFirm(splitdata[2]);
                vinfast.setYear(splitdata[3]);
                vinfast.setPrice(Double.parseDouble(splitdata[4]));
               vinfast.setEngine(splitdata[5]);
                vinfast.setAddress(splitdata[6]);

                vinfasts.add(vinfast);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return vinfasts;
    }
}
//String id, String name, String firm, String year, String price, String engine, String address