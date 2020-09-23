package com.versioning.apiexample.v2.repository;

import com.versioning.apiexample.v2.model.TaskV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepositoryV2 extends JpaRepository<TaskV2, Long> {
}
