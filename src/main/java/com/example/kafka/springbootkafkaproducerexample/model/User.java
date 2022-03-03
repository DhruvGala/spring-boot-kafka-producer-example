package com.example.kafka.springbootkafkaproducerexample.model;

public class User {

    private String name;
    private String dept;
    private Integer salary;

    public User(String name, String dept, Integer salary ){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
