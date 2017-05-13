package pl.com.bottega.exchangerate.domain.commands;

import pl.com.bottega.exchangerate.domain.exception.Validatable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreateCalculationCommand implements Validatable{
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal amount;
    private BigDecimal calculatedAmount;
    private LocalDateTime dataTime;

    public String getFromCurrency() {
        return fromCurrency;
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

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    @Override
    public void validate(ValidationErrors errors) {
        if(fromCurrency.isEmpty())
            errors.add("fromCurrency", "Field is required ! ");
        if(toCurrency.isEmpty())
            errors.add("toCurrency", "Field is required ! ");
        if(amount == null || amount.equals(null))
            errors.add("amout", "Field is required ! ");
        if( calculatedAmount == null || calculatedAmount.equals(null))
            errors.add("calculatedAmount", "Field is required ! ");
        if(dataTime.isEqual(null))
            errors.add("dataTime", "Field is required ! ");
    }
}
