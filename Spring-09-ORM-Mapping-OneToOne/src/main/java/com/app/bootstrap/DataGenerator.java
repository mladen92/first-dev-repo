package com.app.bootstrap;

import com.app.entity.Department;
import com.app.entity.Employee;
import com.app.entity.Region;
import com.app.enums.Gender;
import com.app.repositories.DepartmentRepository;
import com.app.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataGenerator implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<Department> departmentList = new ArrayList<>();
        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006, 04, 20), Gender.F, 154864);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009, 01, 26), Gender.F, 56752);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010, 05, 17), Gender.F, 95313);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014, 03, 02), Gender.M, 119764);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003, 01, 14), Gender.M, 55307);

        Department d1 = new Department("Sports", "Outdoors");
        Department d2 = new Department("Tools", "Hardware");
        Department d3 = new Department("Clothing", "Home");
        Department d4 = new Department("Phones & Tablets", "Electronics");
        Department d5 = new Department("Computers", "Electronics");

        Region r1 = new Region("America", "USA");
        Region r2 = new Region("Europa", "Italy");
        Region r3 = new Region("Africa", "Egipt");
        Region r4 = new Region("Asia", "Japan");
        Region r5 = new Region("Australia", "Australia");

        e1.setDepartment(d1);
        e1.setRegion(r1);

        e2.setDepartment(d2);
        e2.setRegion(r2);

        e3.setDepartment(d3);
        e3.setRegion(r3);

        e4.setDepartment(d4);
        e4.setRegion(r1);

        e5.setDepartment(d5);
        e5.setRegion(r1);

        employeeList.addAll(Arrays.asList(e1, e2, e3, e4, e5));

        employeeRepository.saveAll(employeeList);
    }
}