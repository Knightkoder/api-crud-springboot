package com.tasks.TaskDemoCoopeuch.repository;

import com.tasks.TaskDemoCoopeuch.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
