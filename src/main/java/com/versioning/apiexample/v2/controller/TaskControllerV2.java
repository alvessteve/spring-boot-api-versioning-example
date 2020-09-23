package com.versioning.apiexample.v2.controller;

import com.versioning.apiexample.v2.model.TaskV2;
import com.versioning.apiexample.v2.service.TaskServiceV2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class TaskControllerV2 {

    private TaskServiceV2 taskServiceV2;

    public TaskControllerV2(TaskServiceV2 taskServiceV2) {
        this.taskServiceV2 = taskServiceV2;
    }

    @GetMapping(value = "/tasks", produces = "application/vnd.myself.api.v2+json")
    public Collection<TaskV2> findAllTasks() {
        return taskServiceV2.findAll();
    }

    @GetMapping(value = "/task/{id}", consumes = APPLICATION_JSON_VALUE, produces = "application/vnd.myself.api.v2+json")
    public TaskV2 find(@PathVariable Long id) {
        return taskServiceV2.findOne(id);
    }

    @PostMapping(value = "/tasks", produces = "application/vnd.myself.api.v2+json", consumes = APPLICATION_JSON_VALUE)
    public TaskV2 addTask(@RequestBody @Validated TaskV2 taskV2) {
        return taskServiceV2.add(taskV2);
    }

}
