package net.jackrichter.springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_notes")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String body;

    private String category;
}
