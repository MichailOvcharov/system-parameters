package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.omb.entity.Contractor;

@Repository
public interface ContractorRepository extends JpaRepository<Contractor, Long> {
}
