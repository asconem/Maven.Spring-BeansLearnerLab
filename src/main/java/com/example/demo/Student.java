package com.example.demo;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student() {
        super();
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
