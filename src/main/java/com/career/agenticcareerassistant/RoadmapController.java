package com.career.agenticcareerassistant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoadmapController {

    @GetMapping("/roadmap")
    public String roadmapPage() {
        return "roadmap";
    }

    @PostMapping("/roadmap/generate")
    public String generateRoadmap(
            @RequestParam("targetRole") String targetRole,
            @RequestParam("skills") String skills,
            Model model) {

        String role = targetRole.toLowerCase();
        String skillText = skills.toLowerCase();

        List<String> days30 = new ArrayList<>();
        List<String> days60 = new ArrayList<>();
        List<String> days90 = new ArrayList<>();

        if (role.contains("java") || skillText.contains("java")) {

            days30.add("Week 1: Revise Core Java and OOP concepts.");
            days30.add("Week 2: Practice Collections, Exception Handling and Strings.");
            days30.add("Week 3: Practice Java coding and basic DSA.");
            days30.add("Week 4: Learn SQL and database fundamentals.");

            days60.add("Month 2: Learn Spring Boot and dependency injection.");
            days60.add("Learn REST APIs, HTTP methods and JSON.");
            days60.add("Build a Spring Boot CRUD project.");
            days60.add("Learn Git and GitHub.");
            days60.add("Practice SQL queries and DSA.");

            days90.add("Month 3: Build a complete Java Spring Boot project.");
            days90.add("Add MySQL database integration.");
            days90.add("Create and test REST APIs.");
            days90.add("Prepare Core Java, SQL and Spring Boot interviews.");
            days90.add("Update resume and GitHub profile.");
            days90.add("Start applying for Java Developer and Backend roles.");

        } else if (role.contains("web")
                || role.contains("frontend")
                || role.contains("full stack")) {

            days30.add("Week 1: Strengthen HTML and CSS fundamentals.");
            days30.add("Week 2: Learn JavaScript fundamentals.");
            days30.add("Week 3: Practice DOM and browser events.");
            days30.add("Week 4: Build responsive web pages.");

            days60.add("Month 2: Learn APIs and asynchronous JavaScript.");
            days60.add("Learn Git and GitHub.");
            days60.add("Build 2 frontend projects.");
            days60.add("Learn database and backend basics.");

            days90.add("Month 3: Build a complete web application.");
            days90.add("Connect frontend with REST APIs.");
            days90.add("Improve responsive design.");
            days90.add("Deploy projects.");
            days90.add("Prepare for frontend or full-stack interviews.");

        } else if (role.contains("python")
                || skillText.contains("python")) {

            days30.add("Week 1: Revise Python fundamentals.");
            days30.add("Week 2: Learn functions, modules and OOP.");
            days30.add("Week 3: Practice Python data structures.");
            days30.add("Week 4: Learn SQL and database basics.");

            days60.add("Month 2: Learn Python backend development.");
            days60.add("Learn REST APIs.");
            days60.add("Learn Git and GitHub.");
            days60.add("Build a Python backend project.");

            days90.add("Month 3: Build a complete Python application.");
            days90.add("Integrate a database.");
            days90.add("Build and test REST APIs.");
            days90.add("Prepare Python and SQL interviews.");
            days90.add("Start applying for developer roles.");

        } else if (role.contains("data")
                || role.contains("analyst")
                || role.contains("analytics")) {

            days30.add("Week 1: Learn Excel and data cleaning.");
            days30.add("Week 2: Learn SQL basics.");
            days30.add("Week 3: Practice SQL queries and joins.");
            days30.add("Week 4: Learn Python basics for data analysis.");

            days60.add("Month 2: Learn Pandas and basic statistics.");
            days60.add("Learn data visualization.");
            days60.add("Build data analysis projects.");
            days60.add("Practice SQL interview questions.");

            days90.add("Month 3: Build a complete analytics project.");
            days90.add("Create dashboards and visualizations.");
            days90.add("Improve Excel, SQL and Python skills.");
            days90.add("Prepare for Data Analyst interviews.");
            days90.add("Start applying for entry-level roles.");

        } else {

            days30.add("Week 1: Choose one primary programming language.");
            days30.add("Week 2: Strengthen programming fundamentals.");
            days30.add("Week 3: Start Data Structures and Algorithms.");
            days30.add("Week 4: Learn SQL and Git basics.");

            days60.add("Month 2: Learn backend or frontend development.");
            days60.add("Build at least one practical project.");
            days60.add("Learn REST APIs.");
            days60.add("Practice DSA regularly.");

            days90.add("Month 3: Build 2 strong projects.");
            days90.add("Improve resume and GitHub profile.");
            days90.add("Practice technical and HR interviews.");
            days90.add("Start applying for suitable entry-level jobs.");
        }

        model.addAttribute("targetRole", targetRole);
        model.addAttribute("skills", skills);
        model.addAttribute("days30", days30);
        model.addAttribute("days60", days60);
        model.addAttribute("days90", days90);

        return "roadmap";
    }
}