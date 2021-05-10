package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.JewelryType;

@Repository
public interface JewelryTypeRepository extends JpaRepository<JewelryType, Long> {
}
