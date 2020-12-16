package com.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Department extends BaseEntity {

    private String department;
    private String devision;

    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String department, String devision) {
        this.department = department;
        this.devision = devision;
    }
}
