package com.career.agenticcareerassistant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final AIService aiService;

    public HomeController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/ask")
    public String askAI(
            @RequestParam("question") String question,
            Model model) {

        String answer = aiService.askAI(question);

        model.addAttribute("question", question);
        model.addAttribute("answer", answer);

        return "index";
    }
}