package Test3.Commons;

import Test3.Models.Kawasaki;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

public class FileKawa {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_KAWA = "src/test3/Data/Kawasaki.csv";
    //header
    private static final String HEADER = "ID,NAME,THE FIRM,YEAR,PRICE,COLOR";


    public static void WriteKawa(ArrayList<Kawasaki> kawasakis) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_KAWA);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE);
            for (Kawasaki kawa : kawasakis
            ) {
                fileWriter.append(kawa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(kawa.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(kawa.getFirm());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(kawa.getYear());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) kawa.getPrice());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(kawa.getColorKawa());
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

    public static ArrayList<Kawasaki> ReadKawa() {
        BufferedReader br = null;
        ArrayList<Kawasaki> kawasakis = new ArrayList<>();
        Path path = Paths.get(FILE_KAWA);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_KAWA);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_KAWA));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("ID")) {
                    continue;
                }
                Kawasaki kawasaki = new Kawasaki();
                kawasaki.setId(splitdata[0]);
                kawasaki.setName(splitdata[1]);
                kawasaki.setFirm(splitdata[2]);
                kawasaki.setYear(splitdata[3]);
                kawasaki.setPrice(Double.parseDouble(splitdata[4]));
                kawasaki.setColorKawa(splitdata[5]);
                kawasakis.add(kawasaki);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return kawasakis;
    }


}

