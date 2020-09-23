package com.versioning.apiexample.v2.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.*;
import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME;

@Entity
@Data
@Table(name = "tasks")
public class TaskV2 extends RepresentationModel<TaskV2> {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String owner;

    @NotNull
    @DateTimeFormat(iso = DATE_TIME)
    private Date deadline;

    private boolean done;

}
