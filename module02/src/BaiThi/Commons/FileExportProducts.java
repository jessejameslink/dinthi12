package BaiThi.Commons;

import BaiThi.Models.ExportProducts;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileExportProducts {

        private static final String COMMA_DELIMITER = ",";
        private static final String NEW_LINE = "\n";
        private static final String FILE_EXPRODUCTS = "src/baiThi/Data/EXPRODUCTS.csv";
        //header
        private static final String HEADER = "id, Code, Name, Selling Price, Quantity, Manufacturer, ExportPrice, countryEntry";


        public static void WriteExProducts(ArrayList<ExportProducts> exportProducts) {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(FILE_EXPRODUCTS);
                fileWriter.append(HEADER);
                fileWriter.append(NEW_LINE);
                for (ExportProducts ex : exportProducts
                ) {
                    fileWriter.append( ex.getId());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(ex.getIdProduction());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(ex.getNameProduction());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append( ex.getPrice());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append( ex.getNumber());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(ex.getProducer());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append( ex.getExportPrice());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(ex.getCountryEntry());
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

        public static ArrayList<ExportProducts> ReadExproducts() {
            BufferedReader br = null;
            ArrayList<ExportProducts> exportProducts = new ArrayList<>();
            Path path = Paths.get(FILE_EXPRODUCTS);
            if (!Files.exists(path)) {
                try {
                    Writer writer = new FileWriter(FILE_EXPRODUCTS);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            try {
                String line;
                br = new BufferedReader(new FileReader(FILE_EXPRODUCTS));

                while ((line = br.readLine()) != null) {
                    String[] splitdata = line.split(",");
                    if (splitdata[0].equals("id")) {
                        continue;
                    }
                    ExportProducts ex = new ExportProducts();
                    ex.setId((splitdata[0]));
                    ex.setIdProduction(splitdata[1]);
                    ex.setNameProduction(splitdata[2]);
                    ex.setPrice((splitdata[3]));
                    ex.setNumber((splitdata[4]));
                    ex.setProducer(splitdata[5]);
                    ex.setExportPrice((splitdata[6]));
                    ex.setCountryEntry(splitdata[7]);

                    exportProducts.add(ex);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return exportProducts;
        }

    }

////id, idProduction, nameProduction, price, number, producer);
////        ExportPrice = exportPrice;
////        this.countryEntry = countryEntry;