package pl.com.bottega.exchangerate.ui;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bottega.exchangerate.api.ExchangeRateDto;
import pl.com.bottega.exchangerate.api.ExchangeRateProcess;
import pl.com.bottega.exchangerate.domain.commands.CreateExchangeRateCommand;

@RestController
public class ExchangeRaterController {

    ExchangeRateProcess exchangeRateProcess;

    @PutMapping("/exchange-rate")
    public void exchangeRate(@RequestBody CreateExchangeRateCommand cmd) {
         exchangeRateProcess.create(cmd);
    }
}
