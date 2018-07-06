package com.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.example.annotations.Greetings;

public class App {
    public static void main(String[] args) {
        Class<Annotated> annotated = Annotated.class;

        for (Method m: annotated.getDeclaredMethods()) {
           if (!m.isAnnotationPresent(Greetings.class)) 
               continue;
		   Annotation a = m.getAnnotation(Greetings.class);
           Greetings g = (Greetings) a;
           System.out.println("Greetings: " + g.message());
        }
    }
}
