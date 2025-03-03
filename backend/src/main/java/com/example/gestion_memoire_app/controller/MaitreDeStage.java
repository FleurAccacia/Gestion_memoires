package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.MaitreDeStage;
import com.example.gestion_memoire_app.service.MaitreDeStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/maitresdestage")
public class MaitreDeStageController {

    @Autowired
    private MaitreDeStageService maitreDeStageService;

    @GetMapping
    public List<MaitreDeStage> getAllMaitresDeStage() {
        return maitreDeStageService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaitreDeStage> getMaitreDeStageById(@PathVariable Long id) {
        return maitreDeStage.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public MaitreDeStage createMaitreDeStage(@RequestBody MaitreDeStage maitreDeStage) {
        return maitreDeStageService.save(maitreDeStage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaitreDeStage> updateMaitreDeStage(@PathVariable Long id, @RequestBody MaitreDeStage maitreDeStageDetails) {
        Optional<MaitreDeStage> maitreDeStage = maitreDeStageService.findById(id);
        if (maitreDeStage.isPresent()) {
            maitreDeStageDetails.setId(id);
            return ResponseEntity.ok(maitreDeStageService.save(maitreDeStageDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaitreDeStage(@PathVariable Long id) {
        maitreDeStageService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}