package com.tcs.springmvcorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        EmployeeT employee = new EmployeeT();
        model.addAttribute("employee", employee);
        return "employee-form";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") EmployeeT employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees/list";
    }
}

