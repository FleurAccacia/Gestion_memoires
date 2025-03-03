package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.Memoire;
import com.example.gestion_memoire_app.service.MemoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/memoires")
public class MemoireController {

    @Autowired
    private MemoireService memoireService;

    @GetMapping
    public List<Memoire> getAllMemoires() {
        return memoireService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Memoire> getMemoireById(@PathVariable Long id) {
        Optional<Memoire> memoire = memoireService.findById(id);
        return memoire.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Memoire createMemoire(@RequestBody Memoire memoire) {
        return memoireService.save(memoire);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Memoire> updateMemoire(@PathVariable Long id, @RequestBody Memoire memoireDetails) {
        Optional<Memoire> memoire = memoireService.findById(id);
        if (memoire.isPresent()) {
            memoireDetails.setId(id);
            return ResponseEntity.ok(memoireService.save(memoireDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMemoire(@PathVariable Long id) {
        memoireService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}