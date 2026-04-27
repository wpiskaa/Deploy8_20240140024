package com.tugas.demo6.controller;

import com.tugas.demo6.model.User;
import com.tugas.demo6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // =====================
    // HALAMAN LOGIN
    // =====================
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // tampilkan login.html
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          Model model) {
        // username = admin, password = NIM kamu (ganti sesuai NIM kamu!)
        if (username.equals("admin") && password.equals("20240140024")) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Username atau password salah!");
            return "login";
        }
    }

    // =====================
    // HALAMAN HOME
    // =====================
    @GetMapping("/home")
    public String homePage(Model model) {
        List<User> userList = userRepository.findAll();
        model.addAttribute("userList", userList);
        return "home"; // tampilkan home.html
    }

    // =====================
    // HALAMAN FORM INPUT
    // =====================
    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form"; // tampilkan form.html
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute User user) {
        userRepository.save(user); // simpan ke database
        return "redirect:/home";
    }


    // =====================
    // LOGOUT
    // =====================
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }

    // =====================
    // HALAMAN GALLERY (LUCU)
    // =====================
    @GetMapping("/gallery")
    public String galleryPage() {
        return "gallery";
    }

    // =====================
    // HALAMAN ABOUT
    // =====================
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }


    // Redirect dari "/" ke login
    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }
}