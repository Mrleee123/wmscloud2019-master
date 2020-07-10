package entity;

public class RackSum {
    private String status;
    private int number;
    private String percent;
    private int companyid;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    @Override
    public String toString(){
        return "RackSum:"+status+"  "+number+" "+percent+" "+companyid;
    }
}
