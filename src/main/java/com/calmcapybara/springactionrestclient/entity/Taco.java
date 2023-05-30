package com.calmcapybara.springactionrestclient.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tacos")
@NoArgsConstructor
@Getter
@Setter
@RestResource(rel = "tacos", path = "tacos")
public class Taco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "ingredient_taco",
            joinColumns = @JoinColumn(name = "taco_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<Ingredient> ingredientList = new ArrayList<>();

    @ManyToOne
    private TacoOrder tacoOrder;
}
