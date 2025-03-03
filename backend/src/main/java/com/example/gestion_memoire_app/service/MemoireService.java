// src/main/java/com/example/gestion_memoire_app/service/MemoireService.java
package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.Memoire;
import com.example.gestion_memoire_app.repository.MemoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoireService {
    @Autowired
    private MemoireRepository memoireRepository;

    public List<Memoire> findAll() {
        return memoireRepository.findAll();
    }

    public Memoire save(Memoire memoire) {
        return memoireRepository.save(memoire);
    }
}