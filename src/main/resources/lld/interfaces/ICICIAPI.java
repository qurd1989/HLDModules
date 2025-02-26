package interfaces;

public class ICICIAPI implements InterfaceUPI{
    int fetchBalance(String userID){
        System.out.println("Getting Balance of ICICI Bank: ");
        return 0;
    }
    void sendMoney(String to, String from) {
        System.out.println("Translating Money to ICICI Bank: ");
    }

    @Override
    public int checkBalance(String account) {
        System.out.println("Getting Balance of ICICI Bank: ");
        return 0;
    }

    @Override
    public void transfer(String from, String to, double amount) {
        System.out.println("Translating Money to ICICI Bank: ");
    }
}


