package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.ValType;

@Repository
public interface ValTypeRepository extends JpaRepository<ValType, Long> {
}
