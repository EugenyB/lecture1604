package ua.edu.nuos.lecture1604.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.edu.nuos.lecture1604.data.Student;
import ua.edu.nuos.lecture1604.data.Tabulation;
import ua.edu.nuos.lecture1604.logic.Calculator;

@Controller
@AllArgsConstructor
public class StudentController {

    private Calculator calculator;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name,
                        @RequestParam int age,
                        @RequestParam double rating,
                        Model model) {

        Student s = new Student(name, age, rating);
        model.addAttribute("student", s);
        return "hello";
    }

    @RequestMapping("/calculate")
    public String calculate(
            @RequestParam double start,
            @RequestParam double end,
            @RequestParam double step,
            Model model) {

        int steps = calculator.calcSteps(start, end, step);

        model.addAttribute("tab", new Tabulation(start, end, step, steps));
        return "calculate";
    }
}
