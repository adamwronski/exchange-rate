package pl.com.bottega.exchangerate.infrastructure;


import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JPACalculationRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void get()


}
