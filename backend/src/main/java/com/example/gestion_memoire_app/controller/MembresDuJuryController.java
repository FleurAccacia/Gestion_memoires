package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.MembresDuJury;
import com.example.gestion_memoire_app.service.MembresDuJuryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/membresdujury")
public class MembresDuJuryController {

    @Autowired
    private MembresDuJuryService membresDuJuryService;

    @GetMapping
    public List<MembresDuJury> getAllMembresDuJury() {
        return membresDuJuryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MembresDuJury> getMembresDuJuryById(@PathVariable Long id) {
        Optional<MembresDuJury> membresDuJury = membresDuJuryService.findById(id);
        return membresDuJury.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public MembresDuJury createMembresDuJury(@RequestBody MembresDuJury membresDuJury) {
        return membresDuJuryService.save(membresDuJury);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MembresDuJury> updateMembresDuJury(@PathVariable Long id, @RequestBody MembresDuJury membresDuJuryDetails) {
        Optional<MembresDuJury> membresDuJury = membresDuJuryService.findById(id);
        if (membresDuJury.isPresent()) {
            membresDuJuryDetails.setId(id);
            return ResponseEntity.ok(membresDuJuryService.save(membresDuJuryDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMembresDuJury(@PathVariable Long id) {
        membresDuJuryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}