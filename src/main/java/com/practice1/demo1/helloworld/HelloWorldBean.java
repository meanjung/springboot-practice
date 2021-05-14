package com.practice1.demo1.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter, setter, equals, toString
@AllArgsConstructor//constructor
@NoArgsConstructor//default constructor
public class HelloWorldBean {
    private String message;
}
