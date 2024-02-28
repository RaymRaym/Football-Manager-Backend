package org.example.fifa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate born;

    @ManyToOne()
    @JoinColumn(name = "club_id")
    @JsonBackReference
    private Club club;

    @OneToMany(
            mappedBy = "player"
    )
    @JsonManagedReference
    private List<PlayerExperience> experiences;
}
