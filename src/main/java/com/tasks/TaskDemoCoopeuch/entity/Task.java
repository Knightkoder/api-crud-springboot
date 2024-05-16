package com.tasks.TaskDemoCoopeuch.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@Data
@Entity
@Builder
@Table(name= "tasks")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String userid;

    @NonNull
    private String title;

    @NonNull
    private String description;

    @NonNull
    private boolean completed;

    @NonNull
    private LocalDateTime createdAt;
}
