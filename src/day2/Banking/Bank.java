package day2.Banking;

public class Bank {
    String bank_name;
    String ifsc_code;
    String account_no;
    String account_holder_name;
    String bank_branch;

    public Bank(String bank_name, String ifsc_code, String account_no, String account_holder_name, String bank_branch) {
        this.bank_name = bank_name;
        this.ifsc_code = ifsc_code;
        this.account_no = account_no;
        this.account_holder_name = account_holder_name;
        this.bank_branch = bank_branch;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public String getBank_branch() {
        return bank_branch;
    }

    public void setBank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    public String toString() {
        return "Bank{" +
                "bank_name='" + bank_name + '\'' +
                ", ifsc_code='" + ifsc_code + '\'' +
                ", account_no='" + account_no + '\'' +
                ", account_holder_name='" + account_holder_name + '\'' +
                ", bank_branch='" + bank_branch + '\'' +
                '}';
    }
}
