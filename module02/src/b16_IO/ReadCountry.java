package b16_IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadCountry {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_COUNTRY = "src/b16_IO/Country.csv";
    //header
    private static final String FILE_HEADER = "StartIp,EndIp, Start num, End num, Country code, Country";

    public static void WriteCountry(ArrayList<Country> countryArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_COUNTRY);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);

            for (Country country : countryArrayList) {
                fileWriter.append(country.getStartIp());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getEndIp());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getStarNum());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getEndNum());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCountryCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCountry());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(NEW_LINE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("error flush or close");
            }
        }
    }
    public static ArrayList<Country> getFileCountry(){
        BufferedReader br = null;
        ArrayList<Country> countries = new ArrayList<>();
        Path path = Paths.get(FILE_COUNTRY);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_COUNTRY);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_COUNTRY));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("Name")) {
                    continue;
                }
                Country country = new Country();
                country.setStartIp(splitdata[0]);
                country.setEndIp(splitdata[1]);
                country.setStarNum(splitdata[2]);
                country.setEndNum(splitdata[3]);
                country.setCountryCode(splitdata[4]);
                country.setCountry(splitdata[5]);


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return countries;
    }
    }

