class Bank {
    private int acc_no;
    private int acc_id;
    private String acc_type;
    private String acc_holder_name;
    private String acc_holder_nic;
    private double acc_balance;
    private double depositAmount;
    private double withdrawAmount;

    public int getAcc_no()
    {
        return acc_no;
    }
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getAcc_id() {
        return acc_id;
    }
    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getAcc_type(){
        return acc_type;
    }
    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getAcc_holder_name(){
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public String getAcc_holder_nic(){
        return acc_holder_nic;
    }

    public void setAcc_holder_nic(String acc_holder_nic) {
        this.acc_holder_nic = acc_holder_nic;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
   public double current(){
        return (acc_balance+depositAmount)-withdrawAmount;
   }

}
class BankStatement{
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println("Bank Statement");
        b.setAcc_no(123456789);
        System.out.println("Account Number     :- "+b.getAcc_no());
        b.setAcc_id(9876);
        System.out.println("Account ID         :- "+b.getAcc_id());
        b.setAcc_type("Personal");
        System.out.println("Account Type       :- "+b.getAcc_type());
        b.setAcc_holder_name("Kamal");
        System.out.println("Account Holder     :- "+b.getAcc_holder_name());
        b.setAcc_holder_nic("12345678900");
        System.out.println("Account Holder NIC :- "+b.getAcc_id());
        b.setAcc_balance(84567.93);
        System.out.println("Account Balence    :- "+b.getAcc_balance());
        b.setDepositAmount(25000.00);
        System.out.println("Deposit Amount     :- "+b.getDepositAmount());
        b.setWithdrawAmount(65000.00);
        System.out.println("Withdraw Amount    :- "+b.getWithdrawAmount());
        System.out.println("Current balence    :- "+b.current());

    }
}