package hld1.DesignPattern.singleResponsibilityPrinciple.exchange;

public interface StockExchange {
    Money currentPrice(String symbol);
}
