package com.versioning.apiexample.v2.service;

import com.versioning.apiexample.v2.controller.TaskControllerV2;
import com.versioning.apiexample.v2.model.TaskV2;
import com.versioning.apiexample.v2.repository.TaskRepositoryV2;
import org.springframework.stereotype.Service;
import com.versioning.apiexample.v2.exceptions.EntityNotFoundException;

import java.util.Collection;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class TaskServiceV2 {

    private TaskRepositoryV2 taskRepositoryV2;

    public TaskServiceV2(TaskRepositoryV2 taskRepositoryV2) {
        this.taskRepositoryV2 = taskRepositoryV2;
    }

    public Collection<TaskV2> findAll(){
        return taskRepositoryV2.findAll();
    }

    public TaskV2 add(TaskV2 taskV2) {
        TaskV2 task = taskRepositoryV2.save(taskV2);
        task.add(linkTo(methodOn(TaskControllerV2.class).findAllTasks()).withSelfRel());
        return task;
    }

    public TaskV2 findOne(Long id) {
        return taskRepositoryV2.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }
}
