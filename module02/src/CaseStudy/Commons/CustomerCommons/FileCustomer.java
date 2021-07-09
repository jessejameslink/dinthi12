package CaseStudy.Commons.CustomerCommons;

import CaseStudy.Models.CustomerModels.Customer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileCustomer {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_CUSTOMER = "src/CaseStudy/Data/Customer.csv";
    //header
    private static final String FILE_HEADER = "Name, birthday, gender, id, phone, email, type";

        public static void WriteCustomer(ArrayList<Customer> customerArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_CUSTOMER);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);
            for (Customer customer : customerArrayList
            ) {
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getDayBirthCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGenderCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getIdCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getPhoneNumberCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmailCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
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

    public static ArrayList<Customer> getFileCustomer() {
        BufferedReader br = null;
        ArrayList<Customer> customerList = new ArrayList<>();
        Path path = Paths.get(FILE_CUSTOMER);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_CUSTOMER);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_CUSTOMER));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitdata[0]);
                customer.setDayBirthCustomer(splitdata[1]);
                customer.setGenderCustomer(splitdata[2]);
                customer.setIdCustomer(splitdata[3]);
                customer.setPhoneNumberCustomer(splitdata[4]);
                customer.setEmailCustomer(splitdata[5]);
                customer.setTypeCustomer(splitdata[6]);
                customerList.add(customer);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return customerList;
    }
}
