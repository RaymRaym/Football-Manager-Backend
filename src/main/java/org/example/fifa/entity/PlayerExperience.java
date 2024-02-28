package org.example.fifa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class PlayerExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalTime start;

    private LocalTime end;

    @OneToOne
    private Club club;

    @ManyToOne
    @JoinColumn(name = "player_id")
    @JsonBackReference
    private Player player;
}
