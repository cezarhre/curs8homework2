package ro.fasttrackit.curs8.homework2.interfaces;

public class BRDBank implements BankServices{
    private final int deposit;
    private final int withdraw;

    public BRDBank(int deposit, int withdraw) {
        this.deposit = Math.abs(deposit);
        this.withdraw = Math.abs(withdraw);
    }

    public String creditOffer() {
        return "The BRD BANK credit offer is " + deposit;
    }

    public int withdrawService() {
        int sold = 0;
        if (withdraw <= deposit) {
            return sold = deposit - withdraw;
        } else {
            return sold = deposit;
        }
    }
}
