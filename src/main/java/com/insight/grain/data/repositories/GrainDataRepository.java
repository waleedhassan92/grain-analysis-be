package com.insight.grain.data.repositories;

import com.insight.grain.data.entities.GrainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrainDataRepository extends JpaRepository<GrainData, Long> {
    List<GrainData> findByTypeAndStatusAndPercentageNamiBetween(String type, String status, float minPercentage, float maxPercentage);
}