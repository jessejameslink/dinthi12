package CaseStudy.Controller.CustomerController;

import CaseStudy.Commons.CustomerCommons.FileCustomer;
import CaseStudy.Models.CustomerModels.Customer;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

enum Gioitinh {
    NAM("nam"),
    NU("nu"),
    OHTER("khac");
    private String line;


    private Gioitinh(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }


}

public class CustomerController {
    private static final String NAME_PATTERN = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
    private static final String ID_CARD = "[0-9]{3} [0-9]{3} [0-9]{3}";
    private static final String PHONE = "[0-9]{4} [0-9]{3} [0-9]{3}";
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}";
    private static ArrayList<Customer> listCustomer = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addCustomer() {
        listCustomer = FileCustomer.getFileCustomer();

        System.out.println("enter name customer");
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        String nameCustomer;
        while (true) {
            nameCustomer = scanner.nextLine();
            if (pattern.matcher(nameCustomer).find()) {
                break;
            } else System.out.println("enter wrong name, please enter again");
        }
        System.out.println("enter birthday customer");
        String birthDay;
        while (true) {
            birthDay = scanner.nextLine();
            if (validDate(birthDay)) {
                break;
            } else
                JOptionPane.showMessageDialog(null, "invalid");
        }
        System.out.println("enter gender customer");
        String gender;
        while (true) {
            gender = scanner.nextLine();
            Gioitinh gioitinhNam = Gioitinh.NAM;
            Gioitinh gioitinhNu = Gioitinh.NU;
            Gioitinh gioitinhOther = Gioitinh.OHTER;

            if (gioitinhNam.getLine().equalsIgnoreCase(gender)) {
                break;
            } else if (gioitinhNu.getLine().equalsIgnoreCase(gender)) {
                break;
            } else if (gioitinhOther.getLine().equalsIgnoreCase(gender))
                break;
            else
                System.out.println("bạn nhập sai");
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
        System.out.println("enter type customer");
        String typeCustomer;
        while (true) {
            typeCustomer = scanner.nextLine();
            if (typeCustomer != null) {
                break;
            } else System.out.println("enter type customer wrong please again");
        }
        Customer customer = new Customer(nameCustomer, birthDay, gender, id, phoneNumber, email, typeCustomer);
        listCustomer.add(customer);
        FileCustomer.WriteCustomer(listCustomer);
        System.out.println("successfully added new customer");
    }

    public void showCustomer() {
     AllshowCustomer();
    }

    public void AllshowCustomer() {

        listCustomer = FileCustomer.getFileCustomer();
        for (Customer customer : listCustomer
        ) {
            System.out.println("-------------------------------------");
            System.out.println("name    :  " + customer.getNameCustomer());
            System.out.println("Birthday : " + customer.getDayBirthCustomer());
            System.out.println("gender   : " + customer.getGenderCustomer());
            System.out.println("Id       : " + customer.getIdCustomer());
            System.out.println("Email    : " + customer.getEmailCustomer());
            System.out.println("Phone    : " + customer.getPhoneNumberCustomer());
            System.out.println("Type     : " + customer.getTypeCustomer());

        }
    }

    //check birthday
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

    public void deleteCustomer() {
        AllshowCustomer();
        System.out.println("enter id");
        String id = scanner.nextLine();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getIdCustomer().equals(id)) {
                listCustomer.remove(i);
                FileCustomer.WriteCustomer(listCustomer);
                System.out.println("delete successful");
                break;
            }
        }
    }

    public void editCustomer() {
        AllshowCustomer();
        System.out.println("enter id");
        String id = scanner.nextLine();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getIdCustomer().equals(id)) {
                System.out.println("1. " + listCustomer.get(i).getNameCustomer());
                System.out.println("2. " + listCustomer.get(i).getDayBirthCustomer());
                System.out.println("3. " + listCustomer.get(i).getGenderCustomer());
                System.out.println("4. " + listCustomer.get(i).getIdCustomer());
                System.out.println("5. " + listCustomer.get(i).getPhoneNumberCustomer());
                System.out.println("6. " + listCustomer.get(i).getEmailCustomer());
                System.out.println("7. " + listCustomer.get(i).getTypeCustomer());
                String choose = scanner.nextLine();
                System.out.println("enter u want change");
                String value = scanner.nextLine();
                switch (choose) {
                    case "1":
                        listCustomer.get(i).setNameCustomer(value);
                        break;
                    case "2":
                        listCustomer.get(i).setDayBirthCustomer(value);
                        break;
                    case "3":
                        listCustomer.get(i).setGenderCustomer(value);
                        break;
                    case "4":
                        listCustomer.get(i).setIdCustomer(value);
                        break;
                    case "5":
                        listCustomer.get(i).setPhoneNumberCustomer(value);
                        break;
                    case "6":
                        listCustomer.get(i).setEmailCustomer(value);
                        break;
                    case "7":
                        listCustomer.get(i).setTypeCustomer(value);
                        break;
                }
                FileCustomer.WriteCustomer(listCustomer);
                System.out.println("edit successful");
            }
        }
    }
}
//Hệ thống cho phép quản lý thêm thông tin của các Customer đến thuê và sử dụng các dịch vụ của Furama.
// Thông tin của Customer bao gồm: Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách,
// (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).