package com.tea.demo.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private Long id;
    private String username;
    private String password;
}
