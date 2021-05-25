package com.example.midproj.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
      return args -> {
          Student mariam = new Student(
                  "Mariam",
                  "mariam.jamal@gmail.com",
                  LocalDate.of(2000, 4, 5)

          );

          Student alex = new Student(
                  "Alex",
                  "alex.jamal@gmail.com",
                  LocalDate.of(2004, 4, 5)

          );

          Student nicholas = new Student(
                  "Nicholas",
                  "nicholas.344@gmail.com",
                  LocalDate.of(2002, 7, 13)

          );

          Student amina = new Student(
                  "Amina",
                  "amina15@gmail.com",
                  LocalDate.of(2000, 5, 15)

          );

          Student nikolay = new Student(
                  "Nikolay",
                  "nikolay16LOSHARA@gmail.com",
                  LocalDate.of(2003, 7, 16)

          );

          Student besh = new Student(
                  "Rakhat Tanirbergen",
                  "besh2000_GOOGLE20000@gmail.com",
                  LocalDate.of(2000, 3, 6)

          );

          Student ake = new Student(
                  "Akezhan",
                  "hulk2000@gmail.com",
                  LocalDate.of(2000, 4, 11)

          );

          Student dima = new Student(
                  "Dima",
                  "hulk2000@gmail.com",
                  LocalDate.of(2000, 4, 11)

          );

          repository.saveAll(
                  List.of(mariam,alex, nicholas, amina, nikolay, besh, ake, dima)
          );
      };
    }
}
