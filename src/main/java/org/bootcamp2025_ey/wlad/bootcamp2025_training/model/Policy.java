package org.bootcamp2025_ey.wlad.bootcamp2025_training.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Policy extends BaseEntity {

    private String policyNumber;

    @ManyToOne
    @JoinColumn(name = "insured_id")
    private Insured insured;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "policy_id")
    private Set<Coverage> coverages = new LinkedHashSet<>();

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Set<Coverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(Set<Coverage> coverages) {
        this.coverages = coverages;
    }
}
