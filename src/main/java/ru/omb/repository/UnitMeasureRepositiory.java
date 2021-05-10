package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.UnitMeasure;

@Repository
public interface UnitMeasureRepositiory extends JpaRepository<UnitMeasure, Long> {
}
