package com.insight.grain.controllers;

import com.insight.grain.data.entities.GrainData;
import com.insight.grain.services.GrainDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grain")
public class GrainController {

    @Autowired
    private GrainDataService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/filter")
    public List<GrainData> filterGrainData(
            @RequestParam String type,
            @RequestParam String status,
            @RequestParam float minPercentage,
            @RequestParam float maxPercentage) {
        return service.filterGrainData(type, status, minPercentage, maxPercentage);
    }
}

