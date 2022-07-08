package com.tea.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {



	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
		System.out.println(dataSource.getConnection());
	}


}
