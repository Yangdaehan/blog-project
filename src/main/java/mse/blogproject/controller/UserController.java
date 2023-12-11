package mse.blogproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/save")
    public String userSave() {
        return "layout/user/user-save";
    }
}