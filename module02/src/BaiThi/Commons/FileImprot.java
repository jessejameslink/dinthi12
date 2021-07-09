package BaiThi.Commons;

import BaiThi.Models.ImportedProducts;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileImprot {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_IMPORTS = "src/baiThi/Data/IMPORTS.csv";
    //header
    private static final String HEADER = "id, Code, Name, Selling Price, Quantity, Manufacturer, price import, province, tax  ";


    public static void WriteImproducts(ArrayList<ImportedProducts> productsArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_IMPORTS);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE);
            for (ImportedProducts ex : productsArrayList
            ) {
                fileWriter.append(ex.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getIdProduction());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getNameProduction());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getPrice());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getProducer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getPriceImport());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getProvinceImport());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(ex.getTaxImport());
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

    public static ArrayList<ImportedProducts> ReadImproducts() {
        BufferedReader br = null;
        ArrayList<ImportedProducts> exportProducts = new ArrayList<>();
        Path path = Paths.get(FILE_IMPORTS);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_IMPORTS);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_IMPORTS));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("id")) {
                    continue;
                }
                ImportedProducts im = new ImportedProducts();
                im.setId((splitdata[0]));
                im.setIdProduction(splitdata[1]);
                im.setNameProduction(splitdata[2]);
                im.setPrice((splitdata[3]));
                im.setNumber((splitdata[4]));
                im.setProducer(splitdata[5]);
                im.setPriceImport((splitdata[6]));
                im.setProvinceImport(splitdata[7]);
                im.setTaxImport(splitdata[8]);
                exportProducts.add(im);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return exportProducts;
    }

}


