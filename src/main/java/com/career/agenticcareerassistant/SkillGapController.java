package com.career.agenticcareerassistant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SkillGapController {

    @GetMapping("/skill-gap")
    public String skillGapPage() {
        return "skill-gap";
    }

    @PostMapping("/skill-gap/analyze")
    public String analyzeSkillGap(
            @RequestParam("targetRole") String targetRole,
            @RequestParam("skills") String skills,
            Model model) {

        String role = targetRole.toLowerCase();
        String skillText = skills.toLowerCase();

        List<String> currentSkills = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();
        List<String> highPriority = new ArrayList<>();
        List<String> actionPlan = new ArrayList<>();

        String[] allSkills = {
                "java",
                "c++",
                "python",
                "html",
                "css",
                "javascript",
                "sql",
                "mysql",
                "spring boot",
                "rest api",
                "git",
                "github",
                "data structures",
                "algorithms",
                "mongodb"
        };

        for (String skill : allSkills) {

            if (skillText.contains(skill)) {
                currentSkills.add(skill);
            }
        }

        // Java Developer
        if (role.contains("java") || skillText.contains("java")) {

            String[] required = {
                    "java",
                    "spring boot",
                    "sql",
                    "rest api",
                    "git",
                    "data structures"
            };

            for (String skill : required) {

                if (!skillText.contains(skill)) {
                    missingSkills.add(skill);
                }
            }

            highPriority.add("Spring Boot");
            highPriority.add("SQL / MySQL");
            highPriority.add("Data Structures & Algorithms");

            actionPlan.add("Learn Spring Boot and build a CRUD REST API.");
            actionPlan.add("Practice SQL queries, JOIN and database operations.");
            actionPlan.add("Practice DSA problems regularly.");
            actionPlan.add("Learn Git and GitHub workflow.");
            actionPlan.add("Build at least one complete Java backend project.");
        }

        // Web Developer
        else if (role.contains("web")
                || role.contains("frontend")
                || role.contains("full stack")) {

            String[] required = {
                    "html",
                    "css",
                    "javascript",
                    "rest api",
                    "git"
            };

            for (String skill : required) {

                if (!skillText.contains(skill)) {
                    missingSkills.add(skill);
                }
            }

            highPriority.add("JavaScript");
            highPriority.add("REST API");
            highPriority.add("Git");

            actionPlan.add("Strengthen HTML and CSS.");
            actionPlan.add("Practice JavaScript and DOM manipulation.");
            actionPlan.add("Learn REST APIs.");
            actionPlan.add("Learn Git and GitHub.");
            actionPlan.add("Build responsive frontend projects.");
        }

        // Python Developer
        else if (role.contains("python")
                || skillText.contains("python")) {

            String[] required = {
                    "python",
                    "sql",
                    "rest api",
                    "git"
            };

            for (String skill : required) {

                if (!skillText.contains(skill)) {
                    missingSkills.add(skill);
                }
            }

            highPriority.add("Python");
            highPriority.add("SQL");
            highPriority.add("REST API");

            actionPlan.add("Strengthen Python fundamentals and OOP.");
            actionPlan.add("Learn SQL and database operations.");
            actionPlan.add("Learn REST API development.");
            actionPlan.add("Learn Git and GitHub.");
            actionPlan.add("Build a Python backend project.");
        }

        // Data Analyst
        else if (role.contains("data")
                || role.contains("analyst")
                || role.contains("analytics")) {

            String[] required = {
                    "python",
                    "sql"
            };

            for (String skill : required) {

                if (!skillText.contains(skill)) {
                    missingSkills.add(skill);
                }
            }

            highPriority.add("SQL");
            highPriority.add("Python");
            highPriority.add("Data Analysis");

            actionPlan.add("Learn SQL thoroughly.");
            actionPlan.add("Learn Python for data analysis.");
            actionPlan.add("Practice data cleaning and visualization.");
            actionPlan.add("Build data analysis projects.");
            actionPlan.add("Practice analytical interview questions.");
        }

        // General software development
        else {

            String[] required = {
                    "java",
                    "sql",
                    "git",
                    "data structures"
            };

            for (String skill : required) {

                if (!skillText.contains(skill)) {
                    missingSkills.add(skill);
                }
            }

            highPriority.add("Programming Fundamentals");
            highPriority.add("Data Structures & Algorithms");
            highPriority.add("SQL");

            actionPlan.add("Choose one primary programming language.");
            actionPlan.add("Practice Data Structures & Algorithms.");
            actionPlan.add("Learn SQL.");
            actionPlan.add("Learn Git and GitHub.");
            actionPlan.add("Build practical software projects.");
        }

        // Calculate progress
        int totalRequired = currentSkills.size() + missingSkills.size();

        int progress = 0;

        if (totalRequired > 0) {
            progress = (currentSkills.size() * 100) / totalRequired;
        }

        model.addAttribute("targetRole", targetRole);
        model.addAttribute("skills", skills);
        model.addAttribute("currentSkills", currentSkills);
        model.addAttribute("missingSkills", missingSkills);
        model.addAttribute("highPriority", highPriority);
        model.addAttribute("actionPlan", actionPlan);
        model.addAttribute("progress", progress);

        return "skill-gap";
    }
}