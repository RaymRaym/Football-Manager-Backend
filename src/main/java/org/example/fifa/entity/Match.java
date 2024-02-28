package org.example.fifa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Club home;

    @OneToOne
    private Club away;

    private Integer homeGoal;

    private Integer awayGoal;

    private LocalDateTime time;




}
