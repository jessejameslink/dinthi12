package b16_IO;

public class Country {
    private String startIp;
    private String endIp;
    private String starNum;
    private String endNum;
    private String countryCode;
    private String country;

    public Country() {
    }

    public Country(String startIp, String endIp, String starNum, String endNum, String countryCode, String country) {
        this.startIp = startIp;
        this.endIp = endIp;
        this.starNum = starNum;
        this.endNum = endNum;
        this.countryCode = countryCode;
        this.country = country;
    }

    public String getStartIp() {
        return startIp;
    }

    public void setStartIp(String startIp) {
        this.startIp = startIp;
    }

    public String getEndIp() {
        return endIp;
    }

    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

    public String getStarNum() {
        return starNum;
    }

    public void setStarNum(String starNum) {
        this.starNum = starNum;
    }

    public String getEndNum() {
        return endNum;
    }

    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "startIp='" + startIp + '\'' +
                ", endIp='" + endIp + '\'' +
                ", starNum='" + starNum + '\'' +
                ", endNum='" + endNum + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
