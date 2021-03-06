package com.example.demo;

import java.util.Iterator;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
            learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner;

        Iterator<? extends Learner> iterator = learners.iterator();

        int length = 0;

        while (iterator.hasNext()){
            length++;
            iterator.next();
        }
        numberOfHoursPerLearner = numberOfHours / length;

        for (Learner l : learners){
            l.learn(numberOfHoursPerLearner);
        }
    }
}
