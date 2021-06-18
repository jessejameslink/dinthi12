package CaseStudy.Models.EmployeeModels;

public class Employee {
private String nameEmployee;
private String dateEmployee;
private String idEmployee;
private  String phoneEmployee;
private String emailEmployee;
private String EducationEmployee;

    public Employee() {
    }

    public Employee(String nameEmployee, String dateEmployee, String idEmployee, String phoneEmployee, String emailEmployee, String educationEmployee) {
        this.nameEmployee = nameEmployee;
        this.dateEmployee = dateEmployee;
        this.idEmployee = idEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        EducationEmployee = educationEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateEmployee() {
        return dateEmployee;
    }

    public void setDateEmployee(String dateEmployee) {
        this.dateEmployee = dateEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getEducationEmployee() {
        return EducationEmployee;
    }

    public void setEducationEmployee(String educationEmployee) {
        EducationEmployee = educationEmployee;
    }
}
//2.	Hệ thống quản lý còn cho phép quản lý thêm thông tin của Employee resort. Thông tin Employee sẽ bao gồm:
// Họ tên Employee , Ngày sinh, Số CMND, Số ĐT, Email, Trình độ, Vị trí, lương
//Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
//Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giá đốc.
//Mỗi Employee sẽ thuộc một bộ phận làm việc: Hiện tại resort bao gồm các bộ phận: Sale – Marketing, Hành Chính, Phục vụ, Quản lý.