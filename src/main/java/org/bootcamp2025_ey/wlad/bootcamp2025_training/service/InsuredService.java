package org.bootcamp2025_ey.wlad.bootcamp2025_training.service;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Insured;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.InsuredCustomDAOJPA;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.InsuredsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuredService {

    private InsuredsRepository repository;
    private InsuredCustomDAOJPA customDAOJPA;

    public InsuredService(InsuredsRepository repository, InsuredCustomDAOJPA customDAOJPA) {
        this.repository = repository;
        this.customDAOJPA = customDAOJPA;
    }

    public List<Insured> getAllInsureds() {
        return repository.findAll();
    }

    public Insured saveInsured(Insured insured) {
        return repository.save(insured);
    }

    public List<Insured> getInsuredsForCity(String city) {
        return customDAOJPA.findInsuredsForCity(city);
    }
}
