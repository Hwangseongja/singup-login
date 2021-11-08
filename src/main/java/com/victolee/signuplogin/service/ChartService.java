package com.victolee.signuplogin.service;

import com.victolee.signuplogin.domain.entity.MemberEntity;
import com.victolee.signuplogin.domain.entity.SensorEntity;
import com.victolee.signuplogin.domain.repository.MonthlySalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChartService {
    @Autowired
    MonthlySalesRepository monthlySalesRepository;


    public List<SensorEntity> getSensorEntity(String date){
        List<SensorEntity> list = monthlySalesRepository.findByDate(date);
        System.out.println(list.size());
        return list;
    }

}
