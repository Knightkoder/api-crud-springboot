package com.tasks.TaskDemoCoopeuch.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskDTO {

    @NotBlank(message = "The userid is required")
    private String userid;

    @NotBlank(message = "The title is required")
    private String title;

    @NotBlank(message = "The description es required")
    private String description;

    private Boolean completed;
}
