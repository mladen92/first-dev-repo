package com.app.model;

import com.app.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mentor {

    private String firstName;
    private String lastName;
    private int age;
    private com.app.enums.Gender Gender;

}
