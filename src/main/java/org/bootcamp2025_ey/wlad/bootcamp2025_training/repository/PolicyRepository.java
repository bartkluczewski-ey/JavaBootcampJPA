package org.bootcamp2025_ey.wlad.bootcamp2025_training.repository;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

    @Query("SELECT p FROM Policy p JOIN p.insured i JOIN i.customerAddress a WHERE a.city = :city")
    List<Policy> findPoliciesByInsuredCity(@Param("city") String city);


}
