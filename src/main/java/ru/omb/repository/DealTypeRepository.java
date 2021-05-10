package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.DealType;

@Repository
public interface DealTypeRepository extends JpaRepository<DealType, Long> {
}
