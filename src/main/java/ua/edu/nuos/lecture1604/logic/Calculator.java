package ua.edu.nuos.lecture1604.logic;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int calcSteps(double start, double end, double step) {
        return (int) Math.round((end - start) / step) + 1;
    }
}
