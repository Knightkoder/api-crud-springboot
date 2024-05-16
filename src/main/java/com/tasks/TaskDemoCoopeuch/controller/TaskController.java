package com.tasks.TaskDemoCoopeuch.controller;

import com.tasks.TaskDemoCoopeuch.dto.TaskDTO;
import com.tasks.TaskDemoCoopeuch.entity.Task;
import com.tasks.TaskDemoCoopeuch.service.TaskServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RequestMapping("/api/v1/tasks")
@RestController
public class TaskController {

    private final TaskServiceImpl taskService;

    @GetMapping
    public Iterable<Task> list() {
        return taskService.findAll();
    }

    @GetMapping("{id}")
    public Task get(@PathVariable Integer id){
        return taskService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Task create(@Validated @RequestBody TaskDTO taskDTO) {
        return taskService.create(taskDTO);
    }

    @PatchMapping("{id}")
    public Task update(@PathVariable Integer id,
                          @Validated @RequestBody TaskDTO taskDTO ) {
        return taskService.update(id, taskDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id ) {
        taskService.delete(id);
    }
}
