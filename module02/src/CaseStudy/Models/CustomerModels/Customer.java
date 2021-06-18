package CaseStudy.Models.CustomerModels;

public class Customer {
    private String nameCustomer;
    private String dayBirthCustomer;
    private String genderCustomer;
    private String idCustomer;
    private String phoneNumberCustomer;
    private String emailCustomer;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String nameCustomer, String dayBirthCustomer, String genderCustomer, String idCustomer, String phoneNumberCustomer, String emailCustomer, String typeCustomer) {
        this.nameCustomer = nameCustomer;
        this.dayBirthCustomer = dayBirthCustomer;
        this.genderCustomer = genderCustomer;
        this.idCustomer = idCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayBirthCustomer() {
        return dayBirthCustomer;
    }

    public void setDayBirthCustomer(String dayBirthCustomer) {
        this.dayBirthCustomer = dayBirthCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
