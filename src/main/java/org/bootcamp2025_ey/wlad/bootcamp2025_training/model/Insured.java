package org.bootcamp2025_ey.wlad.bootcamp2025_training.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "insureds")
public class Insured extends BaseEntity {


    @Column(name = "full_name", nullable = false, length = 120)
    private String fullName;
    private String birthDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private CustomerAddress customerAddress;

    @JsonManagedReference
    @OneToMany(mappedBy = "insured", orphanRemoval = true)
    private Set<Policy> policies = new LinkedHashSet<>();

    public Insured() {
    }

    public Insured(String fullName, String birthDate, CustomerAddress customerAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.customerAddress = customerAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Set<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(Set<Policy> policies) {
        this.policies = policies;
    }
}
