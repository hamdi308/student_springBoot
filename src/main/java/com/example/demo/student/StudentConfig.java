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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args->{
           Student Hamdi1= new Student(1L,
                    "Hamdi1",
                    "haddahamdi1@gmail.com",
                    LocalDate.of(1998, Month.JUNE, 28));
            Student Hamdi2= new Student(2L,
                    "Hamdi2",
                    "haddahamdi2@gmail.com",
                    LocalDate.of(1999, Month.AUGUST, 29));
            Student Hamdi3= new Student(3L,
                    "Hamdi3",
                    "haddahamdi3@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 30));
            Student Hamdi4= new Student(4L,
                    "Hamdi4",
                    "haddahamdi4@gmail.com",
                    LocalDate.of(2001, Month.APRIL, 1));
            studentRepository.saveAll(List.of(Hamdi1,Hamdi2,Hamdi3,Hamdi4));
        };
    }
}
