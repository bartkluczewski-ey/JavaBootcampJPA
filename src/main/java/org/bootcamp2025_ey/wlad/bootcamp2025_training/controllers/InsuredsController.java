package org.bootcamp2025_ey.wlad.bootcamp2025_training.controllers;

import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Insured;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.service.InsuredService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insureds")
public class InsuredsController {

    private InsuredService insuredService;

    public InsuredsController(InsuredService insuredService) {
        this.insuredService = insuredService;
    }

    @GetMapping
    public List<Insured> getAllInsureds() {
        return insuredService.getAllInsureds();
    }

    @GetMapping("/{city}")
    public List<Insured> getAllInsuredsInTheCity(@PathVariable String city) {
        return insuredService.getInsuredsForCity(city);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Insured createInsured(@RequestBody Insured insured) {
        return insuredService.saveInsured(insured);
    }
}
