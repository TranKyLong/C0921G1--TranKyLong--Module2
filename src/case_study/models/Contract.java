package case_study.models;

public class Contract {
    private String contractNumber;
    private String contractCode;
    private double advanceStake;
    private double total;
    private String custommerCode;

    public Contract() {
    }

    public Contract(String contractNumber, String contractCode, double advanceStake, double total, String custommerCode) {
        this.contractNumber = contractNumber;
        this.contractCode = contractCode;
        this.advanceStake = advanceStake;
        this.total = total;
        this.custommerCode = custommerCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public double getAdvanceStake() {
        return advanceStake;
    }

    public void setAdvanceStake(double advanceStake) {
        this.advanceStake = advanceStake;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCustommerCode() {
        return custommerCode;
    }

    public void setCustommerCode(String custommerCode) {
        this.custommerCode = custommerCode;
    }

    @Override
    public String toString() {
        return "Số hợp đồng: " + contractNumber + ", " +
                "Mã hợp đồng: " + contractCode + ", " +
                "cọc trước: " + advanceStake + ", " +
                "Tổng tiền: " + total + ", " +
                "Mã khách hàng: " + custommerCode;
    }
}
