package com.tea.demo.mapper;

import com.baomidou.mybatisplus.annotation.SqlParser;
import com.tea.demo.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    int insert(Admin admin);
    Admin selectByUsername(String username);
}
