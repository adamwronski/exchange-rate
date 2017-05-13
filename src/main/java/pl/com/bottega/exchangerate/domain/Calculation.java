package pl.com.bottega.exchangerate.domain;


import pl.com.bottega.exchangerate.domain.commands.CreateCalculationCommand;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Calculation {


    private String formCurrency;
    private String toCurrency;
    private BigDecimal amount;
    private BigDecimal calculatedAmount;
    private LocalDateTime dateTime;

    Calculation(){

    }

    public Calculation(CreateCalculationCommand cmd) {
        this.formCurrency = cmd.getFromCurrency();
        this.toCurrency = cmd.getToCurrency();
        this.amount = cmd.getAmount();
        this.calculatedAmount = cmd.getCalculatedAmount();
        this.dateTime = cmd.getDataTime();
    }

    public String getFormCurrency() {
        return formCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getCalculatedAmount() {
        return calculatedAmount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
