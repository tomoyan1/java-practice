package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String info() {
        return "employee_info";
    }
    @GetMapping("/view")
    public String employee_detail_view() {
        return "employee_detail_view";
    }

    @GetMapping("/edit")
    public String employee_detail_edit() {
        return "employee_detail_edit";
    }

    
}