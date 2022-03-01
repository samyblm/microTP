package com.example.tp1;

import com.example.tp1.entities.Adresse;
import com.example.tp1.entities.Employee;
import com.example.tp1.respository.DepartementRepository;
import com.example.tp1.respository.EmployeeRepository;
import com.example.tp1.respository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProjetRepository projetRepository;

    @Autowired
    DepartementRepository departementRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Employee c1 = new Employee();
        c1.setNom("samy");
        c1.setAdresse(Arrays.asList(
                new Adresse("skikda",22,"ville"),
                new Adresse("skikda",21,"sba")
        ));
        employeeRepository.save(c1);


    }
}
