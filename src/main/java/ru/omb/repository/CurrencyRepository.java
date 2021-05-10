package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
