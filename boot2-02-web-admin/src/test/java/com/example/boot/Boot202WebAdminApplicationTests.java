package com.example.boot;

import com.example.boot.mapper.UserXMapper;
import com.example.boot.pojo.UserX;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
@Slf4j
class Boot202WebAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserXMapper userXMapper;

    @Test
    void contextLoads() {
        String sql = "select count(*) from t_product";
        Long sun = jdbcTemplate.queryForObject(sql, Long.class);
        log.info("查到的数据{}条",sun);

    }
    @Test
    void testUserXMapper(){
        UserX userX = userXMapper.selectById(1L);
        log.info("{}",userX);
    }


}