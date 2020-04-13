package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUSAInstructors")
    public Instructors tcUSAInstructors() {
        List<Instructor> unitedStatesList = new ArrayList<>();
        unitedStatesList.add(new Instructor(1L, "James Smith"));
        unitedStatesList.add(new Instructor(2L, "Scott McDonald"));
        unitedStatesList.add(new Instructor(3L, "Harrison Jensen"));
        unitedStatesList.add(new Instructor(4L, "Timothy Johnson"));
        return new Instructors(unitedStatesList);
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors() {
        List<Instructor> unitedKingdomList = new ArrayList<>();
        unitedKingdomList.add(new Instructor(5L, "Archibald McLaurie"));
        unitedKingdomList.add(new Instructor(6L, "Martin McCartney"));
        unitedKingdomList.add(new Instructor(7L, "Paul Windsor"));
        unitedKingdomList.add(new Instructor(8L, "Ronald Douglas"));
        return new Instructors(unitedKingdomList);
    }

    @Bean(name = "zcwInstructors")
    @Primary
    public Instructors instructors() {
        List<Instructor> zipCodeWilmington = new ArrayList<>();
        zipCodeWilmington.add(new Instructor(9L, "Kris Younger"));
        zipCodeWilmington.add(new Instructor(10L, "Chris Nobles"));
        zipCodeWilmington.add(new Instructor(11L, "Dolio Durant"));
        zipCodeWilmington.add(new Instructor(12L, "Roberto DeDeus"));
        zipCodeWilmington.add(new Instructor(13L, "Froilan Miranda"));
        return new Instructors(zipCodeWilmington);
    }
}
