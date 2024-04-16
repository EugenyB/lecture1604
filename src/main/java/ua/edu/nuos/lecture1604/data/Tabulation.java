package ua.edu.nuos.lecture1604.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tabulation {
    private double start;
    private double end;
    private double step;
    private int steps;
}
