// src/main/java/com/example/gestion_memoire_app/controller/MemoireController.java
package com.example.gestion_memoire_app.controller;

import com.example.gestion_memoire_app.entity.Memoire;
import com.example.gestion_memoire_app.service.MemoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memoires")
public class MemoireController {
    @Autowired
    private MemoireService memoireService;

    @GetMapping
    public List<Memoire> getAllMemoires() {
        return memoireService.findAll();
    }

    @PostMapping
    public Memoire createMemoire(@RequestBody Memoire memoire) {
        return memoireService.save(memoire);
    }
}