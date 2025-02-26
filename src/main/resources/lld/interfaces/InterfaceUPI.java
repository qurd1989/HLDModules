package interfaces;

public interface InterfaceUPI {
    int checkBalance(String account);
    void transfer(String from, String to, double amount);
}
