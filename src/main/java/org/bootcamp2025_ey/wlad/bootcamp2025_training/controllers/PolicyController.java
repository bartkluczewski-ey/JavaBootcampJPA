package org.bootcamp2025_ey.wlad.bootcamp2025_training.controllers;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Policy;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.service.PolicyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    private final PolicyService policyService;

    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @PostMapping
    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy){
        Policy createdPolicy = policyService.createPolicy(policy);
        return new ResponseEntity<>(createdPolicy, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Policy>> getAllPolicies(){
        List<Policy> policies = policyService.getAllPolicies();
        return ResponseEntity.ok(policies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Policy> getPolicyById(@PathVariable Long id){
        Policy policy = policyService.getPolicyById(id);
        return ResponseEntity.ok(policy);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<Policy>> getPoliciesByCity(@PathVariable String city){
        List<Policy> policies = policyService.getPoliciesByCity(city);
        return ResponseEntity.ok(policies);
    }
}
