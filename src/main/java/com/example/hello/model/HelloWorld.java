package com.example.hello.model;

public class HelloWorld {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return this.getValue();
    }
}
