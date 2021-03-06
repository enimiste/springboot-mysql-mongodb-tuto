package com.example.mysqlmongodb.backend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_ID")
    private Integer id;
    @Column(name = "_USERNAME")
    private String username;

    @ManyToOne
    private Departement departement;

    /*
    You should avoid linking entities from the entity package with those from mongo
     */
}
