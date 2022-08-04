package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Tresor = new Student(
                    "Tresor",
                    "tresor@gmail.com",
                    LocalDate.of(2001, Month.APRIL,5)

        );
            Student Nebia = new Student("Nebia",
                    "nebia@gmail.com",
                    LocalDate.of(2004, Month.APRIL,5)

            );

            repository.saveAll(
                    List.of(Tresor,Nebia)
            );
        };
    }
}
