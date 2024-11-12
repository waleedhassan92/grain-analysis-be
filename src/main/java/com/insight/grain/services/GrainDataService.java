package com.insight.grain.services;

import com.insight.grain.data.entities.GrainData;
import com.insight.grain.data.repositories.GrainDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrainDataService {

    @Autowired
    private GrainDataRepository repository;

    public List<GrainData> filterGrainData(String type, String status, float minPercentage, float maxPercentage) {
        return repository.findByTypeAndStatusAndPercentageNamiBetween(type, status, minPercentage, maxPercentage);
    }
}

