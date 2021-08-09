package com.lazybond.springbootjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@Test
	public void contextLoads() {
		logger.info("#### Test Case is executed ####");
		Assertions.assertEquals(true, true);
	}

}
