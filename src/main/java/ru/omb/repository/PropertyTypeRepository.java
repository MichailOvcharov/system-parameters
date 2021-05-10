package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.PropertyType;

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Long> {
}
