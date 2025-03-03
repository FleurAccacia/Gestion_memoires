package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.PresidentJury;
import com.example.gestion_memoire_app.service.PresidentJuryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/presidentsjury")
public class PresidentJuryController {

    @Autowired
    private PresidentJuryService presidentJuryService;

    @GetMapping
    public List<PresidentJury> getAllPresidentsJury() {
        return presidentJuryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PresidentJury> getPresidentJuryById(@PathVariable Long id) {
        return presidentJury.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public PresidentJury createPresidentJury(@RequestBody PresidentJury presidentJury) {
        return presidentJuryService.save(presidentJury);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PresidentJury> updatePresidentJury(@PathVariable Long id, @RequestBody PresidentJury presidentJuryDetails) {
        Optional<PresidentJury> presidentJury = presidentJuryService.findById(id);
        if (presidentJury.isPresent()) {
            presidentJuryDetails.setId(id);
            return ResponseEntity.ok(presidentJuryService.save(presidentJuryDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePresidentJury(@PathVariable Long id) {
        presidentJuryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}