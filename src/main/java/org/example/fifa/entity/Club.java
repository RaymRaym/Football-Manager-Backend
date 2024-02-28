package org.example.fifa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToOne(
            mappedBy = "club"
    )
    private Stadium stadium;

    @OneToOne(
            mappedBy = "club",
            cascade = CascadeType.ALL
    )
    private Manager manager;

    @ManyToMany
    @JoinTable(
            name = "club_event",
            joinColumns = @JoinColumn(name = "club_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> events;

    @OneToMany(
            mappedBy = "club"
    )
    @JsonManagedReference
    private List<Player> players;
}
