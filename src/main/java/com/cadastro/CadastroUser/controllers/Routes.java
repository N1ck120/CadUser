/*Controle das rotas*/
package com.cadastro.CadastroUser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Routes {
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup.html";
    }

    @GetMapping("/account")
    public String account() {
        return "account.html";
    }

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
