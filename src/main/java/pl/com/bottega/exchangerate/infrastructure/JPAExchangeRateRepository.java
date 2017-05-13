package pl.com.bottega.exchangerate.infrastructure;


import org.springframework.transaction.annotation.Transactional;
import pl.com.bottega.exchangerate.domain.ExchangeRate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JPAExchangeRateRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void put(ExchangeRate exchangeRate) {
        entityManager.persist(exchangeRate);
    }
}
