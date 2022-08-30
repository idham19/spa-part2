package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.MenuData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

@GetMapping
public String processAddUserForm(Model model, @ModelAttribute User user,String verify) {
    model.addAttribute("title", "All Users");
    model.addAttribute("name",MenuData.getAll());
    model.addAttribute("users", MenuData.getAll());
    return "user/index";
}


}
