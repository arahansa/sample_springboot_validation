package com.arahansa.samplevalidation.controller;

import com.arahansa.samplevalidation.domain.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.util.Pair;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestApi {
    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/")
    public List<String> beanList(){
        return Arrays.asList(applicationContext.getBeanDefinitionNames());
    }

    @GetMapping("/sample")
    public Sample validateSample(@Validated Sample sample, BindingResult result){
        System.out.println(result);
        System.out.println(sample);
        return sample;
    }

    @GetMapping("/sample2")
    public Sample validateSample2(@Valid Sample sample, BindingResult result){
        System.out.println(result);
        System.out.println(sample);
        return sample;
    }
}
