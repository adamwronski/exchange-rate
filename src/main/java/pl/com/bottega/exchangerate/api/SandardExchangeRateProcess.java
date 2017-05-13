package pl.com.bottega.exchangerate.api;


import pl.com.bottega.exchangerate.domain.ExchangeRate;
import pl.com.bottega.exchangerate.domain.commands.CreateExchangeRateCommand;
import pl.com.bottega.exchangerate.infrastructure.JPAExchangeRateRepository;

public class SandardExchangeRateProcess implements ExchangeRateProcess {

  private JPAExchangeRateRepository jpaExchangeRateRepository;

    @Override
    public void create(CreateExchangeRateCommand cmd) {
        ExchangeRate exchangeRate = new ExchangeRate(cmd);
            jpaExchangeRateRepository.put(exchangeRate);
    }
}
