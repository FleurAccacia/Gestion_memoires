package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.Examinateur;
import com.example.gestion_memoire_app.service.ExaminateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/examinateurs")
public class ExaminateurController {

    @Autowired
    private ExaminateurService examinateurService;

    @GetMapping
    public List<Examinateur> getAllExaminateurs() {
        return examinateurService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Examinateur> getExaminateurById(@PathVariable Long id) {
        Optional<Examinateur> examinateur = examinateurService.findById(id);
        return examinateur.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Examinateur createExaminateur(@RequestBody Examinateur examinateur) {
        return examinateurService.save(examinateur);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Examinateur> updateExaminateur(@PathVariable Long id, @RequestBody Examinateur examinateurDetails) {
        Optional<Examinateur> examinateur = examinateurService.findById(id);
        if (examinateur.isPresent()) {
            examinateurDetails.setId(id);
            return ResponseEntity.ok(examinateurService.save(examinateurDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExaminateur(@PathVariable Long id) {
        examinateurService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}