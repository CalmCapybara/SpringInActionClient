package com.calmcapybara.springactionclient.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "taco_orders")
@NoArgsConstructor
@Getter
@Setter
public class TacoOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    @OneToMany(mappedBy = "tacoOrder", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Taco> tacoList = new ArrayList<>();

    @ManyToOne
    @JsonBackReference
    private User user;
}
