package com.example.hello.service;

import com.example.hello.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public HelloWorld getHelloWorld(){
        HelloWorld hello = new HelloWorld();
        hello.setValue("Hello World");
        return hello;
    }
}
