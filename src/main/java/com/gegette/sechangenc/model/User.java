package com.gegette.sechangenc.model;

import io.micrometer.core.lang.NonNull;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, updatable = false)
    private Long id;

    @NonNull
    @Column(nullable = false, name = "EMAIL")
    private String email;

    @NonNull
    @Column(nullable = false, name = "FIRST_NAME")
    private String firstName;

    @NonNull
    @Column(nullable = false, name = "LAST_NAME")
    private String lastName;

    public User(Long id) {
        this.id = id;
    }
}