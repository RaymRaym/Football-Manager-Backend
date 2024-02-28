package org.example.fifa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    @OneToMany(
            mappedBy = "country"
    )
    @JsonManagedReference
    private List<City> Cities;

    @OneToMany(
            mappedBy = "country"
    )
    @JsonManagedReference
    private List<Event> events;


}
