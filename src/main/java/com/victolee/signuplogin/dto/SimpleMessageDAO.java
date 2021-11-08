package com.victolee.signuplogin.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class SimpleMessageDAO {
    @Autowired JdbcTemplate jt;

    public List<Map<String, ?>> selectAll() {

        return jt.query("select * from sensor_result", (rs, rowNum) -> {
            Map<String, Object> mss = new HashMap<>();
            mss.put("result", rs.getInt(1));
            return mss;
        });
    }
}