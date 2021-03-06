package com.app.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mentor {

    private String firstname;
    private String lastName;
    private String email;
    private String gender;
    private boolean graduated;
    private String batch;
    private String company;


}
