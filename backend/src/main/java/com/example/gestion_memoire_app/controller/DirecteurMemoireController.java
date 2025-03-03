package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.DirecteurMemoire;
import com.example.gestion_memoire_app.service.DirecteurMemoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/directeursmemoire")
public class DirecteurMemoireController {

    @Autowired
    private DirecteurMemoireService directeurMemoireService;

    @GetMapping
    public List<DirecteurMemoire> getAllDirecteursMemoire() {
        return directeurMemoireService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirecteurMemoire> getDirecteurMemoireById(@PathVariable Long id) {
        return directeurMemoire.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public DirecteurMemoire createDirecteurMemoire(@RequestBody DirecteurMemoire directeurMemoire) {
        return directeurMemoireService.save(directeurMemoire);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DirecteurMemoire> updateDirecteurMemoire(@PathVariable Long id, @RequestBody DirecteurMemoire directeurMemoireDetails) {
        Optional<DirecteurMemoire> directeurMemoire = directeurMemoireService.findById(id);
        if (directeurMemoire.isPresent()) {
            directeurMemoireDetails.setId(id);
            return ResponseEntity.ok(directeurMemoireService.save(directeurMemoireDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDirecteurMemoire(@PathVariable Long id) {
        directeurMemoireService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}