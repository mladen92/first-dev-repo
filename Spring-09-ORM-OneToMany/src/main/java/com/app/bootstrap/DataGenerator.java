package com.app.bootstrap;

import com.app.entity.Address;
import com.app.entity.Person;
import com.app.repository.AddressRepository;
import com.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike", "Smith");
        Person p2 = new Person("Ron", "Smith");
        Person p3 = new Person("Steve", "Smith");

        Address a1 = new Address("123 S ", "12345");
        Address a2 = new Address("123 S ", "12345");
        Address a3 = new Address("123 S ", "12345");

        // p1.setAddresses(Arrays.asList(a1,a2));
        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);

        addressRepository.saveAll(Arrays.asList(a1, a2, a3));
        personRepository.save(p1);
    }
}
