package pl.com.bottega.exchangerate.api;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

public class ExchangeRateDto {

    private LocalDateTime date;
    private Currency currency;
    private BigDecimal rate;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
