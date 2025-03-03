package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.Memoire;
import com.example.gestion_memoire_app.service.MemoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/memoires")
public class MemoireController {

    @Autowired
    private MemoireService memoireService;

    @GetMapping
    public List<Memoire> getAllMemoires() {
        return memoireService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Memoire> getMemoireById(@PathVariable Long id) {
        return memoireService.findById(id);
    }

    @PostMapping
    public Memoire createMemoire(@RequestBody Memoire memoire) {
        return memoireService.save(memoire);
    }

    @DeleteMapping("/{id}")
    public void deleteMemoire(@PathVariable Long id) {
        memoireService.deleteById(id);
    }
}