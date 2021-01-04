package com.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    public Person( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @OneToMany(mappedBy = "person")
    private List<Address> addresses;

//    Same thing but different way
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "person_id")
//   private List<Address> addresses;
}
