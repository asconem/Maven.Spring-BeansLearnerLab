package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        List<Student> currentCohort = new ArrayList<>();
        currentCohort.add(new Student(1L, "Matt"));
        currentCohort.add(new Student(2L, "James"));
        currentCohort.add(new Student(3L, "Greg"));
        currentCohort.add(new Student(4L, "Adam"));

        return new Students(currentCohort);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        List<Student> previousCohort = new ArrayList<>();
        previousCohort.add(new Student(5L, "Mike"));
        previousCohort.add(new Student(6L, "Jon"));
        previousCohort.add(new Student(7L, "Trey"));
        previousCohort.add(new Student(8L, "Page"));

        return new Students(previousCohort);
    }
}
