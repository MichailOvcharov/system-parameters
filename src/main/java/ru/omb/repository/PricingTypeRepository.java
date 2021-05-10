package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.PricingType;

@Repository
public interface PricingTypeRepository extends JpaRepository<PricingType, Long> {
}
