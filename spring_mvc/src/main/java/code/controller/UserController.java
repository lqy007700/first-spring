package code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/save")
    public String save() {
        System.out.println("controller save running...");
        return "success.jsp";
    }
}
