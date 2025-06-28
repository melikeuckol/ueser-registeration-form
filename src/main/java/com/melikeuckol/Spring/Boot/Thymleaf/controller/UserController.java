package com.melikeuckol.Spring.Boot.Thymleaf.controller;


import com.melikeuckol.Spring.Boot.Thymleaf.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class UserController {
    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        addFormOptions(model);
        return "register";
    }

    @PostMapping("/register")
    public String processForm(@Valid @ModelAttribute("user") User user,
                              BindingResult result,
                              Model model){
        if(result.hasErrors()){
            addFormOptions(model);
            return "register";
        }
        model.addAttribute("message","Kayıt başarıyla tamamlandı.");
        return "register";
    }

    private void addFormOptions(Model model) {
        List<String> countries = Arrays.asList("Türkiye", "Almanya", "ABD", "Fransa");
        List<String> genders = Arrays.asList("Kadın", "Erkek", "Belirtmek istemiyorum");
        List<String> hobbies = Arrays.asList("Yüzme", "Kitap Okuma", "Müzik", "Seyahat");

        model.addAttribute("countries", countries);
        model.addAttribute("genders", genders);
        model.addAttribute("hobbyList", hobbies);
    }
}
