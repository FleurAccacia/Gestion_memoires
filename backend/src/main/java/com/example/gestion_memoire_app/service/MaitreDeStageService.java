package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.MaitreDeStage;
import com.example.gestion_memoire_app.repository.MaitreDeStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaitreDeStageService {

    @Autowired
    private MaitreDeStageRepository maitreDeStageRepository;

    public List<MaitreDeStage> findAll() {
        return maitreDeStageRepository.findAll();
    }

    public Optional<MaitreDeStage> findById(Long id) {
        return maitreDeStageRepository.findById(id);
    }

    public MaitreDeStage save(MaitreDeStage maitreDeStage) {
        return maitreDeStageRepository.save(maitreDeStage);
    }

    public void deleteById(Long id) {
        maitreDeStageRepository.deleteById(id);
    }
}