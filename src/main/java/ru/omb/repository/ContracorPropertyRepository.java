package ru.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.omb.entity.ContractorProperty;

import java.util.List;

@Repository
public interface ContracorPropertyRepository extends JpaRepository<ContractorProperty, Long> {

    @Query("SELECT cp " +
           "FROM ContractorProperty cp " +
           "JOIN PropertyType pt on pt.id = cp.propertyType.id " +
           "WHERE cp.contractor.id = ?1 and cp.propertyType.tag = 'PARAM_SYSTEM'")
    List<ContractorProperty> findSystemContractProperties(Long contractorId);
}
