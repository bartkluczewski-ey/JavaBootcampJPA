package org.bootcamp2025_ey.wlad.bootcamp2025_training.service;

import org.springframework.transaction.annotation.Transactional;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    private final PolicyRepository policyRepository;

    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @Transactional
    public Policy createPolicy(Policy policy){
        return policyRepository.save(policy);
    }

    @Transactional
    public Policy getPolicyById(Long id){
        return policyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Policy with id; "+id+" not found"));
    }

    @Transactional
    public List<Policy> getAllPolicies(){
        return policyRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Policy> getPoliciesByCity(String city){
        return policyRepository.findPoliciesByInsuredCity(city);
    }

}
