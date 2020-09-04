package com.cjc.funding.test;

import com.cjc.funding.entity.Admin;
import com.cjc.funding.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml"})
public class CrowTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testAdminMapperInsert(){
        Admin admin = new Admin(null,"cjc","cjc1316",
                "cjc1316@qq.com","cjc",null);
        adminMapper.insert(admin);

    }

    @Test
    public void test01(){
        Connection connection=null;
        try {
            connection= dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connection);
    }



}
