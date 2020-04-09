package com.example.demo;

public class Instructor extends Person implements Teacher {
    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = 0;

        for (Learner element : learners) {
            element.learn(numberOfHoursPerLearner);
        }
    }
}
