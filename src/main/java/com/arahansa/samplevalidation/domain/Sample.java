package com.arahansa.samplevalidation.domain;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class Sample {

    @NotBlank
    private String name;

    @Positive
    private int age;

    // 동의여부
    @AssertTrue
    private boolean agree;


    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", agree=" + agree +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setAgree(boolean agree) {
        this.agree = agree;
    }
}
