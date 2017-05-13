package pl.com.bottega.exchangerate.domain.commands;


import pl.com.bottega.exchangerate.domain.exception.Validatable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreateExchangeRateCommand implements Validatable{
    private LocalDateTime date;
    private String currency;
    private BigDecimal rate;

    public LocalDateTime getDate() {
        return date;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public void validate(ValidationErrors errors) {
        validateCurrency(errors);
        validateDate(errors);
        validateRate(errors);
    }

    private void validateRate(ValidationErrors errors) {
        if(rate == null)
        errors.add("rate","Blank field 'rate', is required ");
    }

    private void validateDate(ValidationErrors errors) {
        if(date.isEqual(null))
            errors.add("data","Field 'data' must have a correct dataTime");
    }

    private void validateCurrency(ValidationErrors errors) {
        if(currency.isEmpty())
            errors.add("currency","This field cant be blank !");
        if(currency.length() != 3)
            errors.add("currency", "Currency field required a 3 letter currency like 'USD' or 'PLN'");
    }

}
