package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.FicheDeStage;
import com.example.gestion_memoire_app.service.FicheDeStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fichesdestage")
public class FicheDeStageController {

    @Autowired
    private FicheDeStageService ficheDeStageService;

    @GetMapping
    public List<FicheDeStage> getAllFichesDeStage() {
        return ficheDeStageService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FicheDeStage> getFicheDeStageById(@PathVariable Long id) {
        Optional<FicheDeStage> ficheDeStage = ficheDeStageService.findById(id);
        return ficheDeStage.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public FicheDeStage createFicheDeStage(@RequestBody FicheDeStage ficheDeStage) {
        return ficheDeStageService.save(ficheDeStage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FicheDeStage> updateFicheDeStage(@PathVariable Long id, @RequestBody FicheDeStage ficheDeStageDetails) {
        Optional<FicheDeStage> ficheDeStage = ficheDeStageService.findById(id);
        if (ficheDeStage.isPresent()) {
            ficheDeStageDetails.setId(id);
            return ResponseEntity.ok(ficheDeStageService.save(ficheDeStageDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFicheDeStage(@PathVariable Long id) {
        ficheDeStageService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}