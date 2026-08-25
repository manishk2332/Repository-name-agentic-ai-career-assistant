package com.career.agenticcareerassistant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobController {

    @GetMapping("/jobs")
    public String jobsPage() {
        return "jobs";
    }

    @PostMapping("/jobs/recommend")
    public String recommendJobs(
            @RequestParam("targetRole") String targetRole,
            @RequestParam("skills") String skills,
            Model model) {

        String role = targetRole.toLowerCase();
        String skillText = skills.toLowerCase();

        List<String> suitableRoles = new ArrayList<>();
        List<String> requiredSkills = new ArrayList<>();
        List<String> preparation = new ArrayList<>();

        // Java
        if (role.contains("java") || skillText.contains("java")) {

            suitableRoles.add("Java Developer");
            suitableRoles.add("Backend Developer");
            suitableRoles.add("Spring Boot Developer");
            suitableRoles.add("Software Engineer");

            requiredSkills.add("Core Java");
            requiredSkills.add("OOP");
            requiredSkills.add("Collections");
            requiredSkills.add("Spring Boot");
            requiredSkills.add("SQL / MySQL");
            requiredSkills.add("REST API");
            requiredSkills.add("Git & GitHub");
            requiredSkills.add("Data Structures & Algorithms");

            preparation.add("Strengthen Core Java and OOP.");
            preparation.add("Learn Spring Boot and REST APIs.");
            preparation.add("Practice SQL and database queries.");
            preparation.add("Solve DSA problems regularly.");
            preparation.add("Build 2-3 Java backend projects.");
        }

        // Web Development
        else if (role.contains("web") ||
                role.contains("frontend") ||
                role.contains("full stack")) {

            suitableRoles.add("Web Developer");
            suitableRoles.add("Frontend Developer");
            suitableRoles.add("Full Stack Developer");

            requiredSkills.add("HTML");
            requiredSkills.add("CSS");
            requiredSkills.add("JavaScript");
            requiredSkills.add("Git & GitHub");
            requiredSkills.add("REST API");
            requiredSkills.add("Database");

            preparation.add("Strengthen HTML, CSS and JavaScript.");
            preparation.add("Learn responsive web design.");
            preparation.add("Build frontend projects.");
            preparation.add("Learn APIs and database basics.");
        }

        // Python
        else if (role.contains("python") ||
                skillText.contains("python")) {

            suitableRoles.add("Python Developer");
            suitableRoles.add("Backend Developer");
            suitableRoles.add("Software Developer");

            requiredSkills.add("Python");
            requiredSkills.add("OOP");
            requiredSkills.add("SQL");
            requiredSkills.add("REST API");
            requiredSkills.add("Git & GitHub");

            preparation.add("Strengthen Python fundamentals.");
            preparation.add("Learn backend development.");
            preparation.add("Practice SQL.");
            preparation.add("Build Python projects.");
        }

        // Default
        else {

            suitableRoles.add("Software Developer");
            suitableRoles.add("Junior Software Engineer");
            suitableRoles.add("Backend Developer");

            requiredSkills.add("Programming Fundamentals");
            requiredSkills.add("Data Structures & Algorithms");
            requiredSkills.add("SQL");
            requiredSkills.add("Git & GitHub");
            requiredSkills.add("Problem Solving");

            preparation.add("Choose one primary programming language.");
            preparation.add("Practice DSA regularly.");
            preparation.add("Learn SQL and Git.");
            preparation.add("Build practical projects.");
        }

        model.addAttribute("targetRole", targetRole);
        model.addAttribute("skills", skills);
        model.addAttribute("suitableRoles", suitableRoles);
        model.addAttribute("requiredSkills", requiredSkills);
        model.addAttribute("preparation", preparation);

        return "jobs";
    }
}