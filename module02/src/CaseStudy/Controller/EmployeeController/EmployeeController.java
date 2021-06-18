package CaseStudy.Controller.EmployeeController;


import CaseStudy.Commons.EmployeeCommons.FileEmployee;

import CaseStudy.Models.EmployeeModels.Employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

enum Education{
    TRUNG_CAP("trung cap"),
    CAO_DANG("cao dang"),
    DAI_HOC("dai hoc");
    private String line;


    private Education(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

}
public class EmployeeController {
    private static final String NAME_PATTERN = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
    private static final String ID_CARD = "[0-9]{3} [0-9]{3} [0-9]{3}";
    private static final String PHONE = "[0-9]{4} [0-9]{3} [0-9]{3}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}$";
    private static Map<String,Employee> employees = new HashMap<>();

    Scanner scanner = new Scanner(System.in);


    public void addEmployee(){
        employees = FileEmployee.getFile();
        System.out.println("enter name employee");
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        String nameEmployee;
        while (true){
            nameEmployee = scanner.nextLine();
            if (pattern.matcher(nameEmployee).find()){
                break;
            }else System.out.println("enter wrong");
        }
        System.out.println("enter birthday employee");
        String birthday;
        while (true){
            birthday = scanner.nextLine();
            if (validDate(birthday)){
                break;
            }else System.out.println("enter wrong");
        }
        System.out.println("enter id card customer");
        String id;
        while (true) {
            Pattern idCrad = Pattern.compile(ID_CARD);
            id = scanner.nextLine();
            if (idCrad.matcher(id).find()) {
                break;
            } else System.out.println("enter id wrong please again");
        }
        System.out.println("enter phone customer");
        String phoneNumber;
        while (true) {
            Pattern phone = Pattern.compile(PHONE);
            phoneNumber = scanner.nextLine();
            if (phone.matcher(phoneNumber).find()) {
                break;
            } else System.out.println("enter phone wrong customer");
        }
        System.out.println("enter email customer");
        String email;
        while (true) {
            Pattern emailPattern = Pattern.compile(EMAIL_PATTERN);
            email = scanner.nextLine();
            if (emailPattern.matcher(email).find()) {
                break;
            } else System.out.println("enter email wrong please again");
        }
        System.out.println("enter education");
        String hocVan;
        while (true){
            hocVan = scanner.nextLine();
            Education trungCcap = Education.TRUNG_CAP;
            Education caoDang = Education.CAO_DANG;
            Education daiHoc = Education.DAI_HOC;
            if (trungCcap.getLine().equalsIgnoreCase(hocVan)){
                break;
            }else if (caoDang.getLine().equalsIgnoreCase(hocVan)){
                break;
            }else if (daiHoc.getLine().equalsIgnoreCase(hocVan)){
                break;
            }else System.out.println("enter wrong");
        }
Employee employee  = new Employee(nameEmployee,birthday,id,phoneNumber,email,hocVan);
    employees.put(id,employee);
        FileEmployee.WriteEmployee(employees);
        System.out.println("successfully added new customer");
    }

    public static boolean validDate(String date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date Bod = null;
        dateFormat.setLenient(false);
        try {
            Bod = dateFormat.parse(date);
            return true;

        } catch (ParseException e) {
            return false;
        }
    }
    public void  showEmployee(){
        employees = FileEmployee.getFile();
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
