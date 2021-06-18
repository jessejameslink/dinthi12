package CaseStudy.Commons.EmployeeCommons;


import CaseStudy.Models.EmployeeModels.Employee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import java.util.Map;


public class FileEmployee {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_EMPLOYEE = "src/CaseStudy/Data/Employee.csv";
    //header
    private static final String FILE_HEADER = "Name, birthday, id, phone, email, education";

    public static void WriteEmployee(Map<String,Employee> employeeList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_EMPLOYEE);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);
            for (Map.Entry<String, Employee> entry : employeeList.entrySet()) {
                Employee employee = entry.getValue();
                fileWriter.append(employee.getNameEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getDateEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getIdEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getPhoneEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getEmailEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getEducationEmployee());
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

    public static Map<String, Employee> getFile() {
        BufferedReader br = null;
        Map<String, Employee> employeeMap = new HashMap<>();
        Path path = Paths.get(FILE_EMPLOYEE);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_EMPLOYEE);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_EMPLOYEE));

            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("Name")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setNameEmployee(splitdata[0]);
                employee.setDateEmployee(splitdata[1]);
                employee.setIdEmployee(splitdata[2]);
                employee.setPhoneEmployee(splitdata[3]);
                employee.setEmailEmployee(splitdata[4]);
                employee.setEducationEmployee(splitdata[5]);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeMap;
    }
}
