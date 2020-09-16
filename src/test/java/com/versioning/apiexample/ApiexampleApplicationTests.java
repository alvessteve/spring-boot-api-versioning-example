package com.versioning.apiexample;

import com.versioning.apiexample.v1.controller.TaskControllerV1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApiexampleApplicationTests {

	@Autowired
	private TaskControllerV1 taskController;

	@Test
	void contextLoads() {
		assertThat(taskController).isNotNull();
	}

}
