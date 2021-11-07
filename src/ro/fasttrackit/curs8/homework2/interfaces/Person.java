package ro.fasttrackit.curs8.homework2.interfaces;

public class Person {
    private BankServices bankServices;

    public Person(BankServices bankServices){
        this.bankServices = bankServices;
    }
    public void personRequest(){
        System.out.println("Request credit " + bankServices.creditOffer());
    }
}
