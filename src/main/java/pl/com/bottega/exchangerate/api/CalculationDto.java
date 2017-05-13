package pl.com.bottega.exchangerate.api;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CalculationDto {

    private String formCurrency;
    private String toCurrency;
    private BigDecimal amount;
    private BigDecimal calculatedAmount;
    private LocalDateTime dateTime;

    public String getFormCurrency() {
        return formCurrency;
    }

    public void setFormCurrency(String formCurrency) {
        this.formCurrency = formCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
