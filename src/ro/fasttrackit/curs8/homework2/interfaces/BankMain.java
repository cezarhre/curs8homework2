package ro.fasttrackit.curs8.homework2.interfaces;

public class BankMain {
    public static void main(String[] args) {
        BankServices ingBank = new INGBank(10000, 200);
        BankServices brdBank = new BRDBank(100000, 300);
        BankServices btBank = new BTBank(1000000, 500);

        Person person = new Person(ingBank);
        person.personRequest();
        Person person1 = new Person(brdBank);
        person1.personRequest();
        Person person2 = new Person(btBank);
        person2.personRequest();

        System.out.println("Credit sold ING Bank " + ingBank.withdrawService());
        System.out.println("Credit sold BRD Bank " + brdBank.withdrawService());
        System.out.println("Credit sold BT Bank " + btBank.withdrawService());

    }
}
