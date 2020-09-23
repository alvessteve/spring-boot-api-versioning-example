package com.versioning.apiexample.v2.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TaskV2ControllerV2IntegrationTest {

    @LocalServerPort
    int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    void should_return_all_tasks() {
        given()
                .accept("application/vnd.myself.api.v2+json")
                .get("/tasks")
                .then().statusCode(200)
                .assertThat()
                .body("$", hasSize(3))
                .body("$.tasks[0].title", equalTo("Do laundry"))
                .body("$.tasks[0].owner", emptyOrNullString());
    }
}