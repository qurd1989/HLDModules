package interfaces;

public class PhonePe {
//    YesBankAPI yp = new YesBankAPI();
//    int getBalance (String account){
//        return yp.getBalance(account);
//    }
//    void transfer (String from, String to){
//        yp.transferMoney(from, to);
//    }

    InterfaceUPI upi = new YesBankAPI();
    int getBalance(String account) {
        return upi.checkBalance(account);
    }
    void transfer(String from, String to, double amount) {
        upi.transfer(from, to, amount);
    }
    InterfaceUPI  upi2 = new ICICIAPI();

}
