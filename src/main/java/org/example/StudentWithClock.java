package org.example;
import java.time.OffsetDateTime;

import static java.time.format.DateTimeFormatter.ofPattern;

public class StudentWithClock implements Learner {

    public StudentWithClock() {}

    @Override
    public void learn() {
        System.out.println("Я учусь. .zZ");
        System.out.println("Я закончил учиться");
        System.out.println("Текущее время: " + OffsetDateTime.now().format(ofPattern("HH:mm:ss")));
    }
}