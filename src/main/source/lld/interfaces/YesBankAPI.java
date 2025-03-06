package interfaces;

import org.w3c.dom.ls.LSOutput;

public class YesBankAPI implements  InterfaceUPI {
    int getBalance(String account){
        System.out.println("Getting Balance of Yes Bank: ");
        return 0;
    }
    void transferMoney(String from, String to){
        System.out.println("Translating Money to Yes Bank: ");
    }

    @Override
    public int checkBalance(String account) {
        System.out.println("Getting Balance of Yes Bank: ");
        return 0;
    }

    @Override
    public void transfer(String from, String to, double amount) {
        System.out.println("Translating Money to Yes Bank: ");
    }
}
