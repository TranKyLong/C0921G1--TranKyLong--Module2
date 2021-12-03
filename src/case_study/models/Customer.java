package case_study.models;

public class Customer extends PersonFurama {
    private String custommerCode;
    private String adress;
    String custommerType;

    public Customer(String custommerCode, String adress, String custommerType) {
        this.custommerCode = custommerCode;
        this.adress = adress;
        this.custommerType = custommerType;
    }

    public Customer(String name, String birthDay, String gender, String cmnd, String phone, String email, String custommerCode, String adress, String custommerType) {
        super(name, birthDay, gender, cmnd, phone, email);
        this.custommerCode = custommerCode;
        this.adress = adress;
        this.custommerType = custommerType;
    }

    public Customer() {
    }

    public String getCustommerCode() {
        return custommerCode;
    }

    public void setCustommerCode(String custommerCode) {
        this.custommerCode = custommerCode;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCustommerType() {
        return custommerType;
    }

    public void setCustommerType(String custommerType) {
        this.custommerType = custommerType;
    }

    @Override
    public String toString() {
        return super.toString() + this.custommerCode + "," + this.custommerType + "," + this.adress ;
    }
}
