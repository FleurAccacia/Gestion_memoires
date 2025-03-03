package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.Memoire;
import com.example.gestion_memoire_app.repository.MemoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemoireService {

    @Autowired
    private MemoireRepository memoireRepository;

    public List<Memoire> findAll() {
        return memoireRepository.findAll();
    }

    public Optional<Memoire> findById(Long id) {
        return memoireRepository.findById(id);
    }

    public Memoire save(Memoire memoire) {
        return memoireRepository.save(memoire);
    }

    public void deleteById(Long id) {
        memoireRepository.deleteById(id);
    }
}