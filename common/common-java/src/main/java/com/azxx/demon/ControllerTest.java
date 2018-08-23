package com.azxx.demon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/abc")
public class ControllerTest {

    @GetMapping("/hello")
    public String handle(Model model) {
        model.addAttribute("message", "Spring Mvc");
        return "index";
    }
}
