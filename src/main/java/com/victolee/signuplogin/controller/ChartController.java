package com.victolee.signuplogin.controller;

import com.victolee.signuplogin.domain.entity.SensorEntity;
import com.victolee.signuplogin.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChartController {
    @Autowired
    ChartService chartService;

    @GetMapping("/Sensorlistshow/date")
    public List<SensorEntity> Sensorlistshow(String date){
        List<SensorEntity> Sensorlist = chartService.getSensorEntity(date);
        return Sensorlist;
    }
}