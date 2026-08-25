package com.career.agenticcareerassistant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {

    @GetMapping("/projects")
    public String projectsPage() {
        return "projects";
    }

    @PostMapping("/projects/suggest")
    public String suggestProjects(
            @RequestParam("targetRole") String targetRole,
            @RequestParam("skills") String skills,
            Model model) {

        String role = targetRole.toLowerCase();
        String skillText = skills.toLowerCase();

        List<String> projectNames = new ArrayList<>();
        List<String> technologies = new ArrayList<>();
        List<String> difficulty = new ArrayList<>();
        List<String> learning = new ArrayList<>();
        List<String> resumeBenefits = new ArrayList<>();

        // JAVA
        if (role.contains("java") || skillText.contains("java")) {

            projectNames.add("Online Banking Management System");
            projectNames.add("Employee Management System");
            projectNames.add("E-Commerce Backend API");
            projectNames.add("Job Portal Application");

            technologies.add("Java");
            technologies.add("Spring Boot");
            technologies.add("MySQL");
            technologies.add("JPA / Hibernate");
            technologies.add("REST API");
            technologies.add("Git & GitHub");

            difficulty.add("Online Banking Management System - Intermediate");
            difficulty.add("Employee Management System - Beginner");
            difficulty.add("E-Commerce Backend API - Advanced");
            difficulty.add("Job Portal Application - Advanced");

            learning.add("Practice Java OOP and backend programming.");
            learning.add("Learn Spring Boot and REST API development.");
            learning.add("Work with MySQL and database relationships.");
            learning.add("Learn JPA / Hibernate.");
            learning.add("Understand real-world backend architecture.");

            resumeBenefits.add("Demonstrates Java backend development.");
            resumeBenefits.add("Shows database and API integration.");
            resumeBenefits.add("Provides strong project discussion for interviews.");
            resumeBenefits.add("Makes your GitHub profile stronger.");
        }

        // WEB
        else if (role.contains("web")
                || role.contains("frontend")
                || role.contains("full stack")) {

            projectNames.add("Portfolio Website");
            projectNames.add("Task Management Web App");
            projectNames.add("E-Commerce Website");
            projectNames.add("Job Portal Website");

            technologies.add("HTML");
            technologies.add("CSS");
            technologies.add("JavaScript");
            technologies.add("REST API");
            technologies.add("Database");
            technologies.add("Git & GitHub");

            difficulty.add("Portfolio Website - Beginner");
            difficulty.add("Task Management Web App - Intermediate");
            difficulty.add("E-Commerce Website - Advanced");
            difficulty.add("Job Portal Website - Advanced");

            learning.add("Learn responsive web development.");
            learning.add("Practice JavaScript and DOM.");
            learning.add("Learn API integration.");
            learning.add("Understand frontend and backend communication.");
            learning.add("Build responsive real-world applications.");

            resumeBenefits.add("Demonstrates frontend development.");
            resumeBenefits.add("Shows responsive UI skills.");
            resumeBenefits.add("Demonstrates API integration.");
            resumeBenefits.add("Provides strong visual projects for your portfolio.");
        }

        // PYTHON
        else if (role.contains("python")
                || skillText.contains("python")) {

            projectNames.add("Python Expense Tracker");
            projectNames.add("Student Management System");
            projectNames.add("REST API with Python");
            projectNames.add("Python Job Portal");

            technologies.add("Python");
            technologies.add("Flask / FastAPI");
            technologies.add("SQL");
            technologies.add("REST API");
            technologies.add("Git & GitHub");

            difficulty.add("Expense Tracker - Beginner");
            difficulty.add("Student Management System - Beginner");
            difficulty.add("REST API - Intermediate");
            difficulty.add("Job Portal - Advanced");

            learning.add("Strengthen Python programming.");
            learning.add("Learn backend API development.");
            learning.add("Practice SQL and databases.");
            learning.add("Learn API testing.");
            learning.add("Build practical Python applications.");

            resumeBenefits.add("Demonstrates Python development.");
            resumeBenefits.add("Shows API and database knowledge.");
            resumeBenefits.add("Provides practical backend experience.");
        }

        // DATA
        else if (role.contains("data")
                || role.contains("analyst")
                || role.contains("analytics")) {

            projectNames.add("Sales Data Analysis Dashboard");
            projectNames.add("Student Performance Analysis");
            projectNames.add("Customer Churn Analysis");
            projectNames.add("E-Commerce Data Dashboard");

            technologies.add("Python");
            technologies.add("Pandas");
            technologies.add("SQL");
            technologies.add("Excel");
            technologies.add("Data Visualization");

            difficulty.add("Student Performance Analysis - Beginner");
            difficulty.add("Sales Data Dashboard - Intermediate");
            difficulty.add("Customer Churn Analysis - Intermediate");
            difficulty.add("E-Commerce Data Dashboard - Advanced");

            learning.add("Learn data cleaning.");
            learning.add("Practice SQL queries.");
            learning.add("Learn Python Pandas.");
            learning.add("Practice data visualization.");
            learning.add("Understand analytical problem solving.");

            resumeBenefits.add("Demonstrates analytical skills.");
            resumeBenefits.add("Shows SQL and Python knowledge.");
            resumeBenefits.add("Provides data-driven project experience.");
        }

        // DEFAULT
        else {

            projectNames.add("Student Management System");
            projectNames.add("Library Management System");
            projectNames.add("Inventory Management System");
            projectNames.add("Online Banking System");

            technologies.add("Java");
            technologies.add("MySQL");
            technologies.add("HTML");
            technologies.add("CSS");
            technologies.add("JavaScript");
            technologies.add("Git & GitHub");

            difficulty.add("Student Management System - Beginner");
            difficulty.add("Library Management System - Beginner");
            difficulty.add("Inventory Management System - Intermediate");
            difficulty.add("Online Banking System - Intermediate");

            learning.add("Strengthen programming fundamentals.");
            learning.add("Learn database integration.");
            learning.add("Practice CRUD operations.");
            learning.add("Learn Git and GitHub.");
            learning.add("Build real-world applications.");

            resumeBenefits.add("Demonstrates practical programming.");
            resumeBenefits.add("Shows database skills.");
            resumeBenefits.add("Provides project experience for interviews.");
        }

        model.addAttribute("targetRole", targetRole);
        model.addAttribute("skills", skills);
        model.addAttribute("projectNames", projectNames);
        model.addAttribute("technologies", technologies);
        model.addAttribute("difficulty", difficulty);
        model.addAttribute("learning", learning);
        model.addAttribute("resumeBenefits", resumeBenefits);

        return "projects";
    }
}