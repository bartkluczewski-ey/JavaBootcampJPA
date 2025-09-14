package org.bootcamp2025_ey.wlad.bootcamp2025_training.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Coverage extends BaseEntity {

    private String name;
    private String description;
    private BigDecimal sumCovered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getSumCovered() {
        return sumCovered;
    }

    public void setSumCovered(BigDecimal sumCovered) {
        this.sumCovered = sumCovered;
    }
}
