package com.tea.demo.mapper;

import com.tea.demo.entity.Admin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminMapperTests {
    @Autowired
    AdminMapper mapper;

    @Test
    public void testInsertSuccessfully(){
        String username = "fwt";
        String password = "000000";
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        Assertions.assertDoesNotThrow(() -> {
            int rows = mapper.insert(admin);
            Assertions.assertEquals(1, rows);
            Assertions.assertEquals(1L, admin.getId());

        });
    }

    @Test
    public void testSelectByUsername(){
        String username="admin";
        String password="000000";
        Admin admin=new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        Admin adminSelect=mapper.selectByUsername(username);
        if(adminSelect==null){
            Assertions.assertDoesNotThrow(() -> {
                int rows = mapper.insert(admin);
                Assertions.assertEquals(1, rows);
                Assertions.assertEquals(1L, admin.getId());
            });
        }else{
            System.out.println("用户名已不存在");
        }
    }

}
