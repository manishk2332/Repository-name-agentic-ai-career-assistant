package com.career.agenticcareerassistant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterviewController {

    @GetMapping("/interview")
    public String interviewPage() {
        return "interview";
    }

    @PostMapping("/interview/prepare")
    public String prepareInterview(
            @RequestParam("targetRole") String targetRole,
            @RequestParam("skills") String skills,
            Model model) {

        String role = targetRole.toLowerCase();
        String skillText = skills.toLowerCase();

        List<String> technicalQuestions = new ArrayList<>();
        List<String> hrQuestions = new ArrayList<>();
        List<String> importantTopics = new ArrayList<>();
        List<String> preparationTips = new ArrayList<>();

        // JAVA INTERVIEW
        if (role.contains("java") || skillText.contains("java")) {

            technicalQuestions.add("What are the main principles of OOP?");
            technicalQuestions.add("What is the difference between == and equals() in Java?");
            technicalQuestions.add("What is inheritance and how is it implemented in Java?");
            technicalQuestions.add("Difference between ArrayList and LinkedList?");
            technicalQuestions.add("Difference between HashMap and HashSet?");
            technicalQuestions.add("What is exception handling in Java?");
            technicalQuestions.add("What is the difference between checked and unchecked exceptions?");
            technicalQuestions.add("What is multithreading?");
            technicalQuestions.add("What is JDBC?");
            technicalQuestions.add("What is Spring Boot and why is it used?");

            importantTopics.add("Core Java");
            importantTopics.add("OOP Concepts");
            importantTopics.add("Collections Framework");
            importantTopics.add("Exception Handling");
            importantTopics.add("Multithreading");
            importantTopics.add("JDBC");
            importantTopics.add("SQL / MySQL");
            importantTopics.add("Spring Boot");
            importantTopics.add("REST APIs");
            importantTopics.add("Data Structures & Algorithms");

            preparationTips.add("Revise Core Java and OOP concepts daily.");
            preparationTips.add("Practice Java coding problems.");
            preparationTips.add("Prepare SQL queries and database concepts.");
            preparationTips.add("Understand your projects deeply.");
            preparationTips.add("Practice explaining your project in 2-3 minutes.");
        }

        // WEB DEVELOPMENT
        else if (role.contains("web")
                || role.contains("frontend")
                || role.contains("full stack")) {

            technicalQuestions.add("What is HTML and how is it structured?");
            technicalQuestions.add("What is the difference between class and id in CSS?");
            technicalQuestions.add("What is responsive web design?");
            technicalQuestions.add("What are JavaScript variables and functions?");
            technicalQuestions.add("What is the DOM?");
            technicalQuestions.add("What is an API?");
            technicalQuestions.add("What is REST API?");
            technicalQuestions.add("What are HTTP GET and POST methods?");

            importantTopics.add("HTML");
            importantTopics.add("CSS");
            importantTopics.add("JavaScript");
            importantTopics.add("Responsive Design");
            importantTopics.add("REST APIs");
            importantTopics.add("Git & GitHub");
            importantTopics.add("Database Basics");

            preparationTips.add("Build responsive web projects.");
            preparationTips.add("Practice JavaScript fundamentals.");
            preparationTips.add("Learn REST APIs.");
            preparationTips.add("Prepare your project explanation.");
        }

        // PYTHON
        else if (role.contains("python")
                || skillText.contains("python")) {

            technicalQuestions.add("What are Python data types?");
            technicalQuestions.add("Difference between list and tuple?");
            technicalQuestions.add("What is a dictionary in Python?");
            technicalQuestions.add("What is list comprehension?");
            technicalQuestions.add("What is exception handling in Python?");
            technicalQuestions.add("What is OOP in Python?");
            technicalQuestions.add("What is a virtual environment?");
            technicalQuestions.add("What are Python modules and packages?");

            importantTopics.add("Python Fundamentals");
            importantTopics.add("OOP");
            importantTopics.add("Data Structures");
            importantTopics.add("Exception Handling");
            importantTopics.add("SQL");
            importantTopics.add("REST APIs");
            importantTopics.add("Git & GitHub");

            preparationTips.add("Practice Python coding questions.");
            preparationTips.add("Strengthen OOP concepts.");
            preparationTips.add("Practice SQL.");
            preparationTips.add("Build Python projects.");
        }

        // DEFAULT
        else {

            technicalQuestions.add("Explain OOP concepts.");
            technicalQuestions.add("What are Data Structures?");
            technicalQuestions.add("What is a database?");
            technicalQuestions.add("What is SQL?");
            technicalQuestions.add("What is an API?");
            technicalQuestions.add("What is Git and GitHub?");
            technicalQuestions.add("Explain one of your projects.");
            technicalQuestions.add("What is the difference between frontend and backend?");

            importantTopics.add("Programming Fundamentals");
            importantTopics.add("OOP");
            importantTopics.add("Data Structures & Algorithms");
            importantTopics.add("DBMS");
            importantTopics.add("SQL");
            importantTopics.add("Computer Networks");
            importantTopics.add("Operating Systems");
            importantTopics.add("Git & GitHub");

            preparationTips.add("Practice coding problems regularly.");
            preparationTips.add("Prepare your academic projects.");
            preparationTips.add("Revise DBMS, OS and Networking basics.");
            preparationTips.add("Practice explaining your technical skills.");
        }

        // COMMON HR QUESTIONS
        hrQuestions.add("Tell me about yourself.");
        hrQuestions.add("Why do you want to join our company?");
        hrQuestions.add("What are your strengths?");
        hrQuestions.add("What is your biggest weakness?");
        hrQuestions.add("Where do you see yourself in 5 years?");
        hrQuestions.add("Why should we hire you?");
        hrQuestions.add("Tell me about a challenging project you worked on.");
        hrQuestions.add("How do you handle pressure?");
        hrQuestions.add("Are you comfortable working in a team?");
        hrQuestions.add("Why did you choose Computer Science?");

        model.addAttribute("targetRole", targetRole);
        model.addAttribute("skills", skills);
        model.addAttribute("technicalQuestions", technicalQuestions);
        model.addAttribute("hrQuestions", hrQuestions);
        model.addAttribute("importantTopics", importantTopics);
        model.addAttribute("preparationTips", preparationTips);

        return "interview";
    }
}