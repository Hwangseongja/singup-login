package com.victolee.signuplogin.domain.repository;

import com.victolee.signuplogin.domain.entity.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonthlySalesRepository extends JpaRepository<SensorEntity, String> {
    List<SensorEntity> findByDate(String date);
}
