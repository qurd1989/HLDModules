package hld1.DesignPattern.singleResponsibilityPrinciple.exchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {
    private FixedStockExchange exchange;
    private Portfolio portfolio;

    @Before
    public void setUp() {
        exchange = new FixedStockExchange();
        exchange.fix("MSFT", new Money(100));
        portfolio = new Portfolio((StockExchange) exchange);

    }

    @Test
    public void GivenFiveMSFTTotalShouldBe500() {
        portfolio.add("MSFT", 5);
        assertEquals(new Money(500), portfolio.value());
    }
}
