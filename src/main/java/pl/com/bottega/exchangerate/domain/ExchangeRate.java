package pl.com.bottega.exchangerate.domain;


import pl.com.bottega.exchangerate.domain.commands.CreateExchangeRateCommand;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ExchangeRate {


    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;
    private String currency;
    private BigDecimal rate;

    ExchangeRate(){

    }

    public ExchangeRate(CreateExchangeRateCommand cmd){
        this.date = cmd.getDate();
        this.currency = cmd.getCurrency();
        this.rate = cmd.getRate();
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
